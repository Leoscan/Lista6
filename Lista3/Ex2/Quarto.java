package Ex2;

public class Quarto extends Ambiente {
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append(", getCapacidade()=");
		builder.append(getCapacidade());
		builder.append(", getArea()=");
		builder.append(getArea());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
}
