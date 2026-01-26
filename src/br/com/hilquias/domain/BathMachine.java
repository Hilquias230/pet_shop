package br.com.hilquias.domain;

public class BathMachine {
    private int water = 30;
    private int shampoo = 10;
    private boolean isPet;
    private boolean isDirty;

    public void bath () {
        if (!isPet) {
            System.out.println("O pet não está na máquina");
        } else {
            water -= 10;
            shampoo -= 2;
            System.out.println("Dando banho no pet...");
        }
    }
    public void supplyWater () {
        if (water == 30) {
            System.out.println("Máquina já está abastecida com água.");
        } else {
            water += 2;
        }
    }
    public void suplyShampoo () {
        if (shampoo == 10) {
            System.out.println("A máquina já está abastecida com shampoo");
        } else {
            shampoo += 2;
        }
    }
    public void verifyWater () {
        System.out.printf("NÍVEL DISPONÍVEL: %s LITROS \n", water);
    }
    public void verifySampoo () {
        System.out.printf("NÍVEL DISPONÍVEL DO SHAMPOO: %s LITROS \n", shampoo);
    }
    public void verifyPet () {
        if (!isPet) {
            System.out.println("O pet não está no banho.");
        } else {
            System.out.println("O pet está no banho.");
        }
    }
    public void putPet () {
        if (isPet) {
            System.out.println("O pet está já foi colocado na máquina");
        } else {
            isPet = true;
            System.out.println("O pet foi colocado na máquina");
        }
    }
    public void removePet () {
        if (!isPet) {
            System.out.println("O pet já foi retirado da máquina.");
        } else {
            isPet = false;
            isDirty = true;
        }
    }
    public void cleanMachine () {
        if (!isDirty) {
            System.out.println("A máquina não está suja.");
        } else {
            isDirty = false;
            water -= 3;
            shampoo -= 1;
            System.out.println("Você limpou a máquina");
        }
    }

}
