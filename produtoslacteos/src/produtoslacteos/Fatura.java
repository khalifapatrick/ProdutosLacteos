package produtoslacteos;

import java.util.ArrayList;

public class Fatura {

	private Cliente cliente;

	private final ArrayList<Queijo> queijos = new ArrayList<>();

	public Fatura(Cliente cliente) {
		this.cliente = cliente;
	}

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

	public int quantidadeQueijos() {
		return queijos.size();
	}

	public ArrayList<QueijoEsferico> obterQueijosEsfericos() {
		ArrayList<QueijoEsferico> listaQueijosEsfericos = new ArrayList<>();
		for (Queijo queijo : queijos) {
			if (queijo instanceof QueijoEsferico esferico) {
				listaQueijosEsfericos.add(esferico);
			}
		}
		return listaQueijosEsfericos;
	}

	public ArrayList<QueijoCilindricoOco> obterQueijosCilindricosOcos() {
		ArrayList<QueijoCilindricoOco> listaQueijosCilindricosOcos = new ArrayList<>();
		for (Queijo queijo : queijos) {
			if (queijo instanceof QueijoCilindricoOco oco) {
				listaQueijosCilindricosOcos.add(oco);
			}
		}
		return listaQueijosCilindricosOcos;
	}

	public ArrayList<QueijoCilindrico> obterQueijosCilindricos() {
		ArrayList<QueijoCilindrico> listaQueijosCilindricos = new ArrayList<>();
		for (Queijo queijo : queijos) {
			if (!(queijo instanceof QueijoCilindricoOco)) {
				if (queijo instanceof QueijoCilindrico cilindrico) {
					listaQueijosCilindricos.add(cilindrico);
				}
			}
		}
		return listaQueijosCilindricos;
	}
	
	public float precoQueijoEsfericoMaiorVolume() {
		 ArrayList<QueijoEsferico> queijosEsfericos = obterQueijosEsfericos();
		 QueijoEsferico queijo = queijosEsfericos.get(0);
		 for(int i = 1; i < queijosEsfericos.size(); i++) {
			 if(queijo.volume() < queijosEsfericos.get(i).volume()) {
				 queijo = queijosEsfericos.get(i);
			 }
		 }
		 return queijo.precoTotal();		 
	}

}
