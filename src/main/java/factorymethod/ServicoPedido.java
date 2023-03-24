package factorymethod;

public class ServicoPedido implements IServico {

    public String criar() {
        return "Pedido criado";
    }

    public String deletar() {
        return "Pedido deletado";
    }
}
