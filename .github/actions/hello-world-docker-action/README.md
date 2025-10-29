# Hello world docker action

Această acțiune afișează "Hello World" sau "Hello" + numele persoanei și setează `time` ca output.

## Inputs

### `who-to-greet`

Obligatoriu. Numele persoanei de salutat. Implicit "World".

## Outputs

### `time`

Timpul la care a rulat acțiunea.

## Exemplu de utilizare (în același repo)

```yaml
on: [push]

jobs:
  hello_world_job:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout
        uses: actions/checkout@v5
      - name: Hello world docker action
        id: hello
        uses: ./.github/actions/hello-world-docker-action
        with:
          who-to-greet: 'Mona the Octocat'
      - name: Get the output time
        run: echo "The time was ${{ steps.hello.outputs.time }}"
```
