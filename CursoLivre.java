package POO;

public class CursoLivre extends Atividade6 {
	
	private String OutroCurso;

	public CursoLivre(String nomedoCurso, String tipo, String nivel, String plataforma, int cargaHoraria,
			String outroCurso) {
		super(nomedoCurso, tipo, nivel, plataforma, cargaHoraria);
		OutroCurso = outroCurso;
	}

	public String getOutroCurso() {
		return OutroCurso;
	}

	public void setOutroCurso(String outroCurso) {
		OutroCurso = outroCurso;
	}
	
    public void imprimirInfo() {
    	System.out.println("\nNome do curso:"+getNomedoCurso()+"\nTipo de curso:"+getTipo()+"\nQual nivel do curso:"+getNivel()+"\nQual a plataforma:"+getPlataforma()+"\nQual a carga horaria:"
    			+getCargaHoraria()+"\nCurso livre:"+getOutroCurso());
    }
	
}
