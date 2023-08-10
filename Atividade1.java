package POO;

public class Atividade1 {

	private String Nome;
	private int Telefone;
	private String Residencia;
	private String Sexo;
	private int idade;
	
	
	public Atividade1(String nome, int telefone, String residencia, String sexo, int idade) {
		super();
		Nome = nome;
		Telefone = telefone;
		Residencia = residencia;
		Sexo = sexo;
		this.idade = idade;
		
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public String getResidencia() {
		return Residencia;
	}
	public void setResidencia(String residencia) {
		Residencia = residencia;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimirInfo() {
		
	}
	
}
