/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mariani.modelos;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class AtividadeVetores {

    private Scanner entrada = new Scanner(System.in);
    private DecimalFormat dF = new DecimalFormat("0.##");
    private String formatado = "";
    private Calendar cal = Calendar.getInstance();

    public void vetorA() {
        int[] a = new int[6];

        a[0] = 1;
        a[1] = 0;
        a[2] = -2;
        a[3] = -5;
        a[4] = 7;
        a[5] = 9;

        int variavel = 20;

        System.out.println("A soma é " + (a[0] + variavel));
        System.out.println("A soma é " + (a[1] + variavel));
        System.out.println("A soma é " + (a[5] + variavel));

        a[4] = 100;

        System.out.println("---------IMPRIMINDO O VETOR-------------");
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void vetorReais() {
        double[] vetorReais = new double[10];
        double[] vetorAux = new double[10];

        System.out.println("------------CARREGANDO O VETOR-----------");
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.print("Digite um valor para armazenar: ");
            vetorReais[i] = entrada.nextDouble();
            entrada.nextLine();

        }
        for (int j = 0; j < vetorReais.length; j++) {
            vetorAux[j] = (Math.pow(vetorReais[j], 2));
        }
        System.out.println("--------------IMPRIMINDO O VETOR SEM O CALCULO--------------");
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.print(vetorReais[i] + " ");
        }
        System.out.println("");
        System.out.println("--------------IMPRIMINDO O VETOR COM O CALCULO--------------");
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.print(vetorAux[i] + " ");
        }
    }

    public void posicaoXeY() {
        System.out.print("Digite o tamanho do vetor que você deseja: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        int[] vetorInteiros = new int[tamanho];

        int posX = 0;
        int posY = 0;
        int a = 0;
        int b = 0;
        boolean teste = true;
        System.out.println("--------------CARREGANDO O VETOR---------------");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite o número que deseja Armazenar: ");
            vetorInteiros[i] = entrada.nextInt();
            entrada.nextLine();
        }
        System.out.println("=============================================");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");

        do {
            System.out.print("Vamos alterar a posição X: ");
            posX = entrada.nextInt();
            entrada.nextLine();
        } while (posX > vetorInteiros.length || posX < 0);

        System.out.print("O que deseja por nessa posição: ");
        vetorInteiros[posX] = entrada.nextInt();
        entrada.nextLine();
        a = vetorInteiros[posX];
        System.out.println("=============================================");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");

        do {
            System.out.print("Vamos alterar a posição Y: ");
            posY = entrada.nextInt();
            entrada.nextLine();
        } while (posY > vetorInteiros.length || posY < 0);
        System.out.print("O que deseja por nessa posição: ");
        vetorInteiros[posY] = entrada.nextInt();
        entrada.nextLine();
        b = vetorInteiros[posY];

        System.out.println("=============================================");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");

        System.out.println("A soma de X+Y é: " + (a + b));
    }

    public void ordemInversa() {
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        int[] vetorInteiros = new int[tamanho];

        System.out.println("---------------CARREGANDO DADOS---------------");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite o valor que deseja armazenar: ");
            vetorInteiros[i] = entrada.nextInt();
            entrada.nextLine();
        }

        for (int i = vetorInteiros.length - 1; i >= 0; i--) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println("");
    }

    public void mediaTurma() {
        double media = 0;
        double[] notas = new double[5];

        System.out.println("---------------CARREGANDO DADOS---------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno: ");
            notas[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        System.out.println("-------------MÉDIA-----------------");
        for (int i = 0; i < notas.length; i++) {
            media += (notas[i] / notas.length);
        }
        formatado = dF.format(media);
        System.out.println("A média geral é " + formatado);
    }

    public void mediaTurmaMaior() {
        int[] vetorInteiro = new int[5];
        int somaMaior = 0;
        int somaMenor = 0;
        int maior = 0;
        int menor = 0;
        double media = 0;

        System.out.println("-----------------CARREGANDO DADOS-------------");
        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.print("Digite o valor que deseja armazenar: ");
            vetorInteiro[i] = entrada.nextInt();
            entrada.nextLine();
            if (vetorInteiro[i] > maior) {
                maior = vetorInteiro[i];
                somaMaior++;
            } else {
                menor = vetorInteiro[i];
                somaMenor++;
            }
            media += vetorInteiro[i] / vetorInteiro.length;
        }
        System.out.println("----------------------------------------");
        System.out.println("A média é  " + media);
        System.out.println("A soma dos maiores é " + somaMaior);
        System.out.println("A soma dos menores é " + somaMenor);
    }

    public void posicaoMaiorMenor() {
        System.out.print("Digite o tamanho do espaço: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();
        int[] vetorInteiros = new int[tamanho];
        int posMaior = 0;
        int posMenor = 0;
        int maior = 0;
        int menor = 0;

        System.out.println("----------------CARREGANDO DADOS-------------");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite o valor que deseja armazenar: ");
            vetorInteiros[i] = entrada.nextInt();
            entrada.nextLine();
            if (vetorInteiros[i] > maior) {
                maior = vetorInteiros[i];
                posMaior = i;
            } else {
                menor = vetorInteiros[i];
                posMenor = i;
            }
        }

        System.out.println("------------IMPRIMINDO OS DADOS---------------");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println("");
        System.out.println("O maior valor é " + maior + " e está na posição " + posMaior);
        System.out.println("O menor valor é " + menor + " e está na posição " + posMenor);
    }

    public void testeIgualdade() {
        int aux2, pos;
        String aux = "";
        System.out.print("Digite o tamanho doi vetor: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        int[] vetorInteiros = new int[tamanho];

        System.out.println("----------CARREGANDO OS DADOS---------");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite o valor que deseja armazenar: ");
            vetorInteiros[i] = entrada.nextInt();
            entrada.nextLine();
        }

        for (int i = 0; i < vetorInteiros.length; i++) {
            aux2 = vetorInteiros[i];
            pos = i;
            for (int j = 0; j < vetorInteiros.length; j++) {
                if (vetorInteiros[j] == aux2 && pos != j) {

                    aux += aux2 + " ";
                }
            }

        }

        System.out.println("");

        System.out.println("----------IMPRIMINDO OS DADOS VETOR NORMAL---------");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println("");

        System.out.println("----------IMPRIMINDO OS DADOS VETOR REPETIDOS ---------");
        System.out.print(aux);
    }

    public void retirarRepetido() {
        System.out.println("Vamos fazer esse ainda");
    }

    public void qtdNegativos() {
        double[] vetorReais = new double[10];
        int qtdNegativos = 0;
        double vlrPositivos = 0;
        double vlrNegativos = 0;
        int qtdPositivos = 0;
        double num = 0;

        System.out.println("-----------CARREGANDO----------");
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.print("Digite o valor que deseja armazenar: ");
            num = entrada.nextDouble();
            entrada.nextLine();
            vetorReais[i] = num;
            if (num > 0) {
                qtdPositivos++;
                vlrPositivos += vetorReais[i];
            } else {
                qtdNegativos++;
                vlrNegativos += vetorReais[i];
            }

        }
        System.out.println("----------------TESTANDO--------------");
        System.out.println("Temos " + qtdNegativos + " de Negativos e a soma deles é " + vlrNegativos);
        System.out.println("Temos " + qtdPositivos + " de Positivos e a soma deles é " + vlrPositivos);
    }

}
