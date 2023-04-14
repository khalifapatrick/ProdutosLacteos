package produtoslacteos;

public class QueijoCilindrico extends Queijo {
	
	protected float comprimento;

	public QueijoCilindrico(float raio, float precoBase, float precoUnitario, float comprimento) {
		super(raio, precoBase, precoUnitario);
		this.comprimento = comprimento;
	}
	
	protected float areaBase() {
		return (float) (Math.PI * Math.pow(raio, 2));
		
	}
	
	@Override
	public float volume() {
		return areaBase()*comprimento;
	}
	

}
