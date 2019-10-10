package a5;

public class AvocadoPortion extends IngredientPortionImpl{
	

	public AvocadoPortion(double portion) {
		
		super(portion);
		// TODO Auto-generated constructor stub
	
	
	}
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Avocado();}
	
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		
		if(other == null) {return this;}
		
		if(this.getIngredient().equals(other.getIngredient())==false) {
			
			throw new IllegalArgumentException("Ingredients are not the same");
			
		}
		
		
		if(this.equals(other)==true) {
			
			return new AvocadoPortion((this.getAmount()+other.getAmount()));}
		
			
		return this;
	
		
		
	}

}
