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

<img width="544" height="714" alt="Captura de tela 2025-12-02 095319" src="https://github.com/user-attachments/assets/1d1a43ab-b6f0-4d59-b9c9-1c6e575f48d1" />
<img width="847" height="664" alt="Captura de tela 2025-12-02 095338" src="https://github.com/user-attachments/assets/66cd6c1c-5503-4e7e-976e-9ec22c92dd3d" />
<img width="845" height="684" alt="Captura de tela 2025-12-02 095346" src="https://github.com/user-attachments/assets/c8b7d6bc-d210-4575-a935-ac7c275409ed" />
<img width="839" height="712" alt="Captura de tela 2025-12-02 095356" src="https://github.com/user-attachments/assets/3cbf12ee-0f1e-44fc-8375-8436dc9e85be" />

