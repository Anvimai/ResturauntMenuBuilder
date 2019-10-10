package a5;

public class ShrimpPortion extends IngredientPortionImpl {

	public ShrimpPortion(double portion) {
		super(portion);
		
		if(portion<=0) {
			throw new IllegalArgumentException("Portion size must be greater than 0");
		}
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Ingredient getIngredient() {
		
		
		
		return new Shrimp();}
	
	@Override
	public IngredientPortion combine(IngredientPortion other) {	if(other == null) {return this;}
	
	if(this.getIngredient().equals(other.getIngredient())==false) {
		
		throw new IllegalArgumentException("Ingredients are not the same");
		
	}
	
	
	if(this.getIngredient().equals(other.getIngredient())==true) {
		
		return new ShrimpPortion((this.getAmount()+other.getAmount()));}
	
		
	return this;}

}
