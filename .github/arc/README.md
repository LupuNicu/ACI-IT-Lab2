# Actions Runner Controller (ARC) – setul de fișiere pentru tutorial

Acest director conține resurse pentru parcurgerea celor 5 părți din „Use Actions Runner Controller”:

- Quickstart
- Authenticate to the API
- Deploy runner scale sets
- Use ARC in a workflow
- Troubleshoot

Documentație oficială: https://docs.github.com/en/actions/tutorials/use-actions-runner-controller

Atenție: aceste fișiere sunt exemple orientative pentru raport și pentru a-ți ghida instalarea într-un cluster Kubernetes. Ele NU pornesc ARC din GitHub Actions; instalarea efectivă se face din terminalul tău cu `kubectl`/`helm` pe cluster.

Ce conține:
- `namespace.yaml`: creează namespace-ul `actions-runner-system`.
- `controller-values.yaml`: valori helm exemplu pentru instalarea ARC (completat cu placeholders).
- `runner-scale-set.yaml`: exemplu de Runner Scale Set care atașează labeluri pentru a fi folosite în workflow-uri.
- `auth.md`: pașii pentru autentificarea ARC la GitHub (App + secret).
- `troubleshoot.md`: probleme frecvente și remedieri.
