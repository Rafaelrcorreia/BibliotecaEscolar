# Biblioteca Escolar – Primeiro CRUD em Java (Console)

Este é o meu primeiro projeto de CRUD em Java, feito para praticar lógica de programação e orientação a objetos.

O sistema é um gerenciador simples de biblioteca escolar rodando no console, com cadastro de alunos e livros, empréstimo, devolução e listagem.

## Funcionalidades

- Cadastrar alunos (nome, curso, ID gerado automaticamente)
- Cadastrar livros (título, autor, ISBN numérico)
- Emprestar livros para alunos (ID do aluno + ISBN do livro)
- Devolver livros emprestados
- Listar alunos cadastrados
- Listar livros com status (Disponível ou Emprestado)

## Conceitos usados

- Java (JDK 21)
- Programação orientada a objetos:
  - Classes: `Aluno`, `Livro`, `Menu`, `MetodMenu`
  - Enum: `StatusLivro` (`Emprestado`, `Disponivel`)
- `ArrayList` para armazenar alunos e livros
- Menu interativo com `Scanner`, `switch` e `do/while`

## Como executar

1. Clone o repositório ou baixe o projeto.
2. Abra em uma IDE (ex.: IntelliJ IDEA).
3. Garanta que o JDK 17+ está configurado.
4. Rode a classe:
   - `biblioteca.com.main.BibliotecaApp`
5. Use o menu no console para testar as operações de CRUD.

## Próximos passos

- Adicionar persistência (salvar dados em arquivo ou banco)
- Melhorar validações (limites de empréstimos, buscas, etc.)
- Criar uma versão com interface gráfica ou API REST (Spring Boot)

---

Projeto criado como parte dos meus estudos em Java e para ser o meu primeiro CRUD no portfólio.
<img width="483" height="567" alt="image" src="https://github.com/user-attachments/assets/dea6768c-2a75-4a8b-8867-6417cb8c712c" />

