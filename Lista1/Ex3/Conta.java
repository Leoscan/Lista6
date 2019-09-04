package Ex3;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public boolean saque;
	public double vlSaque;
	public boolean deposito;
	public double vlDeposito;
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isSaque() {
		return saque;
	}
	public void setSaque(boolean saque, double vlSaque) {
		this.saque = saque;
		this.vlSaque = vlSaque;
	}
	public boolean isDeposito() {
		return deposito;
	}
	public void setDeposito(boolean deposito, double vlDeposito) {
		this.deposito = deposito;
		this.vlDeposito = vlDeposito;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroConta=");
		builder.append(numeroConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", saque=");
		builder.append(saque);
		builder.append(", deposito=");
		builder.append(deposito);
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroConta()=");
		builder.append(getNumeroConta());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append(", isSaque()=");
		builder.append(isSaque());
		builder.append(", isDeposito()=");
		builder.append(isDeposito());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
