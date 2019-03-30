# escolalura
Projeto do curso Java e MongoDB

### Springboot para criar a aplicação
[Springboot](http://start.spring.io/)

Group: br.com.alura.escolalura

artifact : escolalura

dependências: Thymeleft, Dev tools e Web.

Generate Project: importar como Maven Project

### Adicionar o driver mongodb-driver no pom
```
<dependency>
    <groupId>org.mongodb</groupId>
    <artifactId>mongodb-driver</artifactId>
    <version>3.5.0</version>
</dependency>
```

### Rodar o projeto
Classe EscolaluraApplication possui o projeto main p/ rodar como Java Application. O SpringBoot não precisa de um servidor para ser executado. O mesmo já vem preparado com um contêiner pré-configurado para executar o projeto.

```
@SpringBootApplication
public class EscolaluraApplication 
```

### Página do projeto
[http://localhost:8080](http://localhost:8080/)

### Deixar a aplicação mais elegante visualmente
[Materialize](http://materializecss.com/) 

descompactá-lo e copiar sua pasta para resources/static

### Spring MVC

- Como estamos utilizando o SpringMVC, precisaremos estar atentos a um detalhe: todos os atributos das classes necessitam dos getters e setters, pois o framework os utilizará quando necessário, para capturar ou inserir o nome do aluno em um formulário, por exemplo. 

### Thymeleaf: template engine do Spring, responsável por esta relação do HTML com os objetos Java
Uso dos atributos th:field="*{contato.endereco}" para relacionar os campos do form com o objeto 





