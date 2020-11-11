package br.com.mariani.modelos;

import br.com.mariani.entidades.Pessoa;
import br.com.mariani.modelos.*;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Essa classe vai rodar um programa que leia pessoa
 *
 * @author maryucha
 */
public class LerNomesIdadesSalarios {

    Scanner entrada = new Scanner(System.in);
    List<Pessoa> listaPessoa = new ArrayList<>();

    public static Pessoa criaPessoa() {
        Pessoa listaPessoa = new Pessoa();
        listaPessoa.carregaDados();

        return listaPessoa;

    }

    public static double cacMediaIdade(List<Pessoa> listaPessoa) {
        double media = 0;
        for (int i = 0; i < listaPessoa.size(); i++) {
            media += listaPessoa.listIterator(i).next().getIdade() / listaPessoa.size();
        }
        return media;
    }

    public static double cacMediaSalario(List<Pessoa> listaPessoa) {
        double media = 0;
        for (int i = 0; i < listaPessoa.size(); i++) {
            media += listaPessoa.listIterator(i).next().getSalario() / listaPessoa.size();
        }
        return media;
    }

    public void main() {
        Scanner entrada = new Scanner(System.in);
        List<Pessoa> listaPessoa = new ArrayList<>();

        Integer menu;

        do {
            try {
                System.out.println("----------MENU----------"
                        + "\n1 Cadastrar pessoa: "
                        + "\n2 Imprimir Pessoas: "
                        + "\n3 Calcular Média idades:"
                        + "\n4 Calcular média salários: "
                        + "\n5 Sair: ");
                menu = entrada.nextInt();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        listaPessoa.add(criaPessoa());
                        break;
                    case 2:
                        System.out.println("-----------------PESSOAS CADASTRADAS-------------");
                        for (int i = 0; i < listaPessoa.size(); i++) {
                            listaPessoa.listIterator(i).next().imprime();
                        }
                        break;
                    case 3:
                        double mediaIdade = cacMediaIdade(listaPessoa);
                        System.out.println("A média de idades é: " + mediaIdade);

                        break;
                    case 4:
                        double mediaSalario=cacMediaSalario(listaPessoa);
                        System.out.println("A média de salário0s é: "+mediaSalario);
                        break;
                    case 5:
                        System.out.println("Até a próxima!");
                        break;

                    default:
                        System.out.println("Escolha uma opção válida!");
                }
            }

        } while (menu != 5);

    }
}
