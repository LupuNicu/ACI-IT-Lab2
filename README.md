# OnlineLibrary - Proiect Java cu GitHub Actions

Acest proiect demonstrează cum să configurezi un workflow GitHub Actions pentru un proiect Java cu Maven.

## 🚀 Caracteristici

- **Spring Boot 3.4.3** - Framework modern pentru aplicații Java
- **Maven** - Management dependențe și build
- **GitHub Actions** - CI/CD automatizat
- **Java 17** - Versiune LTS stabilă

## 📁 Structura Proiectului

```
src/
├── main/java/org/example/onlinelibrary/
│   ├── OnlineLibraryApplication.java    # Aplicația principală Spring Boot
│   ├── Library.java                     # Entitatea bibliotecă
│   ├── Book.java                        # Entitatea carte
│   └── Author.java                      # Entitatea autor
└── test/java/org/example/onlinelibrary/
    └── OnlineLibraryApplicationTests.java # Teste unitare
```

## 🔧 GitHub Actions Workflow

Workflow-ul este configurat în `.github/workflows/maven.yml` și include:

### ✅ Funcționalități CI/CD

1. **Trigger automat** - Rulează la push și pull requests pe branch-urile `main` și `master`
2. **Setup Java 17** - Configurează JDK cu Temurin distribution
3. **Caching Maven** - Cache-ază dependențele pentru build-uri mai rapide
4. **Build & Test** - Compilează codul și rulează testele
5. **Packaging** - Generează JAR-uri executabile
6. **Upload Artifacts** - Salvează JAR-urile ca artifacts pentru 30 de zile

### 🎯 Pași Workflow

```yaml
- Checkout code          # Descarcă codul
- Setup JDK 17          # Configurează Java
- Build with Maven       # Compilează proiectul
- Run tests             # Rulează testele
- Package application   # Generează JAR-uri
- Upload artifacts      # Salvează artifacts
```

## 🛠️ Cum să Rulezi Local

```bash
# Clonează repository-ul
git clone <your-repo-url>
cd OnlineLibrary

# Compilează proiectul
mvn clean compile

# Rulează testele
mvn test

# Generează JAR-ul
mvn package

# Rulează aplicația
java -jar target/onlinelibrary-0.0.1-SNAPSHOT.jar
```

## 📦 Artifacts Generate

Workflow-ul generează următoarele artifacts:
- `onlinelibrary-0.0.1-SNAPSHOT.jar` - JAR executabil Spring Boot
- Retenție: 30 de zile

## 🔍 Verificare Workflow

Pentru a verifica că workflow-ul funcționează:

1. **Push la repository** - Workflow-ul se va declanșa automat
2. **Verifică Actions tab** - Vezi status-ul build-ului
3. **Download artifacts** - Descarcă JAR-urile generate
4. **Verifică logs** - Analizează output-ul pentru erori

## 🎓 Tutorial GitHub Actions

Acest proiect urmează [tutorialul oficial GitHub Actions pentru Java cu Maven](https://docs.github.com/en/actions/tutorials/build-and-test-code/java-with-maven).

### Concepte Învățate

- ✅ Configurare workflow YAML
- ✅ Setup Java cu actions/setup-java
- ✅ Caching dependențe Maven
- ✅ Build și testare automatizată
- ✅ Upload artifacts
- ✅ Trigger-uri pentru push/PR

## 🚀 Următorii Pași

Pentru a extinde workflow-ul, poți adăuga:

- **Deployment** - Deploy automat la cloud
- **Code Quality** - SonarQube, Checkstyle
- **Security Scanning** - Dependabot, Snyk
- **Multi-environment** - Staging, Production
- **Notifications** - Slack, Email alerts

## 📚 Resurse

- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Maven Documentation](https://maven.apache.org/guides/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Java 17 Documentation](https://docs.oracle.com/en/java/javase/17/)
