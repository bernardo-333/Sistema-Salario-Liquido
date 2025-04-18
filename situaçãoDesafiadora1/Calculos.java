package situaçãoDesafiadora1;

import java.util.Scanner;


public class Calculos {
	//PARÂMETROS
	double bruto;
	double saude;
	double transporte;
	double refeicao;
	double alimentacao;
	double IR;
	double CalcDependentes;

	public Calculos(double bruto, int saude, double transporte, double refeicao, double alimentacao, double IR, double CalcDependentes) {
	//CONSTRUTOR
		this.bruto = bruto;
		this.saude = saude;
		this.transporte = transporte;
		this.refeicao = refeicao;
		this.alimentacao = alimentacao;
		this.IR = IR;
		this.CalcDependentes = CalcDependentes;
		
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
		
		if (salario <= 1903.98) {
			IR = 0;
		} else if (salario > 1903.98 && salario < 2826.65) {
			IR = 0.075 * salario;
		} else if (salario > 2826.65 && salario < 3751.05) {
			IR = 0.15 * salario;
		} else if (salario > 3751.05 && salario < 4664.68) {
			IR = 0.225 * salario;
		} else if (salario > 4664.68) {
			IR = 0.275 * salario;
		}
		
		for (int i = 0; i < dependentes; i++) {
			CalcDependentes += 189.59;
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
	