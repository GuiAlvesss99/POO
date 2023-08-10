package POO;

public class Atividade6 {
	
	private String NomedoCurso;
	private String Tipo;
	private String Nivel;
	private String Plataforma;
	private int CargaHoraria;
	
	
	public Atividade6(String nomedoCurso, String tipo, String nivel, String plataforma, int cargaHoraria) {
		super();
		NomedoCurso = nomedoCurso;
		Tipo = tipo;
		Nivel = nivel;
		Plataforma = plataforma;
		CargaHoraria = cargaHoraria;
	}


	public String getNomedoCurso() {
		return NomedoCurso;
	}


	public void setNomedoCurso(String nomedoCurso) {
		NomedoCurso = nomedoCurso;
	}


	public String getTipo() {
		return Tipo;
	}


	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	public String getNivel() {
		return Nivel;
	}


	public void setNivel(String nivel) {
		Nivel = nivel;
	}


	public String getPlataforma() {
		return Plataforma;
	}


	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}


	public int getCargaHoraria() {
		return CargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	
	public void imprimirInfo() {
		System.out.println();
	}

}
