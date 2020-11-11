package br.com.mariani.entidades;

import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    
    private Scanner entrada =new Scanner(System.in);
    
    public Pessoa(){
        
    }
    public Pessoa(String nome, int idade, double salario){
        this.nome=nome;
        this.idade=idade;
        this.salario=salario;
    }
    
    
    
    public void imprime(){
       System.out.println("NOME "+this.nome+" | IDADE "+this.idade+" |SALÁRIO "+this.salario);

    }
    
    public void carregaDados(){
        System.out.println("------------------CADASTRO DE PESSOA----------------");
        System.out.print("Digite o nome da pessoa: ");
        this.nome=entrada.nextLine();
        System.out.print("Digite a idade da pessoa? ");
        this.idade=entrada.nextInt();
        System.out.print("Digite o salário da pessoa: ");
        this.salario=entrada.nextDouble();
        System.out.println("cadastro realizado com sucesso!");
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
