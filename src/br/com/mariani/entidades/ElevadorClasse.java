package br.com.mariani.entidades;

import java.util.Random;
import java.util.Scanner;

/**
 * Essa classe representa o modelo de elevador nela teremos: Métosos de acesso e
 * modificadores Métodos especificos para ações do elevador
 *
 * @author maryucha
 */
public class ElevadorClasse {

    private int andarAtual = 0;
    private int totAndar = 10;
    private int capacidade = 10;
    private int qtdPessoas = 0;
    private boolean ligar;
    private int andar = 0;

    Scanner entrada = new Scanner(System.in);
    Random random = new Random();

    /**
     * Esse é o construtor vázio da classe elevador
     */
    public ElevadorClasse() {

    }

    /**
     * Esse é o construtor completo da classe elevador
     *
     * @param andarAtual
     * @param totAndar
     * @param capacidade
     * @param qtdPessoas
     */
    public ElevadorClasse(int andarAtual, int totAndar, int capacidade, int qtdPessoas) {
        this.andarAtual = andarAtual;
        this.totAndar = totAndar;
        this.capacidade = capacidade;
        this.qtdPessoas = qtdPessoas;
    }

    /**
     * Esse método é responsavel por retornar o andar
     *
     * @return retorna um inteiro
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * esse método deve setar(mudar) o andar atual recebendo um argumento
     * conforme o tido disposto na assinatura do método
     *
     * @param andarAtual
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    /**
     * Esse método deve retornar o valor da quantidade de andares
     *
     * @return retorna um inteiro com o valor
     */
    public int getTotAndar() {
        return totAndar;
    }

    /**
     * Esse método deve retornar o valor de quantidade de pessoas
     *
     * @return retorna um inteiro
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Esse método roda a entrada de quantidade de pessoas e realiza o teste
     * lógico para testar a capacidade de pessoas;
     *
     * @param pessoa
     * @throws InterruptedException
     */
    public void entrar(int pessoa) throws InterruptedException {
        System.out.print("Digite a quantidade de pessoas: ");
        this.qtdPessoas = entrada.nextInt();
        entrada.nextLine();
        if (this.capacidade < this.qtdPessoas) {
            System.out.println("Capacidade Excedida!");
        } else {
            sobe(andar);
        }
    }

    public void sair(int pessoa) {
        int capAux = 0;
        System.out.print("Quantas pessoas vão sair: ");
        pessoa = entrada.nextInt();
        entrada.nextLine();
        capAux = qtdPessoas - pessoa;
        if (capAux >= 0) {
            this.qtdPessoas = capAux;
            System.out.println("Boa visita!");
        } else {
            System.out.println("Não tem como sair fantasmas!");
        }
    }

    public void sobe(int andar) throws InterruptedException {
        System.out.print("Digite o andar que deseja subir: ");
        andar = entrada.nextInt();
        entrada.nextLine();
        if (andar > totAndar) {
            System.out.println("Não temos acesso ao céu ainda!");
        } else {
            System.out.println("SUBINDO!");
            Thread.sleep(1000);
            this.andarAtual += andar;
            System.out.println("Bem vindo ao [" + this.andarAtual + "] andar");
        }

    }

    public void desce(int andar) throws InterruptedException {
        this.andarAtual = random.nextInt(Integer.max(10, 1));
        System.out.println("=========[" + this.andarAtual + "]=========");
        System.out.print("Digite o andar que deseja descer: ");
        andar = entrada.nextInt();
        entrada.nextLine();
        int resulAndares = this.totAndar - andar;

        if (andar < this.andarAtual && this.andarAtual != 0) {
            System.out.println("DESCENDO");
            Thread.sleep(1000);
            this.andarAtual -= andar;
            System.out.println("Bem vindo ao [" + this.andarAtual + "] andar");
        } else {
            if (resulAndares >= 0) {
                System.out.println("Não tem como descer para cima");
            } else {
                System.out.println("Não temos acesso ao inferno!");
            }

        }

    }

    public void inicializa(boolean sit) throws InterruptedException {
        System.out.print("Deseja ligar o elevador? ");
        sit = entrada.nextBoolean();
        entrada.nextLine();
        if (sit == true) {
            ligar = true;
            entrar(this.qtdPessoas);
        } else {
            System.out.println("Não segure o elevador");
            sair(this.qtdPessoas);
        }
    }

}
