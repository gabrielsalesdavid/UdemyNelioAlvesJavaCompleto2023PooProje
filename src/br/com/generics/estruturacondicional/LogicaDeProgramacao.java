package br.com.generics.estruturacondicional;

import java.util.Scanner;

public class LogicaDeProgramacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, registra, univer, disc1, disc2, disc3, disc4, disc5, disc6, pergunt;
        double noteDisc1, noteDisc2, noteDisc3, noteDisc4, noteDisc5, noteDisc6,
                noteBi1, noteBi2, noteSe1, noteSe2, result;
        char approved;
        boolean app;

        System.out.println("Digite o seu nome completo: ");
        name = sc.nextLine();
        System.out.println("Digite a sua matricula da universidade: ");
        registra = sc.nextLine();
        System.out.println("Digite o nome da instituicao de ensino: ");
        univer = sc.nextLine();

        if (univer.equals("Cruzeiro do Sul") || univer.equals("cruzeiro do sul")) {
            System.out.println("Digite o bimestre: ");
            pergunt = sc.nextLine();
            if (pergunt.equals("Primeiro Bimestre") || pergunt.equals("primeiro bimestre")) {
                System.out.println("Digite a primeira disciplina: ");
                disc1 = sc.nextLine();
                if (disc1.equals("Matematica Aplicada") || disc1.equals("matematica aplicada")) {
                    System.out.println("Digite a nota da primeira disciplina: ");
                    noteDisc1 = sc.nextDouble();
                    noteBi1 = (noteDisc1 * 2) / 2;
                    if (noteBi1 >= 7 && noteBi1 == 7) {
                        approved = 'Y';
                        if (approved == 'Y') {
                            System.out.println(name + ".\n A sua nota do bimestres e de: " + noteBi1 +
                                    ".\n Disciplina: " + disc1 + ".\n Voce esta " + approved + " aprovado no primeiro bimestre. ");
                        }
                    } else if (noteBi1 <= 7) {
                        noteBi1 = (noteDisc1 * 2) / 2;
                        approved = 'N';
                        if (approved == 'N') {
                            System.out.println(name + ".\n A sua nota do bimestre e de: " + noteBi1 +
                                    ".\n  Disciplina: " + disc1 + ".\n Voce esta " + approved + " aprovado no primeiro bimestre. "
                                    + "\n Voce esta de DP/Recuperacao no primeiro bimestre!");
                        }
                    }
                }
                if (pergunt.equals("Segundo Bimestre") || pergunt.equals("segundo bimestre")) {
                    System.out.println("Digite a primeira disciplina :");
                    disc1 = sc.nextLine();
                    if (disc1.equals("Matematica Aplicada")) {
                        System.out.println("Digite a nota da primeira disciplina: ");
                        noteDisc1 = sc.nextDouble();
                        noteBi2 = (noteDisc1 * 2) / 2;
                        if (noteBi2 >= 7 || noteBi2 == 7) {
                            approved = 'Y';
                            if (approved == 'Y') {
                                System.out.println(name + ".\n A sua nota do bimestre e de: " + noteBi2 +
                                        ".\n Disciplina: " + disc1 + ".\n Voce esta " + approved +
                                        " aprovado no segundo semestre bimestre. ");
                            }
                        } else if (noteBi2 <= 7) {
                            noteBi2 = (noteDisc1 * 2) / 2;
                            approved = 'N';
                            if (approved == 'N') {
                                System.out.println(name + ".\n A sua nota do bimestre e de: " + noteBi2 +
                                        ".\n Disciplina: " + disc1 + ".\n voce esta " + approved +
                                        " aprovado no segundo bimestre. ");
                            }
                        }
                    }
                }
            }
            if(pergunt.equals("Primeiro Semestre") || pergunt.equals("primeiro semestre")) {
                System.out.println("Voce esta no primeiro semestre");
            }
        }

       /* System.out.println("Digite a segunda disciplina: ");
        disc2 = sc.nextLine();
        System.out.println("Digite a nota da segunda disciplina: ");
        noteDisc2 = sc.nextDouble();

        System.out.println("Digite a terceira disciplina: ");
        disc3 = sc.nextLine();
        System.out.println("Digite a nota da terceira disciplina: ");
        noteDisc3 = sc.nextDouble();

        System.out.println("Digite a quarta disciplina: ");
        disc4 = sc.nextLine();
        System.out.println("Digite a nota da quarta disciplina: ");
        noteDisc4 = sc.nextDouble();

        System.out.println("Digite a quinta disciplina: ");
        disc5 = sc.nextLine();
        System.out.println("Digite a nota da quinta disciplina: ");
        noteDisc5 = sc.nextDouble();

        System.out.println("Digite a sexta disciplina: ");
        disc6 = sc.nextLine();
        System.out.println("Digite a nota da sexta disciplina: ");
        noteDisc6 = sc.nextDouble();
       */
        sc.close();
    }
}