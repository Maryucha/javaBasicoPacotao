package br.com.mariani.controle;

import br.com.mariani.modelos.AtividadeJavaBasico;
import br.com.mariani.modelos.AtividadeMatrizes;
import br.com.mariani.modelos.AtividadeVetores;
import br.com.mariani.modelos.ElevadorTeste;
import br.com.mariani.modelos.FuncionarioTeste;
import br.com.mariani.modelos.LerNomesIdadesSalarios;
import java.awt.HeadlessException;
import java.util.Scanner;

/**
 *
 * @author maryucha
 */
public class Chamar {

    AtividadeJavaBasico at1 = new AtividadeJavaBasico();
    AtividadeVetores at2 = new AtividadeVetores();
    AtividadeMatrizes at3 = new AtividadeMatrizes();
    LerNomesIdadesSalarios at4 = new LerNomesIdadesSalarios();
    ElevadorTeste at5 = new ElevadorTeste();
    FuncionarioTeste at6 = new FuncionarioTeste();
    Scanner entrada = new Scanner(System.in);
    

    public void javaBasico() {
        Integer menu = 0;

        do {
            try {
                System.out.println("=================MENU==========="
                        + "\n1 Média das Medias: "
                        + "\n2 Soma dos ímpares até 30: "
                        + "\n3 Boate: "
                        + "\n4 Operador Ternário: "
                        + "\n5 Raiz ou Potência: "
                        + "\n6 Comparar com 20: "
                        + "\n7 Qual é o maior: "
                        + "\n8 Comparar Igualdade e tamanho: "
                        + "\n9 Calcular idade em dias: "
                        + "\n10 Calcular Reajuste: "
                        + "\n11 Quantidade de Salário mínimo: "
                        + "\n12 Antecessor e Sucessor: "
                        + "\n13 Sair: "
                        + "\n=================================");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        at1.calcMedia();
                        break;
                    case 2:
                        at1.somaImpar();
                        break;
                    case 3:
                        at1.verificarIdade();
                        break;
                    case 4:
                        at1.operadorTernario();
                        break;
                    case 5:
                        at1.raizPotencia();
                        break;
                    case 6:
                        at1.compararVinte();
                        break;
                    case 7:
                        at1.testarMaior();
                        break;
                    case 8:
                        at1.comparandoTamanho();
                        break;
                    case 9:
                        at1.calcIdade();
                        break;
                    case 10:
                        at1.calcReajuste();
                        break;
                    case 11:
                        at1.qtdSalarioMinimo();
                        break;
                    case 12:
                        at1.antecessorESucessor();
                        break;
                    case 13:
                        System.out.println("Até mais!");
                        break;

                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            }
        } while (menu != 13);
    }

    public void javaVetores() {
        Integer menu = 0;

        do {
            try {
                System.out.println("=================MENU==========="
                        + "\n1 Vetor A: "
                        + "\n2 Vetor Reais: "
                        + "\n3 Posição X e Y: "
                        + "\n4 Ordem Inversa: "
                        + "\n5 Média da Turma: "
                        + "\n6 Quantidade de Negativos: "
                        + "\n7 Maior e Menor com Média: "
                        + "\n8 Posição do Maior e Menor: "
                        + "\n9 Teste de igualdade: "
                        + "\n10 Tirar repetidos: "
                        + "\n11 Sair: "
                        + "\n=================================");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        at2.vetorA();
                        break;
                    case 2:
                        at2.vetorReais();
                        break;
                    case 3:
                        at2.posicaoXeY();
                        break;
                    case 4:
                        at2.ordemInversa();
                        break;
                    case 5:
                        at2.mediaTurma();
                        break;
                    case 6:
                        at2.qtdNegativos();
                        break;
                    case 7:
                        at2.mediaTurmaMaior();
                        break;
                    case 8:
                        at2.posicaoMaiorMenor();
                        break;
                    case 9:
                        at2.testeIgualdade();
                        break;
                    case 10:
                        at2.retirarRepetido();
                        break;
                    case 11:
                        System.out.println("Até a próxima!");
                        break;
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            }
        } while (menu != 11);
    }

    public void javaMatrizes() {
        Integer menu = 0;

        do {
            try {
                System.out.println("=================MENU==========="
                        + "\n1 Diagonal: "
                        + "\n2 Multiplicar linha e Coluna: "
                        + "\n3 Retornar Posição do Maior: "
                        + "\n4 Procurar Número: "
                        + "\n5 Jogo da Velha: "
                        + "\n6 Sair: "
                        + "\n=================================");
                menu = entrada.nextInt();
                entrada.nextLine();
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        at3.diagonal();
                        break;
                    case 2:
                        at3.multiplicaLineColuna();
                        break;
                    case 3:
                        at3.posicaoMaior();
                        break;
                    case 4:
                        at3.procuraNumero();
                        break;
                    case 5:
                        at3.jogoDaVelha();
                        break;
                    case 6:
                        System.out.println("Até a próxima!");
                        break;    
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            }
        } while (menu != 6);
    }

    public void javaCadastro() {
        at4.main();
    }

    public void javaLivraria() {

    }

    public void javaAgendaContatos() {

    }
    
    public void javaFuncionario(){
        at6.main();
    }
    
    public void javaElevador() throws InterruptedException{
      at5.main();
    }

}
