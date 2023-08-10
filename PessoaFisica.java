package POO;

public class PessoaFisica extends Atividade1{

	private String Cpf;
	private String TipodeConta;
	
	public PessoaFisica(String nome, int telefone, String residencia, String sexo, int idade, String cpf,
			String tipodeConta) {
		super(nome, telefone, residencia, sexo, idade);
		Cpf = cpf;
		TipodeConta = tipodeConta;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getTipodeConta() {
		return TipodeConta;
	}

	public void setTipodeConta(String tipodeConta) {
		TipodeConta = tipodeConta;
	}
	public void imprimirInfo() {
		System.out.println("Nome da pessoa fisica:"+getNome()+"\nTelefone:"+getTelefone()+"\nOnde mora:"+getResidencia()+"\nSua sexualidade:"+getSexo()+"\nIdade:"+getIdade()+
				"\nCpf:"+getCpf()+"\nTipo de conta:"+getTipodeConta());
	}
	
}
