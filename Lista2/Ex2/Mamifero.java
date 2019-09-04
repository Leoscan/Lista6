package Ex2;


public class Mamifero extends Animal {
	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [corPelo=");
		builder.append(corPelo);
		builder.append(", getCorPelo()=");
		builder.append(getCorPelo());
		builder.append(", getnPatas()=");
		builder.append(getnPatas());
		builder.append(", getCor()=");
		builder.append(getCor());
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
