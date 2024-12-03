# Projeto CRUD de Cadastro de Veículos

Este projeto consiste em uma aplicação CRUD para o cadastro de veículos, desenvolvida com **Java** e **Spring Boot**. A aplicação permite realizar operações de criação, leitura, atualização e exclusão (CRUD) de registros de veículos, utilizando boas práticas de desenvolvimento.

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **JPA/Hibernate**
- **H2 Database** (Banco de dados em memória)
- **Maven**

## Roteiro de Desenvolvimento

O desenvolvimento seguiu os passos abaixo, cada um representado por um commit:

1. **Criação do projeto Spring Boot com dependências:**
   - Dependências incluídas: Spring Web, Spring Data JPA, H2 Database, Validation, Lombok.

2. **Criação da entidade `Veiculo` e mapeamento com o banco de dados:**
   - Atributos da entidade:
     - `id` (Long)
     - `modelo` (String)
     - `marca` (String)
     - `ano` (Integer)
     - `valor` (Double)

3. **Criação do repositório para a entidade `Veiculo`:**
   - Interface `VeiculoRepository` estendendo `JpaRepository`.

4. **Criação do arquivo `data.sql` para popular o banco com 5 veículos iniciais:**
   - Exemplo de dados inseridos:
     ```sql
     INSERT INTO veiculo (id, modelo, marca, ano, valor) VALUES (1, 'Civic', 'Honda', 2020, 95000.00);
     INSERT INTO veiculo (id, modelo, marca, ano, valor) VALUES (2, 'Corolla', 'Toyota', 2021, 98000.00);
     ```

5. **Criação de DTOs e Mappers para a entidade `Veiculo`:**
   - DTOs:
     - `VeiculoRequestDTO` (entrada de dados)
     - `VeiculoResponseDTO` (saída de dados)

6. **Implementação do endpoint GET `/veiculos`:**
   - Retorna todos os veículos cadastrados.

7. **Implementação do endpoint DELETE `/veiculos/{id}`:**
   - Exclui um veículo pelo `id`.

8. **Implementação do endpoint POST `/veiculos`:**
   - Sem validação: Cadastra um veículo sem validações obrigatórias.

9. **Implementação do endpoint POST `/veiculos` com validação:**
   - Validações implementadas usando a anotação `@Valid` para os atributos dos DTOs.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/prova2-seunome.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd prova2-seunome
   ```

3. Compile e execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse o console H2 (opcional):
   - URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - Configurações:
     - Driver: `org.h2.Driver`
     - URL: `jdbc:h2:mem:testdb`
     - Usuário: `sa`
     - Senha: (vazio)

## Endpoints Disponíveis

### GET /veiculos
Retorna a lista de veículos cadastrados.

### DELETE /veiculos/{id}
Exclui um veículo pelo `id`.

### POST /veiculos
Cadastra um novo veículo:
- Sem validação (commit 8).
- Com validação (commit 9).
