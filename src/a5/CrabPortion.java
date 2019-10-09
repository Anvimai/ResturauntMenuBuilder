package a5;

public class CrabPortion extends IngredientPortionImpl{

	public CrabPortion(Double portion) {
		super(portion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Crab();}
	
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
