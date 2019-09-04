package Ex2;

public class Lagarto extends Reptil {
	private String nome;
	private String raca;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [nome=");
		builder.append(nome);
		builder.append(", raca=");
		builder.append(raca);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getRaca()=");
		builder.append(getRaca());
		builder.append(", getCorEscama()=");
		builder.append(getCorEscama());
		builder.append(", getOvos()=");
		builder.append(getOvos());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getnPatas()=");
		builder.append(getnPatas());
		builder.append(", getCor()=");
		builder.append(getCor());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
}
