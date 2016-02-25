package br.com.teste.modelo;
import java.math.BigDecimal;

public abstract class Conta {
	protected BigDecimal saldo;
	protected final int numeroDaConta;
	
	//Constructor
	public Conta(BigDecimal saldo, int numeroDaConta) {
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
	}
	
	//Getters and Setters
	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	//Methods
	public void saca(BigDecimal valor) {
		if (valor.compareTo(new BigDecimal("0.0")) > 0) { //Se valor for maior do que 0
			saldo = saldo.subtract(valor);
		} else {
			System.err.println("Não é possível realizar o saque!");
		}
	}

	public void deposita(Conta outraConta, BigDecimal valor) { 
		this.saca(valor);
		outraConta.saldo = outraConta.saldo.add(valor);
	}
	
	public String toString() {
		return "Conta: " + numeroDaConta + "\t Saldo: " + saldo;
	}
	
	
	
	
	
}
