package POO;

public class Perfumaria extends Atividade4 {
	
	private String Desodorante;

	public Perfumaria(int codigo, String nomedoProduto, String categoriadoRemedio, String fabricante,
			String introduçãodeUso, String desodorante) {
		super(codigo, nomedoProduto, categoriadoRemedio, fabricante, introduçãodeUso);
		Desodorante = desodorante;
	}

	public String getDesodorante() {
		return Desodorante;
	}

	public void setDesodorante(String desodorante) {
		Desodorante = desodorante;
	}
	
	public void imprimirInfo() {
		System.out.println("\nCodigo:"+getCodigo()+"\nNome do produto:"+getNomedoProduto()+"\nCategoria do remedio:"+getCategoriadoRemedio()+"\nFabricante:"+getFabricante()+"\nComo usar:"
				+getIntroduçãodeUso()+"\nItem da perfumaria:"+getDesodorante());
	}

}
