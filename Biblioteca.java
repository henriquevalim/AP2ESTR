
class Biblioteca {
    private Livro inicio;
    private Livro fim;

    public Biblioteca() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarNoInicio(int id, String titulo, String autor) {
        Livro novoLivro = new Livro(id, titulo, autor);
        if (inicio == null) {
            inicio = fim = novoLivro;
        } else {
            novoLivro.next = inicio;
            inicio.prev = novoLivro;
            inicio = novoLivro;
        }
    }

    public void adicionarNoFim(int id, String titulo, String autor) {
        Livro novoLivro = new Livro(id, titulo, autor);
        if (fim == null) {
            inicio = fim = novoLivro;
        } else {
            fim.next = novoLivro;
            novoLivro.prev = fim;
            fim = novoLivro;
        }
    }

    public void removerDoInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }
        System.out.println("Removido: " + inicio.titulo);
        inicio = inicio.next;
        if (inicio == null) fim = null;
        else inicio.prev = null;
    }

    public void removerDoFim() {
        if (fim == null) {
            System.out.println("A lista está vazia!");
            return;
        }
        System.out.println("Removido: " + fim.titulo);
        fim = fim.prev;
        if (fim == null) inicio = null;
        else fim.next = null;
    }

    public Livro buscarPorID(int id) {
        Livro atual = inicio;
        while (atual != null) {
            if (atual.id == id) {
                System.out.println("Livro encontrado: " + atual.titulo);
                return atual;
            }
            atual = atual.next;
        }
        System.out.println("Livro não encontrado!");
        return null;
    }

    public void imprimirNaOrdemOriginal() {
        Livro atual = inicio;
        while (atual != null) {
            System.out.println("Livro ID: " + atual.id + ", Título: " + atual.titulo);
            atual = atual.next;
        }
    }

    public void imprimirNaOrdemReversa() {
        Livro atual = fim;
        while (atual != null) {
            System.out.println("Livro ID: " + atual.id + ", Título: " + atual.titulo);
            atual = atual.prev;
        }
    }
}
