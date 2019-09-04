package Ex2;

public class Reptil extends Animal {
	private String corEscama;
	private int ovos;
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	public int getOvos() {
		return ovos;
	}
	public void setOvos(int ovos) {
		this.ovos = ovos;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [corEscama=");
		builder.append(corEscama);
		builder.append(", ovos=");
		builder.append(ovos);
		builder.append(", getCorEscama()=");
		builder.append(getCorEscama());
		builder.append(", getOvos()=");
		builder.append(getOvos());
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
