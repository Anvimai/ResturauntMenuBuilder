package a5;

public class TunaPortion extends IngredientPortionImpl{

	public TunaPortion(Double portion) {
		super(portion);
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
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
			
			return new TunaPortion(this.getAmount()+ other.getAmount());
			
		}
	
		
		return null;
	}

}
