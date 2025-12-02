package biblioteca.com.model;

import biblioteca.com.status.StatusLivro;

import java.util.ArrayList;
import java.util.Scanner;

public class metodMenu {
    protected final Scanner scanner = new Scanner(System.in);
    protected int opcao = 0;
    protected ArrayList<Aluno> alunos = new ArrayList<>();
    protected ArrayList<Livro> livros = new ArrayList<>();
    protected ArrayList<Livro> emprestimos = new ArrayList<>();
    protected StatusLivro statusLivro;
    // metodo para adicionar aluno

    public void adicionarAluno(){
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
        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, livros.size() + 1);
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");

    }
    //metodo para emprestar livro
    public void emprestarLivro(){

        System.out.print("Digite o ID do aluno: ");
        int idAluno = scanner.nextInt();
        System.out.print("Digite o ISBN do livro: ");
        int isbnLivro = scanner.nextInt();
        scanner.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId() == idAluno) {
                alunoEncontrado = aluno;
                break;
            }
        }

        Livro livroEncontrado = null;
        for (Livro livro : livros){
            if (livro.getIsbn() == (isbnLivro)){
                livroEncontrado = livro;
                break;
            }else {
                System.out.println("Livro nao encontrado.");
                return;
            }
        }

        if (livroEncontrado != null && livroEncontrado.getStatusLivro() == StatusLivro.Emprestado) {
            System.out.println("Livro ja esta emprestado.");
            return;
        }
        if (alunoEncontrado != null && livroEncontrado != null){
            alunoEncontrado.emprestarLivro(livroEncontrado);
            System.out.println("Livro emprestado com sucesso!");
            livroEncontrado.setStatusLivro(StatusLivro.Emprestado);
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno nao encontrado.");
        }
        if (livroEncontrado == null) {
            System.out.println("Livro nao encontrado.");
        }


    }
    // metodo para devolver livro
    public void devolverLivro(){
        System.out.print("Digite o ID do aluno: ");
        int idAluno = scanner.nextInt();
        System.out.print("Digite o ISBN do livro: ");
        int isbnLivro = scanner.nextInt();
        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId() == idAluno) {
                alunoEncontrado = aluno;
                break;
            }
        }
        Livro livroEncontrado = null;
        for (Livro livro : livros){
            if (livro.getIsbn() == isbnLivro){
                livroEncontrado = livro;
                break;
            }else {
                System.out.println("Livro nao encontrado.");
                return;
            }
        }
        if (livroEncontrado != null && alunoEncontrado != null){
            alunoEncontrado.getLivrosEmprestados().remove(livroEncontrado);
            System.out.println("Livro devolvido com sucesso!");
            livroEncontrado.setStatusLivro(StatusLivro.Disponivel);
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno nao encontrado.");
        }
        if (livroEncontrado == null) {
            System.out.println("Livro nao encontrado.");
        }
        if (livroEncontrado != null && livroEncontrado.getStatusLivro() == StatusLivro.Disponivel) {
            System.out.println("Livro ja esta disponivel na biblioteca.");
        }


    }
    //metodo para listar alunos
    public void listarAlunos(){
        System.out.println("===== Lista de Alunos =====");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            System.out.println("ID: " + aluno.getId() + ", Nome: " + aluno.getNome() + ", Curso: " + aluno.getCurso());
        }
    }
    //metodo para listar livros
    public void listarLivros() {
        System.out.println("===== Lista de Livros =====");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        }
        for (Livro livro : livros) {
        if (livro.getStatusLivro() == null) {
            livro.setStatusLivro(StatusLivro.Disponivel);
        }

            System.out.println("ISBN: " + livro.getIsbn() + ", Titulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Status: " + livro.getStatusLivro());
        }
    }
}
