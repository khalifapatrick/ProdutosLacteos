package produtoslacteos;

import java.util.ArrayList;

public class Fatura {



	private final ArrayList<Queijo> queijos = new ArrayList<>();



	public void addQueijoCilindrico(float raio, float precoBase, float precoUnitario, float comprimento) {
		Queijo novoQueijo = new QueijoCilindrico(raio, precoBase, precoUnitario, comprimento);
		queijos.add(novoQueijo);
	}

	public void addQueijoCilindricoOco(float raio, float precoBase, float precoUnitario, float comprimento,
			float raioInterno) {
		Queijo novoQueijo = new QueijoCilindricoOco(raio, precoBase, precoUnitario, comprimento, raioInterno);
		queijos.add(novoQueijo);
	}

	public void addQueijoEsferico(float raio, float precoBase, float precoUnitario) {
		Queijo novoQueijo = new QueijoEsferico(raio, precoBase, precoUnitario);
		queijos.add(novoQueijo);
	}

	public float volume(int indice) {
		return queijos.get(indice).volume();

	}

	public float precoTotal() {
		float total = 0;
		for (Queijo queijo : queijos) {
			total += queijo.precoTotal();
		}
		return total;
	}



}
