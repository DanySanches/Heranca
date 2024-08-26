package com.Dani.ExcercicioHeranca1;

public class main {

	public static void main(String[] args) {

		// teste fornecedor
		Fornecedor fornecedor = new Fornecedor("João Silva", "Rua das Flores, 123", "1234-5678", 10000.0, 2500.0);

		System.out.println("Teste Fornecedor");
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Endereço: " + fornecedor.getEndereco());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Crédito: " + fornecedor.getValorCredito());
		System.out.println("Dívida: " + fornecedor.getValorDivida());
		System.out.println("Saldo: " + fornecedor.obterSaldo());
		System.out.println();

		// teste empregado

		Empregado empregado = new Empregado("Júlio Rosa", "Rua A, 123", "1234-5678", 101, 3000.00, 15.0);

		System.out.println("Teste Empregado");
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Endereço: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("Código do Setor: " + empregado.getCodigoSetor());
		System.out.println("Salário Base: " + empregado.getSalarioBase());
		System.out.println("Imposto: " + empregado.getImposto() + "%");
		System.out.println("Salário Líquido: " + empregado.calcularSalario());
		System.out.println();

		// teste administrador

		Administrador admin = new Administrador("Janete Dias", "Rua das Flores, 124", "1234-5678", 1, 5000.00, 0.2,
				1000.00);
		System.out.println("Teste Administrador");
		System.out.println("Nome: " + admin.getNome());
		System.out.println("Endereço: " + admin.getEndereco());
		System.out.println("Telefone: " + admin.getTelefone());
		System.out.println("Código do Setor: " + admin.getCodigoSetor());
		System.out.println("Salário Base: " + admin.getSalarioBase());
		System.out.println("Imposto: " + admin.getImposto());
		System.out.println("Ajuda de Custo: " + admin.getAjudaDeCusto());

		double salarioFinal = admin.calcularSalario();
		System.out.println("Salário Final: " + salarioFinal);

		System.out.println();

		// teste opeario

		Operario operario = new Operario("Júlia Moura", "Rua A, 124", "1234-5678", 101, 2500.0, 10.0, 10000.0, 5.0);

		System.out.println("Teste Operário");
		operario.exibirInformacoes();
		System.out.println();

		// teste vendedor

		Vendedor vendedor = new Vendedor("Maria Flores", "Rua B, 456", "9876-5432", 102, 3000.0, 12.0, 20000.0, 10.0);
		
		System.out.println("Teste Vendedor");
		vendedor.exibirInformacoes();
		System.out.println();
	}

}
