package biblioteca.com.model;

import biblioteca.com.status.StatusLivro;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int opcao;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Livro> emprestimos = new ArrayList<>();
    private StatusLivro statusLivro;

    // metodo para adicionar aluno
    public void adicionarAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        Aluno aluno = new Aluno(nome, curso , alunos.size() + 1);
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");

    }
    //metodo para adicionar livro
    public void adicionarLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o titulo do livro: ");
        String titulo = sc.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();
        Livro livro = new Livro(titulo, autor, "ISBN" + (livros.size() + 1));
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");

    }
    //metodo para emprestar livro
    public void emprestarLivro(){
        StatusLivro status = StatusLivro.Emprestado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do aluno: ");
        int idAluno = sc.nextInt();
        System.out.print("Digite o ISBN do livro: ");
        String isbnLivro = sc.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId() == idAluno) {
                alunoEncontrado = aluno;
                break;
            }else{
                System.out.println("Aluno nao encontrado.");
                return;
            }
        }
        Livro livroEncontrado = null;
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbnLivro)) {
                livroEncontrado = livro;
                break;
            }else {
                System.out.println("Livro nao encontrado.");
                return;
            }
        }
        if (alunoEncontrado != null && livroEncontrado != null){
            alunoEncontrado.emprestarLivro(livroEncontrado);
            System.out.println("Livro emprestado com sucesso!");
            livroEncontrado.setStatusLivro(status);
        }
        else {
            System.out.println("Aluno ou livro nao encontrado.");
        }


    }
    // metodo para devolver livro
    public void devolverLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do aluno: ");
        int idAluno = sc.nextInt();
        System.out.print("Digite o ISBN do livro: ");
        String isbnLivro = sc.nextLine();
        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId() == idAluno) {
                alunoEncontrado = aluno;
                break;
            }else{
                System.out.println("Aluno nao encontrado.");
                return;
            }
        }
        Livro livroEncontrado = null;
        for (Livro livro : livros){
            if (livro.getIsbn().equals(isbnLivro)){
                livroEncontrado = livro;
                break;
            }else {
                System.out.println("Livro nao encontrado.");
                return;
            }
        }

    }
    //metodo para listar alunos
    public void listarAlunos(){
        System.out.println("===== Lista de Alunos =====");
        for (Aluno aluno : alunos) {
            System.out.println("ID: " + aluno.getId() + ", Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso());
        }
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }
    //metodo para listar livros
    public void listarLivros() {
        System.out.println("===== Lista de Livros =====");
        for (Livro livro : livros) {
            if (livro.getStatusLivro() == null) {
                livro.setStatusLivro(StatusLivro.Disponivel);
            }else {
                livro.setStatusLivro(StatusLivro.Emprestado);
            }
            System.out.println("ISBN: " + livro.getIsbn() + ", Titulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Status: " + livro.getStatusLivro());
        }
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        }
    }


    public void menu(){
        do {
            System.out.println("===== Menu Biblioteca =====");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Adicionar Livro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Livros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a opcao desejada: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    adicionarLivro();
                    break;
                case 3:
                    emprestarLivro();
                    break;
                case 4:
                    // devolverLivro();
                    break;
                case 5:
                    listarAlunos();
                    break;
                case 6:
                    listarLivros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
        while (opcao!=7);

    }







}
