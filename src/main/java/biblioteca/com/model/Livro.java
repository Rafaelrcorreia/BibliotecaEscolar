package biblioteca.com.model;

import biblioteca.com.status.StatusLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private StatusLivro statusLivro;

    public Livro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // getters and setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public StatusLivro getStatusLivro() {
        return statusLivro;
    }
    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }
}
