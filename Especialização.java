package POO;

public class Especialização extends Atividade6{

	private String Certificado;

	public Especialização(String nomedoCurso, String tipo, String nivel, String plataforma, int cargaHoraria,
			String certificado) {
		super(nomedoCurso, tipo, nivel, plataforma, cargaHoraria);
		Certificado = certificado;
	}

	public String getCertificado() {
		return Certificado;
	}

	public void setCertificado(String certificado) {
		Certificado = certificado;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do curso:"+getNomedoCurso()+"\nTipo de curso:"+getTipo()+"\nQual nivel do curso:"+getNivel()+"\nQual a plataforma:"+getPlataforma()+"\nQual a carga horaria:"
    			+getCargaHoraria()+"\nCertificação:"+getCertificado());
	}
}
