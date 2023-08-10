package POO;

public class Testeatv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vip Ingresso1 = new Vip("\nTransformers","Ação","14F","+16",224,"Assento cama");
		Vip Ingresso2 = new Vip("\nCarros","Infantil","8K","Infantil",157,"Assento cama");
		MeiaEntrada Ingresso3 = new MeiaEntrada("\nToy Story","Infantil","20F","Infantil",121,"Comprovante meia entrada");
		MeiaEntrada Ingresso4 = new MeiaEntrada("\nAté o ultimo homem","Adulto","10E","Ação",219,"Comprovante meia entrada");		
		
		Ingresso1.imprimirInfo();
		System.out.println("\n");
		
		Ingresso2.imprimirInfo();
		System.out.println("\n");
		
		Ingresso3.imprimirInfo();
		System.out.println("\n");
		
		Ingresso4.imprimirInfo();
		System.out.println("\n");
		
	}

}
