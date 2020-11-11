package br.com.mariani.controle;

import java.awt.HeadlessException;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Chamar telefone = new Chamar();

        Integer menu = 0;

        do {
            try {
                System.out.println("=================MENU==========="
                        + "\n1 Java Básico: "
                        + "\n2 Vetores: "
                        + "\n3 Matrizes: "
                        + "\n4 Cadastro Pessoa com Médias: "
                        + "\n5 Livraria: "
                        + "\n6 Agenda Contatos: "
                        + "\n7 Elevador: "
                        + "\n8 Funcionário: "
                        + "\n9 Sair: "
                        + "\n=================================");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        telefone.javaBasico();
                        break;
                    case 2:
                        telefone.javaVetores();
                        break;
                    case 3:
                        telefone.javaMatrizes();
                        break;
                    case 4:
                        telefone.javaCadastro();
                        break;
                    case 5:
                        
                        break;
                    case 6:

                        break;
                    case 7:
                        telefone.javaElevador();
                        break;
                    case 8:
                        telefone.javaFuncionario();
                        break;
                    case 9:
                         System.out.println("Até mais!");
                        break;
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            }
        } while (menu != 9);

    }
}
