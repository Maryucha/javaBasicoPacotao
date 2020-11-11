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
public class AtividadeJavaBasico {

    private Scanner entrada = new Scanner(System.in);
    private DecimalFormat dF = new DecimalFormat("0.##");
    private String formatado = "";
    private Calendar cal = Calendar.getInstance();

    public void calcMedia() {
        System.out.println("----------CALCULAR MÉDIA----------");
        double[] notas1 = new double[2];
        double[] notas2 = new double[2];

        double media1 = 0;
        double media2 = 0;

        double mediaGeral = 0;

        for (int i = 0; i < notas1.length; i++) {
            System.out.print("Digite a nota da primeira prova: ");
            notas1[i] = entrada.nextDouble();
            entrada.nextLine();
            media1 += notas1[i] / notas1.length;
        }
        formatado = dF.format(media1);

        System.out.println("");
        System.out.println("A média do primeiro aluno foi " + formatado);
        System.out.println("");
        for (int i = 0; i < notas2.length; i++) {
            System.out.print("Digite a nota da primeira prova: ");
            notas2[i] = entrada.nextDouble();
            entrada.nextLine();
            media2 += notas2[i] / notas2.length;
        }
        formatado = dF.format(media2);
        System.out.print("");
        System.out.println("A média do segundo aluno foi " + formatado);
        System.out.println("");

        mediaGeral = (media1 + media2) / 2;
        formatado = dF.format(mediaGeral);
        System.out.println("A média geral é " + formatado);

    }

    public void somaImpar() {
        int qtdImpar = 0;
        double paresMulti = 1;
        System.out.println("------------------SOMAR OS ÍMPARES--------------");
        for (int i = 1; i < 30; i++) {
            System.out.print("[" + i + "] ");
            if (i % 2 == 0) {
                paresMulti *= i;
            } else {
                qtdImpar++;
            }
        }
        System.out.println("");
        System.out.println("A quantidade de impares de [0] até [30] é [" + qtdImpar + "]");
        System.out.println("O produto da multiplicação de todos os pares foi [" + paresMulti + "]");
    }

    public void verificarIdade() {
        System.out.println("----------------VERIFICANDO SUA IDADE-----------");
        System.out.print("Digite o ano que você nasceu: ");
        int anoNas = entrada.nextInt();
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        entrada.nextLine();
        int anoAtual = cal.get(Calendar.YEAR);
        int idade = anoAtual - anoNas;
        if (idade >= 18) {

            System.out.println(nome + " Entrada Liberada!");
        } else {
            System.out.println(nome + " Entrada barrada vai tomar nescau!");
        }

    }

    public void operadorTernario() {
        System.out.println("---------------OPERADOR TERNÁRIO--------------");
        int num = 0;
        String eh = "";
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        entrada.nextLine();
        eh = (num % 2 == 0) ? eh = "PAR" : "ÍMPAR";
        System.out.println("O número [" + num + "] é " + eh);
    }

    public void raizPotencia() {
        System.out.println("--------------RAIZ OU POTÊNCIA-------------------");
        double num = 0;
        System.out.print("Digite um número REAL para testar: ");
        num = entrada.nextDouble();
        entrada.nextLine();
        double resultado = 0;

        resultado = (num > 0) ? Math.sqrt(num) : Math.pow(num, 2);
        formatado = dF.format(resultado);
        System.out.println("O seu resultado é [" + formatado + "].");
    }

    public void compararVinte() {
        System.out.println("---------------COMPARAR COM VINTE----------------");
        int num = 0;
        System.out.print("Digite um número para comparar: ");
        num = entrada.nextInt();
        entrada.nextLine();
        if (num == 20) {
            System.out.println("Número Igual!");
        } else if (num < 20) {
            System.out.println("Número é Menor!");
        } else {
            System.out.println("Número é Maior!");
        }
    }

    public void testarMaior() {
        System.out.println("-----------------TESTANDO MAIOR-----------");
        int[] numeros = new int[3];
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número que deseja testar: ");
            numeros[i] = entrada.nextInt();
            entrada.nextLine();
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else {
                menor = numeros[i];
            }
        }
        System.out.println("O MAIOR [" + maior + "] e o MENOR [" + menor + "].");

    }

    public void comparandoTamanho() {
        System.out.println("----------------TESTAR IGUALDADE E TAMANHO------------");
        int[] numeros = new int[2];
        int maior = 0;
        int menor = 0;
        String igual = "";
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número para armazenar ");
            numeros[i] = entrada.nextInt();
            entrada.nextLine();
            if (numeros[i] > maior) {
                maior = numeros[i];
                if (numeros[i] == maior) {
                    igual = "Iguais!";
                } else {
                    igual = "Diferentes!";
                }
            } else {
                menor = numeros[i];
                if (numeros[i] == menor) {
                    igual = "Iguais!";
                } else {
                    igual = "Diferentes!";
                }
            }
        }
        System.out.println("O número MAIOR [" + maior + "] e o MENOR [" + menor + "].");
        System.out.println("E eles são "+igual);
    }

    public void calcIdade() {
        System.out.println("-----------------CALCULAR DIAS DE VIDA--------------");
        int anoAtual = 0, anoNasc = 0, meses = 0, dias = 0, idade = 0, ano = 0;
        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = entrada.nextInt();
        entrada.nextLine();
        anoAtual = cal.get(Calendar.YEAR);
        idade = anoAtual - anoNasc;
        meses = idade * 12;
        dias = idade * 365;
        System.out.println("A pessoa tem [" + meses + "] meses de vida");
        System.out.println("A pessoa tem [" + dias + "] dias de vida");

    }

    public void calcReajuste() {
        System.out.println("------------------CALCULAR REAJUSTE-------------");
        double salario = 0, salarioNovo = 0, reajuste = 0;
        int taxa = 0;
        System.out.print("Digite salrio do funcionario: ");
        salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Digite a taxa: ");
        taxa = entrada.nextInt();
        entrada.nextLine();

        reajuste = (salario * taxa) / 100;
        salarioNovo = salario + reajuste;
        formatado = dF.format(salarioNovo);
        System.out.println("O seu salário será R$" + formatado);
    }

    public void qtdSalarioMinimo() {
        double salarioRegional = 0, seuSalario = 0, qtdSal = 0;
        System.out.println("-------------------QUANTIDADE DE SALÁRIOS------------");
        System.out.print("Digite o valor do salário na sua região: ");
        salarioRegional = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Digite o valor do seu salário: ");
        seuSalario = entrada.nextDouble();
        entrada.nextLine();
        qtdSal = seuSalario / salarioRegional;
        formatado = dF.format(qtdSal);
        System.out.println("Você recebe [" + formatado + "] salários mínimos.");

    }

    public void antecessorESucessor() {
        System.out.println("-------------------ANTECESSOR E SUCESSOR-----------");
        int num = 0, sucessor = 0, antecessor = 0;
        System.out.print("Digite o número que deseja ver: ");
        num = entrada.nextInt();
        entrada.nextLine();
        sucessor = num + 1;
        antecessor = num - 1;
        System.out.println("O Antecessor de [" + num + "] é [" + antecessor + "] e o sucessor [" + sucessor + "].");
    }

}
