/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mariani.entidades;

import java.util.Scanner;

/**
 * Essa clase será o modelo de Funcionário
 *
 * @author maryucha
 */
public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;

    Scanner entrada = new Scanner(System.in);

    /**
     * Aqui temos o construtor vazio que é uma rotina de execução para quando a
     * classe funcionário for instanciada.
     */
    public Funcionario() {
    }

    /**
     * Aqui temos o construtor cheio que é uma rotina de execução para quando a
     * classe funcionário for instanciada.
     *
     * @param nome
     * @param departamento
     * @param salario
     */
    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    /**
     * Método responsável por retornar o nome do funcionário
     *
     * @return uma String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método quye muda(seta) o valor do nome pelo argumento
     *
     * @param nome deve receber uma String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método retorna o nome do departamento
     *
     * @return uma String
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Método quye seta(muda) o nome do departamento
     *
     * @param departamento deve receber uma String
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Método que retorna o salário
     *
     * @return um double
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método que seta o salario
     *
     * @param salario deve receber um double
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void cadFuncionario() {
        System.out.println("--------------------CADASTRO DE FUNCIONÁRIO---------------");
        System.out.print("Digite o nome do Funcionário: ");
        this.nome = entrada.nextLine();
        System.out.print("Digite o nome do departamento: ");
        this.departamento = entrada.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        this.salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("============CADASTRADO COM SUCESSO!============");
    }

    public double recebeAlmento(int taxa) {
        double vlrAlmento = (this.salario * taxa) / 100;
        this.salario += vlrAlmento;
        return salario;
    }

    public double calculaAnual() {
        double ganhoAnual = this.salario * 12;
        return ganhoAnual;
    }

}
