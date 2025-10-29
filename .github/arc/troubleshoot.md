# Troubleshoot – Actions Runner Controller

Simptome comune și soluții:

- Job-urile rămân "queued" pe labeluri self-hosted
  - Verifică: runnerii sunt online? `kubectl get pods -n actions-runner-system`
  - Verifică labelurile runnerilor corespund `runs-on` din workflow

- Controller nu pornește / crashloop
  - Verifică secretul `controller-manager` (cheia privată validă, App/Installation ID corecte)
  - Logs: `kubectl logs deploy/arc-actions-runner-controller -n actions-runner-system`

- RunnerScaleSet nu creează Pods
  - Verifică CRD-urile instalate, resursa `RunnerScaleSet` aplicată corect
  - Verifică `spec.githubConfigUrl` și `githubConfigSecret`

Resurse doc:
- https://docs.github.com/en/actions/tutorials/use-actions-runner-controller/troubleshoot
