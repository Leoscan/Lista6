package Ex2;

public class Animal {
	private int nPatas;
	private String cor;
	public int getnPatas() {
		return nPatas;
	}
	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [nPatas=");
		builder.append(nPatas);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", getnPatas()=");
		builder.append(getnPatas());
		builder.append(", getCor()=");
		builder.append(getCor());
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
