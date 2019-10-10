package a5;

public class RicePortion extends IngredientPortionImpl{

	public RicePortion(double portion) {
		super(portion);
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Rice();}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
	if(other == null) {return this;}
		
		if(this.getIngredient().equals(other.getIngredient())==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(this.getIngredient().equals(other.getIngredient())==true) {
			
			return new RicePortion((this.getAmount()+other.getAmount()));}
		
			
		return this;
		
	}

}
