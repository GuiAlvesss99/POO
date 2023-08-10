package POO;

public class Testeatv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogo Loja1 = new Jogo("\nXbox","\nGears of war 6","\nFone de ouvido","\nCaneca do naruto","\nFunkopop Thor","\nForza Horazion 5");
		Jogo Loja2 = new Jogo("\nPs2","\nCall of Duty","\nControle","\nBlusao cp","\nFunkopop Naruto","\nFifa 24");
		Console Loja3 = new Console("\nPS4","\nFifa 23","\nTeclado mecânico","\nCamiseta capitão américa","\nFunkopop Kakashi","\nXbox series X");
		Console Loja4 = new Console("\nPSVita","\nFortinite","\nMouse","\nCamiseta Avengers","\nFunkopop Kiba","\nPS5");
		
		
		
		Loja1.imprimirInfo();
		System.out.println("\n");
		
		Loja2.imprimirInfo();
        System.out.println("\n");
        
        Loja3.imprimirInfo();
        System.out.println("\n");
        
        Loja4.imprimirInfo();
        System.out.println();
	}

}
