package situaçaoDesafio;

import java.util.Scanner;


public class Calculos {
    //PARÂMETROS
    double bruto;
    double saude = 0;
    double transporte = 0;
    double refeicao = 0;
    double alimentacao = 0;
    double IR = 0;
    double CalcDependentes = 0;

    public Calculos(double bruto) {
        //CONSTRUTOR
        this.bruto = bruto;
    }

    //MÉTODOS

    public double CalcInss() {

        double inss = 0;
        double salario = bruto;
        if (salario <= 1302.00) {
            inss = 0.08 * salario;
        } else if (salario > 1302.00 && salario < 2571.00) {
            inss = 0.09 * salario;
        } else if (salario > 2571.00 && salario < 3856.00) {
            inss = 0.11 * salario;
        } else if (salario > 3856.00 && salario < 7087.22) {
            inss = 0.14 * salario;
        } else if (salario > 7087.22) {
            inss = 570.88;
        }

        return inss;

    }


    public void CalcIR() {
        Scanner sc = new Scanner(System.in);

        double salario = bruto;


        System.out.print("Digite o Número de dependentes: ");
        int dependentes = sc.nextInt();

        for (int i = 0; i < dependentes; i++) {
            CalcDependentes += 189.59;
        }
        double base = bruto - CalcInss() - CalcDependentes;

        if (base <= 1903.98) {
            IR = 0;
        } else if (base > 1903.98 && base < 2826.65) {
            IR = (0.075 * base) - 142.8;
        } else if (base > 2826.65 && base < 3751.05) {
            IR = (0.15 * base) - 354.8;
        } else if (base > 3751.05 && base < 4664.68) {
            IR = (0.225 * base) - 636.13;
        } else if (base > 4664.68) {
            IR = (0.275 * base) - 869.36;
        }



    }


    public void CalcSaude() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Digite o Tipo do plano de saúde: \n1- Plano Basico: R$150,00 \n2- Plano avançado: R$300,00 \n3- Nenhum: R$0 ");
            saude = sc.nextDouble();

            if (saude == 1) {
                saude = 150;
                break;
            } else if (saude == 2) {
                saude = 300;
                break;
            } else if (saude == 3) {
                saude = 0;
                break;
            } else {
                System.err.println("Resposta Invalida, Tente Novamente");
            }

        }

    }


    public void CalcTrans() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Você possui Vale Transporte 'Sim' ou 'Não'?: ");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("sim")) {
                transporte = (0.06 * bruto);
                break;
            } else if (resposta.equalsIgnoreCase("nao")) {
                transporte = 0;
                break;
            } else {
                System.err.println("Resposta Invalida, Tente Novamente");
            }
        }


    }

    public void CalcRef() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Você possui Vale Refeição 'Sim' ou 'Não'?: ");
            String resposta1 = sc.next();

            if (resposta1.equalsIgnoreCase("sim")) {
                refeicao = 250.0;
                break;
            } else if (resposta1.equalsIgnoreCase("nao")) {
                refeicao = 0.0;
                break;
            } else {
                System.err.println("Resposta Invalida, Tente Novamente");
            }
        }


    }

    public void CalcAli() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Você possui Vale Alimentação 'Sim' ou 'Não'?: ");
            String resposta2 = sc.next();

            if (resposta2.equalsIgnoreCase("sim")) {
                alimentacao = 200.0;
                break;
            } else if (resposta2.equalsIgnoreCase("nao")) {
                alimentacao = 0.0;
                break;
            } else {
                System.err.println("Resposta Invalida, Tente Novamente");
            }
        }


    }


}
