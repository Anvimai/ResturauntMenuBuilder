package a5;

public class Nigiri implements Sushi {
	
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	private NigiriType type; 
	private IngredientPortion[] types; 
	
	public Nigiri(NigiriType type) {
		this.type = type;
		this.types = new IngredientPortion[2];
		
		if(type == NigiriType.TUNA ) {
			types[0]= new TunaPortion(0.75);
			types[1]= new RicePortion(0.5);}
		if(type == NigiriType.YELLOWTAIL ) {
			types[0]= new YellowtailPortion(0.75);
			types[1]= new RicePortion(0.5);}
		if(type == NigiriType.EEL ) {
			types[0]= new EelPortion(0.75);
			types[1]= new RicePortion(0.5);}
		if(type == NigiriType.CRAB ) {
			types[0]= new CrabPortion(0.75);
			types[1]= new RicePortion(0.5);}
		if(type == NigiriType.SHRIMP) {
			types[0]= new ShrimpPortion(0.75);
			types[1]= new RicePortion(0.5);}
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return types[0].getName() + " nigiri";
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return types;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		
		return ((int)(types[0].getCalories()+types[1].getCalories()));
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (types[0].getCost()+types[1].getCost());
	}

	@Override
	public boolean getHasRice() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		return types[0].getIsShellfish();
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

}
