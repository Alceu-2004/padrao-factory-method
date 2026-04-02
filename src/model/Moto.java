package model;

public class Moto implements Veiculo {

    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Moto");
    }

    @Override
    public String tipo() {
        return "Moto";
    }
}