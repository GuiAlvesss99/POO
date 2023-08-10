package POO;

public class Atividade2 {

	private String Nome;
	private String Cargo;
	private int Idade;
	private String Email;
	private String Departamento;
	
	
	
	public Atividade2(String nome, String cargo, int idade, String email, String departamento) {
		super();
		Nome = nome;
		Cargo = cargo;
		Idade = idade;
		Email = email;
		Departamento = departamento;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		Cargo = cargo;
	}


	public int getIdade() {
		return Idade;
	}


	public void setIdade(int idade) {
		Idade = idade;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getDepartamento() {
		return Departamento;
	}


	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}


	public void imprimirInfo() {
	
	}

	}
	

