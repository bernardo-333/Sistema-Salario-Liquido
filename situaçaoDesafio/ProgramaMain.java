package situaçaoDesafio;

import java.util.Scanner;

public class ProgramaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //// ENTRADA DO USUARIO:
        System.out.print("Digite o Salário Bruto: \nR$");
        double bruto = sc.nextDouble();
        double liquido;

        Calculos cl = new Calculos(bruto);
        //// CALCULOS DO PROGRAMA

        //calculo INSS
        cl.CalcInss();
        System.out.println();

        //Calculo IR
        cl.CalcIR();
        System.out.println();

        ///Calculo do Plano de Saude:
        cl.CalcSaude();

        if (cl.saude == 150.0) {
            System.out.println("Você escolheu o Plano de saude Basico = R$150,00");
        } else if (cl.saude == 300) {
            System.out.println("Você escolheu o Plano de saude Avançado = R$300,00");
        } else if (cl.saude == 0) {
            System.out.println("Você escolheu nenhum Plano de saude = R$0");
        }
        System.out.println();


        ///Calculo do Vale Transporte:
        cl.CalcTrans();

        if (cl.transporte == 0) {
            System.out.println("Você escolheu que não possui Vale Transporte = R$0");
        } else {
            System.out.printf("Você escolheu que possui Vale Transporte = R$%.2f" , cl.transporte);
        }
        System.out.println();
        System.out.println();

        //Calculo do Vale Refeição:
        cl.CalcRef();

        if (cl.refeicao == 250) {
            System.out.printf("Você escolheu que possui Vale Refeição = R$%.2f" , cl.refeicao);
        } else if (cl.refeicao == 0) {
            System.out.println("Você escolheu que não possui Vale Refeição = R$0");
        }
        System.out.println();
        System.out.println();


        ///Calculo Vale Alimenção:
        cl.CalcAli();

        if (cl.alimentacao == 200) {
            System.out.printf("Você escolheu que possui Vale Alimentação = R$%.2f" , cl.alimentacao);
        } else if (cl.alimentacao == 0) {
            System.out.println("Você escolheu que não possui Vale Alimentação = R$0");
        }
        System.out.println();

        ////SAIDA DO PROGRAMA:

        System.out.println("\n-----------------------------------------------------");

        System.out.printf("\nSalario Bruto = R$%.2f" , bruto);
        System.out.println();

        bruto -= cl.IR;
        bruto -= cl.saude;
        bruto -= cl.transporte;
        bruto -= cl.refeicao;
        bruto -= cl.alimentacao;

        double total = cl.CalcInss() + cl.IR + cl.saude + cl.transporte + cl.refeicao + cl.alimentacao;
        double porcentagem = total / bruto * 100;

        System.out.printf("\nDesconto INSS             = " + "  -R$%.2f" ,cl.CalcInss());
        System.out.printf("\nDesconto Imposto de Renda = " + "  -R$%.2f" ,cl.IR);
        System.out.printf("\nDesconto Plano de Saude   = " + "  -R$%.2f" ,cl.saude);
        System.out.printf("\nDesconto Vale Transporte  = " + "  -R$%.2f" ,cl.transporte);
        System.out.printf("\nDesconto Vale Refeição    = " + "  -R$%.2f" ,cl.refeicao);
        System.out.printf("\nDesconto Vale Alimentação = " + "  -R$%.2f" ,cl.alimentacao);
        System.out.println();
        System.out.printf("\nTotal dos Descontos       = " + "  -R$%.2f" ,total);
        System.out.printf("\nPorcentagem dos Descontos = " + "  %.2f" ,porcentagem);
        System.out.print("%");
        System.out.println();
        System.out.printf("\nSalario Liquido = R$%.2f" , bruto);


    }

}