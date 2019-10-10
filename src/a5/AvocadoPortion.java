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
		
		if(this.equals(other)==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(this.equals(other)==true) {
			
			return new AvocadoPortion(this.getAmount()+ other.getAmount());
			
		}
	
		
		return this;
	}

}
