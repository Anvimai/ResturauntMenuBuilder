package a5;

public class TunaPortion extends IngredientPortionImpl{

	public TunaPortion(Double portion) {
		super(portion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Tuna();}
	
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
