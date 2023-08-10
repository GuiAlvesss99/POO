package POO;

public class Testeatv6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CursoLivre Curso1 = new CursoLivre("Odontologia","Saúde","Bacharelado","Presencial",2000,"Canal");
		CursoLivre Curso2 = new CursoLivre("T.I","Tecnologia","Tecnico","EAD",800,"Montagem de computadores");
		Especialização curso3 = new Especialização("Ciencias da computação","Tecnologia","Bacharelado","EAD",4000,"Nivel Avançado");
		Especialização curso4 = new Especialização("Medicina","Saude","Bacharelado","Presencial",200000,"Nivel Avançado");
		
		Curso1.imprimirInfo();
		System.out.println("\n");
		
		Curso2.imprimirInfo();
		System.out.println("\n");
		
		curso3.imprimirInfo();
		System.out.println("\n");
		
		curso4.imprimirInfo();
		System.out.println();

	}

}
