package a5;

public class TunaPortion extends IngredientPortionImpl{

	public TunaPortion(double portion) {
		super(portion);
		
	
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Tuna();}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
	if(other == null) {return this;}
		
		if(this.getIngredient().equals(other.getIngredient())==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(this.getIngredient().equals(other.getIngredient())==true) {
			
			return new TunaPortion((this.getAmount()+other.getAmount()));}
		
			
		return this;
	}

}
