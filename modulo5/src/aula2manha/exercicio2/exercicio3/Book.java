package modulo5.src.aula2manha.exercicio2.exercicio3;

public class Book {
    private String titulo;
    private String isbn;
    private String autor;

    public Book() {
    }

    public Book(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestimo(int dias) {
        System.out.println("Você emprestou o livro " + this + " por " + dias + " dias");
    }

    public void devolver() {
        System.out.println("Você devolveu o livro " + this);
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }

    // Acusa erro porque não existe o método tostring (com todas as letras minúsculas nas classes de maior hierarquia
    // @Override
    // public String tostring() {
    //    return this.titulo + ", " + this.isbn + ", " + this.autor;
    // }
}

class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "987498238724987", "Rowling, J. K.");
        book.emprestimo(5);
        book.devolver();
        System.out.println(book);
    }
}
