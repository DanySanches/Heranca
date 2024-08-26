package com.Dani.ExcercicioHeranca1;

public class Administrador extends Empregado {
	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setAjudaDeCusto(ajudaDeCusto);
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}	
    
	// Redefinindo o método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.ajudaDeCusto;
    }
    

	
	
	

}
