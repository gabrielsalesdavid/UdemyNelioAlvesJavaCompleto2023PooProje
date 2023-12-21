package br.com.generics.estruturacondicional;

import java.util.Scanner;

public class LogicaDeProgramacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, registra, univer, disc1, disc2, disc3, disc4, disc5, disc6, pergunt;
        double noteDisc1, noteDisc2, noteDisc3, noteDisc4, noteDisc5, noteDisc6,
                noteBi1, noteBi2, noteSe1, noteSe2, result;
        char approved;

        System.out.println("Digite o seu nome completo: ");
        name = sc.nextLine();
        System.out.println("Digite a sua matricula da universidade: ");
        registra = sc.nextLine();
        System.out.println("Digite o nome da instituicao de ensino: ");
        univer = sc.nextLine();

        if (univer.equals("Cruzeiro do Sul") || univer.equals("cruzeiro do sul")) {
            System.out.println("Digite o bimestre: ");
            pergunt = sc.nextLine();
            if (pergunt.equals("Primeiro bimestre") || pergunt.equals("primeiro bimestre")) {
                System.out.println("Digite a disciplina: ");
                disc1 = sc.nextLine();
                if (disc1.equals("Matematica aplicada") || disc1.equals("matematica aplicada")) {
                    System.out.println("Digite a nota da disciplina conrespondente: ");
                    noteDisc1 = sc.nextDouble();
                    noteBi1 = (noteDisc1 * 2) / 2;
                    if (noteBi1 == 7 || noteBi1 >= 7) {
                        approved = 'Y';
                        if (approved == 'Y') {
                            System.out.println(name + ".\nA sua nota do bimestre e de : " + noteBi1 + ".\nDisciplina: "
                                    + disc1 + ".\nVoce esta aprovado no primeiro bimestre!");
                        }
                    } else if (noteBi1 <= 6 || noteBi1 == 6) {
                        System.out.println(name + ".\nA sua nota do bimestre e de: " + noteBi1 + ".\nDisciplina: "
                                + disc1 + ".\nVoce nao esta aprovado no primeiro bimestre" +
                                ".\nVoce tera que realizar a prova de recupercao para evitar uma DP!");
                    }
                }
            }
            if (pergunt.equals("Segundo bimestre") || pergunt.equals("segundo bimestre")) {
                System.out.println("Digite a disciplina: ");
                disc1 = sc.nextLine();
                if (disc1.equals("Matematica aplicada") || disc1.equals("matematica aplicada")) {
                    System.out.println("Digite a nota da disciplina conrespondante: ");
                    noteDisc1 = sc.nextDouble();
                    noteBi2 = (noteDisc1 * 2) / 2;
                    if (noteBi2 >= 7 || noteBi2 == 7) {
                        approved = 'Y';
                        if (approved == 'Y') {
                            System.out.println(name + ".\nA sua nota do bimestre e de: " + noteBi2 + ".\nDisciplina: "
                                    + disc1 + ".\nVoce esta aprovadono no segundo bimestre!");
                        }
                    } else if (noteBi2 <= 6 || noteBi2 == 6) {
                        System.out.println(name + ".\nA sua nota do bimestre e de: " + noteBi2 + ".\nDisciplina: " +
                                disc1 + ".\nVoce nao esta aprovado no segundo bimestre!" +
                                ".\nVoce tera que realizar a prova de recuperacao para evitar uma DP");
                    }
                }
            }
        }
        sc.close();
    }
}