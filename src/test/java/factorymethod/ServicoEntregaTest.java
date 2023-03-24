package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoEntregaTest {

    @Test
    void deveCriarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega criada", servico.criar());
    }

    @Test
    void deveDeletarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega deletada", servico.deletar());
    }
}

