package factory;

import model.Caminhao;
import model.Veiculo;

public class CaminhaoFactory extends VeiculoFactory {

    @Override
    public Veiculo criarVeiculo() {
        return new Caminhao();
    }
}