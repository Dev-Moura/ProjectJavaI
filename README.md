# 📦 ProjectJavaI

Projeto desenvolvido em Java com foco em aprendizado de arquitetura em camadas utilizando Spring Boot. A aplicação simula uma estrutura CRUD completa com uso de DTOs, Services, Controllers, e testes automatizados com JUnit.

---

## 🛠 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Maven
- JUnit
- IDE: IntelliJ IDEA / Eclipse
- Git

---

## 📂 Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── MCHprojetoI/
│           └── project/
│               ├── Controller/
│               ├── DTO/
│               ├── Entity/
│               ├── Resources/
│               └── Service/
└── test/
    └── java/
        └── MCHprojetoI/
            └── project/
                └── PessoaTest.java
```

### 🧩 Camadas:

- **DTO:** Objetos de transferência de dados entre as camadas.
- **Entity:** Representação das entidades do sistema.
- **Service:** Lógica de negócio da aplicação.
- **Controller:** Camada responsável por lidar com as requisições HTTP.
- **Resources:** Pode conter configurações ou arquivos auxiliares.

---

## 🚀 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Dev-Moura/ProjectJavaI.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd ProjectJavaI
   ```

3. Compile e execute:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse no navegador:
   ```
   http://localhost:8080
   ```

---

## ✅ Testes

Os testes estão localizados em `src/test/java`. Para executá-los:

```bash
./mvnw test
```

---

## 🧠 Objetivo do Projeto

Este projeto tem como principal objetivo a prática dos conceitos de programação orientada a objetos e arquitetura de software, além da familiarização com ferramentas modernas do ecossistema Java.

---

## 👨‍💻 Autor

**Michael de Souza Moura**  
[GitHub](https://github.com/Dev-Moura)  
[LinkedIn](https://www.linkedin.com/in/michael-de-souza/)

---

## 📝 Licença

Este projeto está sob a licença MIT.
