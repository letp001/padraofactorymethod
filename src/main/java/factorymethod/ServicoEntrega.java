package factorymethod;

public class ServicoEntrega implements IServico {

    public String criar() {
        return "Entrega criada";
    }

    public String deletar() {
        return "Entrega deletada";
    }
}
