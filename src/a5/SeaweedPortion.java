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
		
		if(other.getName().equals("seaweed")==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(other.getName().equals("seaweed")==true) {
			
			return new SeaweedPortion(this.getAmount()+ other.getAmount());
			
		}
	
		
		return null;
	}
	
}
