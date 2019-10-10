package a5;

public abstract class IngredientPortionImpl implements IngredientPortion{
	
	private double portion;
	
	public IngredientPortionImpl(double portion) {
		
		if(portion==0) {
			throw new IllegalArgumentException("Portion size must not be null");
			
		}
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		
		this.portion = portion;
	
		
		
	}
	
	public Ingredient getIngredient() {return this.getIngredient();}

	public String getName() {return this.getIngredient().getName();}

	
	public double getAmount() {
		// TODO Auto-generated method stub
		return portion;
	}

	


}
