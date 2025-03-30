# Arquitetura de Sistema - AV3

Este repositório contém o código e os arquivos relacionados à avaliação AV3 de Arquitetura de Sistemas. O projeto implementa funcionalidades relacionadas ao gerenciamento de alunos, disciplinas, livros e matrículas, utilizando uma arquitetura modular baseada no padrão **MVC (Model-View-Controller)**.

## Estrutura do Projeto

Abaixo está a estrutura do projeto e uma breve descrição de cada diretório:

- **src/ConsumoApis**: Contém classes responsáveis por consumir APIs externas relacionadas a alunos, disciplinas e livros.
  - `ConsumidorAPIAluno.java`
  - `ConsumidorAPIDisciplina.java`
  - `ConsumidorAPILivro.java`

- **src/Controlador**: Contém os controladores que gerenciam a lógica de negócios do sistema.
  - `ControladorBiblioteca.java`
  - `ControladorDisciplina.java`
  - `ControladorEstudante.java`
  - `ControladorMatricula.java`
  - `ControladorMenu.java`

- **src/IniciarSistema**: Contém classes responsáveis por inicializar o sistema e seus componentes.
  - `InciadorMenu.java`
  - `InciadorVisao.java`
  - `IniciadorApi.java`
  - **Tipos**: Subdiretório com inicializadores específicos, como `IniciaAluno.java`, `IniciaDisciplina.java` e `IniciaLivro.java`.

- **src/Main**: Contém a classe principal para execução do sistema.
  - `Main.java`

- **src/Modelo**: Contém implementações de modelos para representar entidades do sistema.
  - `AlunoImplementador.java`
  - `BibliotecaImplementador.java`
  - `DisciplinaImplementador.java`
  - `LivroImplementador.java`
  - `MatriculaImplementador.java`

- **src/ModeloAbstrato**: Contém classes abstratas que definem a estrutura básica das entidades.
  - `Aluno.java`
  - `Biblioteca.java`
  - `Disciplina.java`
  - `Livro.java`
  - `Matricula.java`

- **src/Visao**: Contém classes responsáveis pela interface de visualização do sistema.
  - `VisaoBiblioteca.java`
  - `VisaoDisciplina.java`
  - `VisaoEstudante.java`
  - `VisaoMatricula.java`

- **src/ms**: Contém classes relacionadas a parsing de JSON e serviços para alunos, disciplinas e livros.
  - `JsonParser.java`
  - `JsonParserAlunos.java`
  - `JsonParserDisciplina.java`
  - `JsonParserLivros.java`
  - `ServicoDeAlunos.java`
  - `ServicoDeDisciplina.java`
  - `ServicoDeLivros.java`

- **src/org/json**: Contém classes utilitárias para manipulação de JSON.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada no desenvolvimento do projeto.
- **MVC (Model-View-Controller)**: Arquitetura utilizada para organizar a estrutura do sistema.
- **JSON**: Utilizado para manipulação e troca de dados estruturados.
- **APIs externas**: Consumo de APIs para obtenção de dados relacionados a alunos, disciplinas e livros.

## Como usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/203marcos/Arquitetura-de-Sistema-AV3.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd Arquitetura-de-Sistema-AV3
   ```

3. Compile o projeto (se estiver usando Java):
   ```bash
   javac src/Main/Main.java
   ```

4. Execute o projeto:
   ```bash
   java src.Main.Main
   ```

## Autor

**Marcos Dias**  
[GitHub](https://github.com/203marcos)

