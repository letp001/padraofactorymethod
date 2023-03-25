package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLanchoneteTest {

    @Test
    void deveCriarLanchonete() {
        IServico servico = ServicoFactory.obterServico("Lanchonete");
        assertEquals("Lanchonete criada", servico.criar());
    }

    @Test
    void deveDeletarLanchonete() {
        IServico servico = ServicoFactory.obterServico("Lanchonete");
        assertEquals("Lanchonete deletada", servico.deletar());
    }
}