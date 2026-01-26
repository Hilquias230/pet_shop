package br.com.hilquias.main;

import br.com.hilquias.domain.BathMachine;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        BathMachine machine = new BathMachine();
        while (true) {
            System.out.println("---BEM-VINDO(A) A MÁQUINA DE BANHO DO PET-SHOP---");
            System.out.println("1 - DAR BANHO NO PET");
            System.out.println("2 - ABASTECER COM ÁGUA ");
            System.out.println("3 - ABASTECER COM SHAMPOO");
            System.out.println("4 - VERIFICARR NÍVEL DE ÁGUA");
            System.out.println("5 - VERIFICAR NÍVEL DE SAMPOO");
            System.out.println("6 - VERIFICAR SE TEM PET NO BANHO");
            System.out.println("7 - COLOCAR PET NA MÁQUINA");
            System.out.println("8 - RETIRAR PET DA MÁQUINA");
            System.out.println("9 - LIMPAR MÁQUINA");
            System.out.println("0 - SAIR");
            System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
            byte option = input.nextByte();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> machine.bath();
                case 2 -> machine.supplyWater();
                case 3 -> machine.suplyShampoo();
                case 4 -> machine.verifyWater();
                case 5 -> machine.verifySampoo();
                case 6 -> machine.verifyPet();
                case 7 -> machine.putPet();
                case 8 -> machine.removePet();
                case 9 -> machine.cleanMachine();
            }

        }
    }
}
