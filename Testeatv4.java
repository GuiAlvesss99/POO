package POO;

public class Testeatv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medicamento Farmacia1 = new Medicamento(1122,"\nDipirona","\nAnalgésico","\nEms","\nEste medicamento é indicado como analgésico e antitérmico.","500mg");
		Medicamento Farmacia2 = new Medicamento(1873,"\nExpec","\nXarope","\nLegrand Pharma","\nExpec Legrand Pharma Xarope está indicado no tratamento sintomático da tosse irritativa.","120ml");
		Perfumaria Farmacia3 = new Perfumaria(2324,"\nDesodorante","\nCuidado pessoal","\nDove","\nOs Desodorantes Antitranspirantes Dove proporcionam proteção eficaz e o melhor cuidado para a pele das axilas","Desodorantes");
		Perfumaria Farmacia4 = new Perfumaria(2627,"\nEscova de cabelo","\nCuidado pessoal","\nVertix","\nA escova de cabelo é um item essencial para o cuidado dos fios.","Pentes para cabelos");
				
		Farmacia1.imprimirInfo();
		System.out.println("\n");
		
		Farmacia2.imprimirInfo();
		System.out.println("\n");
		
		Farmacia3.imprimirInfo();
		System.out.println("\n");
		
		Farmacia4.imprimirInfo();
		System.out.println();
	}

}
