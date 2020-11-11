package br.com.mariani.modelos;

import br.com.mariani.entidades.ElevadorClasse;
import br.com.mariani.modelos.*;
import java.util.Scanner;

/**
 * Essa classe foi desenvolvida para rodar o código java
 *
 * @author maryucha
 */
public class ElevadorTeste {

    public void main() throws InterruptedException {

        /**
         * Instanciando as classes que vou usar
         */
        int pessoa = 0;
        int andar = 0;
        boolean sit = false;
        Scanner entrada = new Scanner(System.in);
        ElevadorClasse elevador = new ElevadorClasse();
        
        int menu = 0;

        do {
            System.out.println("----------------HALL DO PRÉDIO----------"
                    + "\n1 Entrar: "
                    + "\n2 Subir: "
                    + "\n3 Descer: "
                    + "\n4 Ligar: "
                    + "\n5 Sair do elevador: "
                    +" \n6 Sair do algoritimo: ");
            menu = entrada.nextInt();
            entrada.nextLine();
            switch (menu) {
                case 1:
                    elevador.entrar(pessoa);
                    break;
                case 2:
                    elevador.sobe(andar);
                    break;
                case 3:
                    elevador.desce(andar);
                    break;
                case 4:
                    elevador.inicializa(sit);
                    break;
                case 5:
                    elevador.sair(pessoa);
                    break;
                 case 6:
                     System.out.println("Até mais");
                    break;    
                default:
                    System.out.println("Selecione uma opção válida!");
                    break;
            }
        } while (menu != 6);

    }
}
