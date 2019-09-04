package Ex3;

public class ContaPessoal extends Conta{
	private int diaSJuros;
	private double limite;
	public int getDiaSJuros() {
		return diaSJuros;
	}
	public void setDiaSJuros(int diaSJuros) {
		this.diaSJuros = diaSJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaPessoal [diaSJuros=");
		builder.append(diaSJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", getDiaSJuros()=");
		builder.append(getDiaSJuros());
		builder.append(", getLimite()=");
		builder.append(getLimite());
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
