package model;

public class Caminhao implements Veiculo {

    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Caminhão");
    }

    @Override
    public String tipo() {
        return "Caminhão";
    }
}