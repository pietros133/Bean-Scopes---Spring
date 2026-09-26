# Bean Scopes - Spring

Projeto desenvolvido para praticar **Bean Scopes e Dependency Injection no Spring Framework**.

## Tecnologias

* Java 17
* Spring Boot 4.1.1
* Spring Framework
* Maven

## Conceitos praticados

### Singleton

O escopo padrão do Spring.

Uma única instância do Bean é criada e reutilizada pelo `ApplicationContext`.

```java
@Service
public class PaymentService {
}
```

### Prototype

Uma nova instância é criada cada vez que o Bean é solicitado ao container.

```java
@Service
@Scope("prototype")
public class PaymentService {
}
```

### Dependency Injection

O projeto também demonstra Constructor Injection entre `CheckoutService` e `PaymentService`.

```text
CheckoutService
       ↓
PaymentService
```

O Spring identifica a dependência e realiza a injeção automaticamente.

## Scopes estudados

* Singleton
* Prototype
* Request
* Session
* Application
* WebSocket

Neste projeto foram testados principalmente `singleton` e `prototype` para observar na prática a diferença entre instâncias.

## Objetivo

Projeto criado como parte dos meus estudos de **Spring Core**, com foco em entender como o container do Spring gerencia Beans, dependências e seus ciclos de vida.

---

**Autor:** Pietro Santos Miranda
