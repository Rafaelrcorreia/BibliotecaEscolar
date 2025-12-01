package biblioteca.com.model;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String curso;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Aluno(String nome, String curso, int id) {
        this.nome = nome;
        this.curso = curso;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }



}
