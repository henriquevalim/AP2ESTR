
class FilaDePedidosPendentes {
    private Pedido inicio;
    private Pedido fim;

    public FilaDePedidosPendentes() {
        this.inicio = null;
        this.fim = null;
    }

    public void enqueue(int id, String descricao) {
        Pedido novoPedido = new Pedido(id, descricao);
        if (fim == null) {
            inicio = fim = novoPedido;
        } else {
            fim.next = novoPedido;
            fim = novoPedido;
        }
    }

    public Pedido dequeue() {
        if (inicio == null) {
            System.out.println("Fila de pedidos pendentes está vazia!");
            return null;
        }
        Pedido pedidoAtendido = inicio;
        inicio = inicio.next;
        if (inicio == null) fim = null;
        return pedidoAtendido;
    }

    public void printQueue() {
        Pedido atual = inicio;
        if (atual == null) {
            System.out.println("Fila de pedidos pendentes está vazia!");
            return;
        }
        while (atual != null) {
            System.out.println("Pedido ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.next;
        }
    }
}
