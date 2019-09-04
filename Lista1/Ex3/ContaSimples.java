package Ex3;

public class ContaSimples extends Conta{
	private double saldoPoupanca;
	public boolean depositoPoupanca;
	public double valorDeposito;
	public boolean saquePoupanca;
	public double valorSaque;
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	public boolean isDepositoPoupanca() {
		return depositoPoupanca;
	}
	public void setDepositoPoupanca(boolean depositoPoupanca, double valorDeposito) {
		this.depositoPoupanca = depositoPoupanca;
		this.valorDeposito = valorDeposito;
	}
	public boolean isSaquePoupanca() {
		return saquePoupanca;
	}
	public void setSaquePoupanca(boolean saquePoupanca, double valorSaque) {
		this.saquePoupanca = saquePoupanca;
		this.valorSaque = valorSaque;
	}
	
	
}
