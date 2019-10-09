package a5;

public class AvocadoPortion extends IngredientPortionImpl{

	public AvocadoPortion(Double portion) {
		
		
		super(portion);
		// TODO Auto-generated constructor stub
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
	
	}
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Avocado();}
	
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
