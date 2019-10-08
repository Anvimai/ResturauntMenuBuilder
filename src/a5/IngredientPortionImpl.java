package a5;

public class IngredientPortionImpl implements IngredientPortion{
	
	private Double portion;
	
	public IngredientPortionImpl(Double portion) {
		
		this.portion = portion;
		
		
	}


	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return portion;
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(other==null) {
			return this; 
		}
		if(this.equals(other)==true) {
			
			return new IngredientPortionImpl(this.getAmount()+ other.getAmount());
			
		}
		if(this.equals(other)==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		return null;
	}

}
