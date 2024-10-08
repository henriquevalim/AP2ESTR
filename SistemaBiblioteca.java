public class SistemaBiblioteca {
    private Biblioteca biblioteca = new Biblioteca();

    public void adicionarLivroNoInicio(int id, String titulo, String autor) {
        biblioteca.adicionarNoInicio(id, titulo, autor);
        System.out.println("Livro adicionado no início: " + titulo);
    }

    public void adicionarLivroNoFim(int id, String titulo, String autor) {
        biblioteca.adicionarNoFim(id, titulo, autor);
        System.out.println("Livro adicionado no fim: " + titulo);
    }

    public void removerPrimeiroLivro() {
        biblioteca.removerDoInicio();
    }

    public void removerUltimoLivro() {
        biblioteca.removerDoFim();
    }

    public void buscarLivroPorID(int id) {
        biblioteca.buscarPorID(id);
    }

    public void imprimirLivrosNaOrdemOriginal() {
        biblioteca.imprimirNaOrdemOriginal();
    }

    public void imprimirLivrosNaOrdemReversa() {
        biblioteca.imprimirNaOrdemReversa();
    }
}
