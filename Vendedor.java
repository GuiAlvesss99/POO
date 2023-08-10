package POO;

public class Vendedor extends Atividade2 {

	private int TotaldeVendas;

	public Vendedor(String nome, String cargo, int idade, String email, String departamento, int totaldeVendas) {
		super(nome, cargo, idade, email, departamento);
		TotaldeVendas = totaldeVendas;
	}

	public int getTotaldeVendas() {
		return TotaldeVendas;
	}

	public void setTotaldeVendas(int totaldeVendas) {
		TotaldeVendas = totaldeVendas;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do gerente:"+getNome()+ "\nQual o cargo:"+getCargo()+ "\nIdade:"+getIdade()+"\nQual email:"+getEmail()+"\nQual departamento:"+getDepartamento()+"\nTotal de vendas de:"
    			+getTotaldeVendas());
	}
}
