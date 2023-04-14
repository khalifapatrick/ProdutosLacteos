package produtoslacteos;

public abstract class Queijo {
	
	protected float raio;

	private float precoBase;
	
	private float precoUnitario;
	
	public Queijo(float raio, float precoBase, float precoUnitario) {
		this.raio = raio;
		this.precoBase = precoBase;
		this.precoUnitario = precoUnitario;
	}
	
	public float getRaio() {
		return raio;
	}	

	

	public float getPrecoBase() {
		return precoBase;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public abstract float volume();
	
	public float precoTotal() {
		return precoBase + precoUnitario * volume();
	}	

}
