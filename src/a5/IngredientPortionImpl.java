package a5;

public class IngredientPortionImpl implements IngredientPortion{
	
	private Double portion;
	private Object getIngredient;
	
	public IngredientPortionImpl(Double portion) {
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		
		this.portion = portion;
	
		
		
	}
	
	public Ingredient getIngredient() {
		
		
		return null;}

	public String getName() {return this.getIngredient().getName();}

	
	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return portion;
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(this.getName().equals(other.getName())==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(this.getName().equals(other.getName())==true) {
			
			return new IngredientPortionImpl(this.getAmount()+ other.getAmount());
			
		}
	
		
		return null;
	}

}
