import factory.*;
import model.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoFactoryTest {

    // Testes de criação

    @DisplayName("Deve criar um carro corretamente")
    @Test
    void deveCriarCarro() {
        VeiculoFactory factory = new CarroFactory();
        Veiculo veiculo = factory.criarVeiculo();

        assertNotNull(veiculo);
        assertEquals("Carro", veiculo.tipo());
    }

    @DisplayName("Deve criar uma moto corretamente")
    @Test
    void deveCriarMoto() {
        VeiculoFactory factory = new MotoFactory();
        Veiculo veiculo = factory.criarVeiculo();

        assertNotNull(veiculo);
        assertEquals("Moto", veiculo.tipo());
    }

    @DisplayName("Deve criar uma caminhão corretamente")
    @Test
    void deveCriarCaminhao() {
        VeiculoFactory factory = new CaminhaoFactory();
        Veiculo veiculo = factory.criarVeiculo();

        assertNotNull(veiculo);
        assertEquals("Caminhão", veiculo.tipo());
    }

    // Testes de tipo específico

    @Test
    void deveRetornarInstanciaDeCarro() {
        Veiculo veiculo = new CarroFactory().criarVeiculo();

        assertTrue(veiculo instanceof Carro);
    }

    @Test
    void deveRetornarInstanciaDeMoto() {
        Veiculo veiculo = new MotoFactory().criarVeiculo();

        assertTrue(veiculo instanceof Moto);
    }

    @Test
    void deveRetornarInstanciaDeCaminhao() {
        Veiculo veiculo = new CaminhaoFactory().criarVeiculo();

        assertTrue(veiculo instanceof Caminhao);
    }

    // Testes de comportamento

    @Test
    void metodoTipoNaoDeveRetornarNulo() {
        Veiculo veiculo = new CarroFactory().criarVeiculo();

        assertNotNull(veiculo.tipo());
    }

    @Test
    void metodoTipoDeveSerConsistente() {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo caminhao = new Caminhao();

        assertEquals("Carro", carro.tipo());
        assertEquals("Moto", moto.tipo());
        assertEquals("Caminhão", caminhao.tipo());
    }

    // Teste do fluxo da factory

    @Test
    void factoryDeveCriarObjetoSemErro() {
        VeiculoFactory factory = new CarroFactory();

        assertDoesNotThrow(factory::criarVeiculo);
    }
}