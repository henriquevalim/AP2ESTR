
class Livro {
    int id;
    String titulo;
    String autor;
    Livro prev;
    Livro next;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prev = null;
        this.next = null;
    }
}
