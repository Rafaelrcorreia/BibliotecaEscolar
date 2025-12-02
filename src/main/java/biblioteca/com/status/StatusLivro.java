package biblioteca.com.status;

public enum StatusLivro {
    Emprestado("Emprestado"),
    Disponivel("Disponivel");

    private final String status;

    StatusLivro(String status) {
        this.status = status;
    }

    public void setStatus() {

    }


}
