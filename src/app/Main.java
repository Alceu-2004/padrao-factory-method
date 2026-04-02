package app;

import factory.*;

public class Main {

    public static void main(String[] args) {

        VeiculoFactory factory;

        factory = new CarroFactory();
        factory.entregarVeiculo();

        factory = new MotoFactory();
        factory.entregarVeiculo();

        factory = new CaminhaoFactory();
        factory.entregarVeiculo();
    }
}