package com.Dani.ExcercicioHeranca1;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
    private double imposto;
    
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.setCodigoSetor(codigoSetor);
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
    }

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	// Método para calcular o salário líquido
    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }

}
