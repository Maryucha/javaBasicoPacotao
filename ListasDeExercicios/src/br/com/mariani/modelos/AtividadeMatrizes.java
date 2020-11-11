package br.com.mariani.modelos;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class AtividadeMatrizes {

    private Scanner entrada = new Scanner(System.in);
    private DecimalFormat dF = new DecimalFormat("0.##");
    private String formatado = "";
    private Calendar cal = Calendar.getInstance();

    public void diagonal() {
        int[][] matriz = new int[10][10];

        System.out.println("------CARREGANDO OS DADOS---------");
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        System.out.println("---------IMPRIMINDO A MATRIZ--------------");
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                System.out.print(matriz[linha][coluna] + "");
            }
            System.out.println("");
        }
    }

    public void multiplicaLineColuna() {
        int[][] matriz = new int[4][4];

        System.out.println("--------IMPRIMINDO A MATRIZ-------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public void posicaoMaior() {

        System.out.print("Digite o tamanho da linha sua matriz: ");
        int linha = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite o tamanho da coluna sua matriz: ");
        int coluna = entrada.nextInt();
        entrada.nextLine();
        System.out.println("--------------------CARREGAR DADOS-----------------");
        int maior = 0;
        int posi = 0;
        int posj = 0;
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor que deseja armazenar: ");
                matriz[i][j] = entrada.nextInt();
                entrada.nextLine();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posi = i;
                    posj = j;
                }
            }
        }

        System.out.println("----------------IMPRIMIR MATRIZ---------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("O maior número é [" + maior + "] e está na posição X [" + posi + "] posição Y [" + posj + "]");
    }

    public void procuraNumero() {
        System.out.print("Digite a quantidade de linhas: ");
        int linha = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite a quantidade de colunas: ");
        int coluna = entrada.nextInt();
        entrada.nextLine();
        int[][] matriz = new int[linha][coluna];
        int posI = 0;
        int posJ = 0;
        String nao = null;
        int test = 0;

        System.out.print("Qual número deseja buscar: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        System.out.println("------------------CARREGANDO DADOS--------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor que deseja armazenar: ");
                matriz[i][j] = entrada.nextInt();
                entrada.nextLine();
                if (matriz[i][j] == num) {
                    test = 1;
                    posI = i;
                    posJ = j;
                } else {
                    nao = "Não encontrado!";
                }
            }
        }

        System.out.println("------------------IMPRIMINDO A MATRIZ---------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
        if (test != 0) {
            System.out.println("O número " + num + " está na posicao X[" + posI + "] e Y[" + posJ + "]");
        } else {
            System.out.println(nao);
        }
    }

    public void jogoDaVelha() {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.executar();
    }

}
