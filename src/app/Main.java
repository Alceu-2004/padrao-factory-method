package app;

import factory.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Sistema de Veículos ===");

        VeiculoFactory factory;

        factory = new CarroFactory();
        factory.entregarVeiculo();

        factory = new MotoFactory();
        factory.entregarVeiculo();

        factory = new CaminhaoFactory();
        factory.entregarVeiculo();
    }
}