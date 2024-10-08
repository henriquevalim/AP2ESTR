
class PilhaDePedidosCancelados {
    private Pedido topo;

    public PilhaDePedidosCancelados() {
        this.topo = null;
    }

    public void push(int id, String descricao) {
        Pedido novoPedido = new Pedido(id, descricao);
        novoPedido.next = topo;
        topo = novoPedido;
    }

    public Pedido pop() {
        if (topo == null) {
            System.out.println("Pilha de pedidos cancelados está vazia!");
            return null;
        }
        Pedido pedidoCancelado = topo;
        topo = topo.next;
        return pedidoCancelado;
    }

    public void printStack() {
        Pedido atual = topo;
        if (atual == null) {
            System.out.println("Pilha de pedidos cancelados está vazia!");
            return;
        }
        while (atual != null) {
            System.out.println("Pedido ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.next;
        }
    }
}
