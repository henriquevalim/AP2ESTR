public class Main {
    public static void main(String[] args) {
        // Testando o sistema de pedidos (fila e pilha)
        SistemaDePedidos sistemaDePedidos = new SistemaDePedidos();

        // Adicionar pedidos
        System.out.println("---- Adicionando Pedidos ----");
        sistemaDePedidos.adicionarNovoPedido(1, "Café Expresso");
        sistemaDePedidos.adicionarNovoPedido(2, "Capuccino");
        sistemaDePedidos.adicionarNovoPedido(3, "Mocha");

        // Imprimir pedidos pendentes
        System.out.println("---- Pedidos Pendentes ----");
        sistemaDePedidos.imprimirPedidosPendentes();

        // Atender o pedido mais antigo
        System.out.println("---- Atendendo Pedido ----");
        sistemaDePedidos.atenderPedido();

        // Cancelar o próximo pedido
        System.out.println("---- Cancelando Pedido ----");
        sistemaDePedidos.cancelarPedido();

        // Imprimir pedidos pendentes e cancelados
        System.out.println("---- Pedidos Pendentes ----");
        sistemaDePedidos.imprimirPedidosPendentes();
        System.out.println("---- Pedidos Cancelados ----");
        sistemaDePedidos.imprimirPedidosCancelados();

        // Restaurar o último pedido cancelado
        System.out.println("---- Restaurando Pedido ----");
        sistemaDePedidos.restaurarPedido();
        sistemaDePedidos.imprimirPedidosPendentes();

        // Testando o sistema de biblioteca (lista duplamente ligada)
        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();

        // Adicionar livros no início e fim
        System.out.println("---- Adicionando Livros ----");
        sistemaBiblioteca.adicionarLivroNoInicio(101, "O Senhor dos Anéis", "J.R.R. Tolkien");
        sistemaBiblioteca.adicionarLivroNoFim(102, "1984", "George Orwell");
        sistemaBiblioteca.adicionarLivroNoFim(103, "A Revolução dos Bichos", "George Orwell");

        // Imprimir os livros na ordem original
        System.out.println("---- Livros na Ordem Original ----");
        sistemaBiblioteca.imprimirLivrosNaOrdemOriginal();

        // Remover o primeiro livro
        System.out.println("---- Removendo Primeiro Livro ----");
        sistemaBiblioteca.removerPrimeiroLivro();
        sistemaBiblioteca.imprimirLivrosNaOrdemOriginal();

        // Buscar livro por ID
        System.out.println("---- Buscando Livro por ID ----");
        sistemaBiblioteca.buscarLivroPorID(102);

        // Imprimir livros na ordem inversa
        System.out.println("---- Livros na Ordem Reversa ----");
        sistemaBiblioteca.imprimirLivrosNaOrdemReversa();
    }
}
