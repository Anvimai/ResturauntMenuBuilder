package a5;

public class SeaweedPortion extends IngredientPortionImpl {

	public SeaweedPortion(Double portion) {
		super(portion);
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Seaweed();}
	
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
