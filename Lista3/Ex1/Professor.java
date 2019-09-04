package Ex1;

public class Professor extends PessoaE {
	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [disciplina=");
		builder.append(disciplina);
		builder.append(", getDisciplina()=");
		builder.append(getDisciplina());
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
