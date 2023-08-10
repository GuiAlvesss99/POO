package POO;

public class Atividade4 {

	
	private int Codigo;
	private String NomedoProduto;
	private String CategoriadoRemedio;
	private String Fabricante;
	private String IntroduçãodeUso;
	
	
	public Atividade4(int codigo, String nomedoProduto, String categoriadoRemedio, String fabricante,
			String introduçãodeUso) {
		super();
		Codigo = codigo;
		NomedoProduto = nomedoProduto;
		CategoriadoRemedio = categoriadoRemedio;
		Fabricante = fabricante;
		IntroduçãodeUso = introduçãodeUso;
	}


	public int getCodigo() {
		return Codigo;
	}


	public void setCodigo(int codigo) {
		Codigo = codigo;
	}


	public String getNomedoProduto() {
		return NomedoProduto;
	}


	public void setNomedoProduto(String nomedoProduto) {
		NomedoProduto = nomedoProduto;
	}


	public String getCategoriadoRemedio() {
		return CategoriadoRemedio;
	}


	public void setCategoriadoRemedio(String categoriadoRemedio) {
		CategoriadoRemedio = categoriadoRemedio;
	}


	public String getFabricante() {
		return Fabricante;
	}


	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}


	public String getIntroduçãodeUso() {
		return IntroduçãodeUso;
	}


	public void setIntroduçãodeUso(String introduçãodeUso) {
		IntroduçãodeUso = introduçãodeUso;
	}
	
	public void imprimirInfo() {
		
	}
	
	
}
