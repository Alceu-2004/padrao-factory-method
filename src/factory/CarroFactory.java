package factory;

import model.Carro;
import model.Veiculo;

public class CarroFactory extends VeiculoFactory {

    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}