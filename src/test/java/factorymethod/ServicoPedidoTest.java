package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPedidoTest {

    @Test
    void deveCriarPedido() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido criado", servico.criar());
    }

    @Test
    void deveDeletarPedido() {
        IServico servico = ServicoFactory.obterServico("Pedido");
        assertEquals("Pedido deletado", servico.deletar());
    }
}