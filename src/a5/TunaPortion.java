package a5;

public class TunaPortion extends IngredientPortionImpl{

	public TunaPortion(Double portion) {
		super(portion);
		
	
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {return "tuna";}

	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Tuna();}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(this.equals(other)==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
			
		}
		
		
		if(this.equals(other)==true) {
			
			return new TunaPortion(this.getAmount()+ other.getAmount());
			
		}
	
		if(other==null) {return this;}
		
		return this;
	}

}
