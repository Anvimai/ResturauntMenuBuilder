package a5;

public class Sashimi implements Sushi {
	
	public enum SashimiType {TUNA, YELLOwTAIL, EEL, CRAB, SHRIMP};
	
	private SashimiType type; 
	private IngredientPortion[] types; 
	
	public Sashimi(SashimiType type) {
		
		if(type==null) {
			throw new IllegalArgumentException("type value cannot be null");
		}
		
		this.type = type;
		this.types = new IngredientPortion[1];
		
		if(type == SashimiType.TUNA ) {
			types[0]= new TunaPortion(0.75);}
		if(type == SashimiType.YELLOwTAIL ) {
			types[0]= new YellowtailPortion(0.75);}
		if(type == SashimiType.EEL ) {
			types[0]= new EelPortion(0.75);}
		if(type == SashimiType.CRAB ) {
			types[0]= new CrabPortion(0.75);}
		if(type == SashimiType.SHRIMP) {
			types[0]= new ShrimpPortion(0.75);}
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return types[0].getName() + " sashimi";
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return types;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return (int)types[0].getCalories();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return types[0].getCost();
	}

	@Override
	public boolean getHasRice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		return types[0].getIsShellfish();
	}

}
