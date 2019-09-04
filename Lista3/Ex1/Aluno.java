package Ex1;

public class Aluno extends PessoaE {
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", getMatricula()=");
		builder.append(getMatricula());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndereco()=");
		builder.append(getEndereco());
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
