package Ex1;

public class Teste {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Leonardo");
		p.setEndereco("Rua x");
		System.out.println(p);
		
		PessoaFisica f = new PessoaFisica();
		f.setCpf("999999999999");
		f.setEstadoCivil("solteiro");
		System.out.println(f);
		
		PessoaJuridica j = new PessoaJuridica();
		j.setCnpj("Leonardo");
		j.setTipoEmpresa("Rua x");
		System.out.println(j);
	}

}
