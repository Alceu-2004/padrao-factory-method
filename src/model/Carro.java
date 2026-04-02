package model;

public class Carro implements Veiculo {

    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Carro");
    }

    @Override
    public String tipo() {
        return "Carro";
    }
}