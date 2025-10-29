# Authenticate to the API – ARC

Pași (rezumat):

1) Creează un GitHub App (la nivel de org sau user):
   - Permissions: Actions (Read/Write), Metadata (Read-only)
   - Subscribe events: none
   - Generate Private Key (salvează `.pem`)
   - Notează App ID și (dacă e cazul) Installation ID

2) Creează secretul în cluster pentru ARC (în `actions-runner-system`):

```bash
kubectl create secret generic controller-manager \
  --namespace actions-runner-system \
  --from-literal=github_app_id="APP_ID" \
  --from-literal=github_app_installation_id="INSTALLATION_ID" \
  --from-file=github_app_private_key=PATH_CHEIE_PRIVATA.pem
```

3) Instalează ARC cu Helm folosind `controller-values.yaml`:

```bash
helm repo add actions-runner-controller https://actions-runner-controller.github.io/actions-runner-controller
helm repo update
helm upgrade --install arc actions-runner-controller/actions-runner-controller \
  -n actions-runner-system --create-namespace \
  -f .github/arc/controller-values.yaml
```

Documentație: https://docs.github.com/en/actions/tutorials/use-actions-runner-controller/authenticate-to-the-api
