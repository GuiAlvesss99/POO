package POO;

public class Testeatv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente funcionario1 = new Gerente("\nFernanda","\nChefe", 32,"\nfernanda@gmail.com","\nContas a pagar",8000);
		Gerente funcionario2 = new Gerente("\nRfael","\nSupervisor", 20,"\nrafael@gmail.com","\nT.i",3000);
		Vendedor funcionario3 = new Vendedor("\nHenrique","\nEncarregado", 26,"\nhenrique@outlook.com","\nProdução",42);
		Vendedor funcionario4 = new Vendedor("\nJulio","\nEncarregado", 28,"\njulio@outlook.com","\nPeças",18);
		
		
		funcionario1.imprimirInfo();
		System.out.println("\n");
		
		funcionario2.imprimirInfo();
		System.out.println("\n");
		
		funcionario3.imprimirInfo();
		System.out.println("\n");
		
		funcionario4.imprimirInfo();
		System.out.println();
	}

}
