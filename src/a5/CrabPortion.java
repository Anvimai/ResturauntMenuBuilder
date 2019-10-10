package a5;

public class CrabPortion extends IngredientPortionImpl{

	public CrabPortion(Double portion) {
		super(portion);
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Crab();}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(this.equals(other)==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(this.equals(other)==true) {
			
			return new CrabPortion(this.getAmount()+ other.getAmount());
			
		}
	
		
		return this;
	}

}
