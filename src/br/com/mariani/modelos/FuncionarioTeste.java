/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mariani.modelos;

import br.com.mariani.entidades.Funcionario;
import java.awt.HeadlessException;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class FuncionarioTeste {
    public void main(){
        Scanner entrada = new Scanner(System.in);
        Funcionario fun1 = new Funcionario();

        Integer menu = 0;

        do {
            try {
                System.out.println("-----------MENU----------"
                        + "\n1 Cadastrar Funcionário: "
                        + "\n2 Calcular Aumento: "
                        + "\n3 Calcular ganho anual: "
                        + "\n4 Sair: ");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        fun1.cadFuncionario();
                        break;
                    case 2:
                        System.out.print("Digite a taxa de aumento: ");
                        int taxa = entrada.nextInt();
                        entrada.nextLine();
                        double salNovo = fun1.recebeAlmento(taxa);
                        System.out.println("Seu salário atual será de R$" + salNovo);
                        break;
                    case 3:
                        double salAnual = fun1.calculaAnual();
                        System.out.println("O seu salário anual é de R$" + salAnual);
                        break;
                    case 4:
                        System.out.println("Até mais");
                        break;
                    default:
                        System.out.println("Esconha uma opção válida!");
                        break;
                }
            }
           
        } while (menu != 4);
    }
}
