package a5;

public class IngredientPortionImpl implements IngredientPortion{
	
	private Double portion;
	
	public IngredientPortionImpl(Double portion) {
		
		if(portion==null) {
			throw new IllegalArgumentException("Portion size must not be null");
			
		}
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		
		this.portion = portion;
	
		
		
	}
	
	public Ingredient getIngredient() {return this.getIngredient();}

	public String getName() {return this.getIngredient().getName();}

	
	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return portion;
	}

	
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(this.equals(other)==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		if(this.equals(other)==true) {
			
			return new IngredientPortionImpl(this.getAmount()+ other.getAmount());
			
		}
	
		if(other==null) {return this;}
		
		return this;
	}

}
