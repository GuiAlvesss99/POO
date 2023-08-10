package POO;

public class Testeatv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PessoaFisica cliente1 = new PessoaFisica("\nGabriel",55881997,"\nBahia","\nMasculino",14,"\n123.456.789-33","\nPf Pessoa fisica");
		PessoaFisica cliente2 = new PessoaFisica("\nRaquel",55881899,"\nNatal","\nFeminino",19,"\n133.476.789-43","\nPf Pessoa fisica");
		PessoaJuridica cliente3 = new PessoaJuridica("\nGuilherme",55337642,"\nRio de Janeiro","\nMasculino",22,"\n22.333.444/0001-30","\nPj Pessoa juridica");
		PessoaJuridica cliente4 = new PessoaJuridica("\nMillena",55227912,"\nSanta Catarina","\nFeminino",28,"\n12.153.494/0001-70","\nPj Pessoa juridica");
		
		cliente1.imprimirInfo();
		System.out.println("\n");
		
		cliente2.imprimirInfo();
		System.out.println("\n");
		
		cliente3.imprimirInfo();
		System.out.println("\n");
		
		cliente4.imprimirInfo();
		System.out.println();
		
		
		
		
		
		
	}

}
