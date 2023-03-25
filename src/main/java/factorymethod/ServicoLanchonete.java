package factorymethod;

public class ServicoLanchonete implements IServico {

    public String criar() {
        return "Lanchonete criada";
    }

    public String deletar() {
        return "Lanchonete deletada";
    }
}
