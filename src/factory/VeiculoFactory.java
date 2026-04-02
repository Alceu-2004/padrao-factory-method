package factory;

import model.Veiculo;

public abstract class VeiculoFactory {

    public abstract Veiculo criarVeiculo();

    public void entregarVeiculo() {
        Veiculo veiculo = criarVeiculo();
        veiculo.exibirInfo();
    }
}