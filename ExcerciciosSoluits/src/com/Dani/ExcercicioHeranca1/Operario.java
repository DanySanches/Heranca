package com.Dani.ExcercicioHeranca1;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		 this.valorProducao = valorProducao;
	     this.comissao = comissao;
	
	}


	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (this.valorProducao * ( this.comissao/100));
	}
	
	public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Código do Setor: " + getCodigoSetor());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Imposto: " + getImposto());
        System.out.println("Valor Produção: " + valorProducao);
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário Final: " + calcularSalario());
    }

}
