package produtoslacteos;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Cliente cliente =  new Cliente("Erik", "Palmarejo", 8399583);
		Fatura fatura = new Fatura(cliente);
		fatura.addQueijoCilindrico(4.3f, 400, 300, 13.6f);
		fatura.addQueijoCilindrico(5.2f, 400, 300, 11.3f);
		fatura.addQueijoCilindrico(6.4f, 400, 300, 11.3f);
		fatura.addQueijoCilindrico(5.2f, 400, 300, 8.6f);
		fatura.addQueijoCilindrico(3.8f, 400, 300, 7.5f);
		fatura.addQueijoCilindrico(2.1f, 400, 300, 5.3f);		
		fatura.addQueijoCilindricoOco(4.3f, 450, 200, 13.6f, 1.4f);
		fatura.addQueijoCilindricoOco(5.2f, 450, 200, 11.3f, 2.1f);
		fatura.addQueijoCilindricoOco(6.4f, 450, 200, 11.3f, 2.6f);
		fatura.addQueijoCilindricoOco(8.2f, 450, 200, 15.3f, 4.1f);
		fatura.addQueijoEsferico(5.2f, 450, 500);
		fatura.addQueijoEsferico(4.3f, 450, 500);
		fatura.addQueijoEsferico(8.2f, 450,500);	
		System.out.println("-------------------------------");
		System.out.println("Volumens dos queijos da fatura");
		System.out.println("-------------------------------");
		for(int i = 0; i < fatura.quantidadeQueijos(); i++) {
			System.out.printf("Volume do queijo %d : %.2f cm^2 \n", i + 1, fatura.volume(i));
		}
		System.out.println("-------------------------------");
		System.out.printf("Preço total da fatura: %.2f ECV\n", fatura.precoTotal());
		System.out.println("-------------------------------");
		System.out.println("Lista de queijos esfericos");
		System.out.println("-------------------------------");
		ArrayList<QueijoEsferico> listaQueijosEsfericos = fatura.obterQueijosEsfericos();
		for (QueijoEsferico queijoEsferico : listaQueijosEsfericos) {
			System.out.printf("Raio : %.2f cm \n", queijoEsferico.getRaio());
			System.out.printf("Preço Base: %.2f ECV \n", queijoEsferico.getPrecoBase());
			System.out.printf("Preço Unitario : %.2f ECV \n", queijoEsferico.getPrecoUnitario());
			System.out.printf("Volume : %.2f cm^2 \n", queijoEsferico.volume());
			System.out.printf("Preço Total : %.2f ECV\n", queijoEsferico.precoTotal());
			System.out.println("-------------------------------");
		}
		/*
		 * System.out.println("Lista de queijos cilindricos");
		 * System.out.println("-------------------------------");
		 * System.out.println("Lista de queijos cilindricos ocos");
		 * System.out.println("-------------------------------");
		 */
		
		System.out.printf("Preço do queijo esferico de maior volume: %.2f ECV\n", fatura.precoQueijoEsfericoMaiorVolume());
		System.out.println("-------------------------------");
		

	}

}
