package produtoslacteos;

public class QueijoEsferico extends Queijo {
	
	
	public QueijoEsferico(float raio, float precoBase, float precoUnitario) {
		super(raio, precoBase, precoUnitario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float volume() {
		return (float) (4 * Math.PI * Math.pow(raio, 3) / 3) ;
	}

}
