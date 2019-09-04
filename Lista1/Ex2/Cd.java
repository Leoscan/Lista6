package Ex2;

public class Cd extends Midia{
	private int faixa;
	private String artista;
	private String album;
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cd [faixa=");
		builder.append(faixa);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", getFaixa()=");
		builder.append(getFaixa());
		builder.append(", getArtista()=");
		builder.append(getArtista());
		builder.append(", getAlbum()=");
		builder.append(getAlbum());
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getDuracao()=");
		builder.append(getDuracao());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
}
