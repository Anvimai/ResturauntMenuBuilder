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
	
	public Ingredient getIngredient() {
		
		
		return this.getIngredient();}

	public String getName() {return this.getIngredient().getName();}

	
	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return portion;
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(other.equals(this)==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
	
		
		return this;
	}

}
