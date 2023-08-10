package POO;

public class Gerente extends Atividade2{

	private double Salario;

	public Gerente(String nome, String cargo, int idade, String email, String departamento, double salario) {
		super(nome, cargo, idade, email, departamento);
		Salario = salario;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

    public void imprimirInfo() {
    	System.out.println("\nNome do gerente:"+getNome()+ "\nQual o cargo:"+getCargo()+ "\nIdade:"+getIdade()+"\nQual email:"+getEmail()+"\nQual departamento:"+getDepartamento()+"\nSalario de:"
    			+getSalario());
    }
    	
	
}
