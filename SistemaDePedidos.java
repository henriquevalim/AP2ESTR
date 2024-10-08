
class SistemaDePedidos {
    private FilaDePedidosPendentes filaPendentes = new FilaDePedidosPendentes();
    private PilhaDePedidosCancelados pilhaCancelados = new PilhaDePedidosCancelados();

    public void adicionarNovoPedido(int id, String descricao) {
        filaPendentes.enqueue(id, descricao);
        System.out.println("Pedido adicionado: " + descricao);
    }

    public void atenderPedido() {
        Pedido atendido = filaPendentes.dequeue();
        if (atendido != null) {
            System.out.println("Pedido atendido: " + atendido.descricao);
        }
    }

    public void cancelarPedido() {
        Pedido cancelado = filaPendentes.dequeue();
        if (cancelado != null) {
            pilhaCancelados.push(cancelado.id, cancelado.descricao);
            System.out.println("Pedido cancelado: " + cancelado.descricao);
        }
    }

    public void restaurarPedido() {
        Pedido restaurado = pilhaCancelados.pop();
        if (restaurado != null) {
            filaPendentes.enqueue(restaurado.id, restaurado.descricao);
            System.out.println("Pedido restaurado: " + restaurado.descricao);
        }
    }

    public void imprimirPedidosPendentes() {
        filaPendentes.printQueue();
    }

    public void imprimirPedidosCancelados() {
        pilhaCancelados.printStack();
    }
}
