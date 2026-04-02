package factory;

import model.Moto;
import model.Veiculo;

public class MotoFactory extends VeiculoFactory {

    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}