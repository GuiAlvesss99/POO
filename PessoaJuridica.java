package POO;

public class PessoaJuridica extends Atividade1 {

	private String Cnpj;
	private String Tipodeconta;
	
	public PessoaJuridica(String nome, int telefone, String residencia, String sexo, int idade, String cnpj,
			String tipodeconta) {
		super(nome, telefone, residencia, sexo, idade);
		Cnpj = cnpj;
		Tipodeconta = tipodeconta;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public String getTipodeconta() {
		return Tipodeconta;
	}

	public void setTipodeconta(String tipodeconta) {
		Tipodeconta = tipodeconta;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome da pessoa fisica:"+getNome()+"\nTelefone:"+getTelefone()+"\nOnde mora:"+getResidencia()+"\nSua sexualidade:"+getSexo()+"\nIdade:"+getIdade()+
				"\nCpf:"+getCnpj()+"\nTipo de conta:"+getTipodeconta());
	}
	
	
}
