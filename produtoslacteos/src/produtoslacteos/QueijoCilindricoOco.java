package produtoslacteos;

public class QueijoCilindricoOco extends QueijoCilindrico {
	
	private float raioInterno;

	public QueijoCilindricoOco(float raio, float precoBase, float precoUnitario, float comprimento, float raioInterno) {
		super(raio, precoBase, precoUnitario, comprimento);
		this.raioInterno = raioInterno;
	}
	@Override
	protected float areaBase() {
		return super.areaBase() - (float) (Math.PI * Math.pow(raioInterno, 2));
		
	}
}
