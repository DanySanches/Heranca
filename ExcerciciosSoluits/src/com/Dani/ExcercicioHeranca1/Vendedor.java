package com.Dani.ExcercicioHeranca1;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;

	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (valorVendas * (comissao / 100));
	}

	public void exibirInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Código do Setor: " + getCodigoSetor());
		System.out.println("Salário Base: " + getSalarioBase());
		System.out.println("Imposto: " + getImposto());
		System.out.println("Valor Vendas: " + valorVendas);
		System.out.println("Comissão: " + comissao);
		System.out.println("Salário Final: " + calcularSalario());
	}
}
