# Hello world JavaScript action

Această acțiune afișează "Hello World" sau "Hello" + numele persoanei de salutat în log.

## Inputs

### `who-to-greet`

**Obligatoriu** Numele persoanei de salutat. Valoarea implicită `"World"`.

## Outputs

### `time`

Timpul când te-am salutat.

## Exemplu de utilizare

```yaml
uses: actions/hello-world-javascript-action@e76147da8e5c81eaf017dede5645551d4b94427b
with:
  who-to-greet: Mona the Octocat
```

## Descriere

Această acțiune GitHub Actions este un exemplu simplu de acțiune JavaScript care:

1. Primește un input `who-to-greet` (obligatoriu)
2. Afișează un mesaj de salut în log
3. Returnează timpul curent ca output
4. Afișează payload-ul evenimentului care a declanșat workflow-ul

## Dezvoltare

Pentru a dezvolta și testa această acțiune local:

1. Clonează repository-ul
2. Rulează `npm install` pentru a instala dependențele
3. Rulează `npm run build` pentru a construi acțiunea
4. Testează acțiunea într-un workflow GitHub Actions

## Licență

MIT
