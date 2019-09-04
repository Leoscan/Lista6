package Ex2;

public class Main {

	public static void main(String[] args) {
		Item i = new Item();
		i.setCodigo(999);
		i.setDescricao("descricao do produto");
		System.out.println(i);
		
		Livro l = new Livro();
		l.setDescricao("Autor desconhecido");
		System.out.println(l);
		
		Midia m = new Midia();
		m.setGravadora("Gravadora Tal");
		m.setDuracao(300);
		System.out.println(m);
		
		Cd cd = new Cd();
		cd.setArtista("Banda x");
		cd.setAlbum("Album da banda x");
		cd.setFaixa(10);
		System.out.println(cd);
		
		Vhs v = new Vhs();
		v.setTitulo("Titulo do vhs");
		System.out.println(v);

	}

}
