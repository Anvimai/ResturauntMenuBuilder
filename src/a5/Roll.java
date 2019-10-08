package a5;

public class Roll implements Sushi{
	
	private String name; 
	private IngredientPortion[] roll_ingredients; 
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		
		this.name = name; 
		this.roll_ingredients = roll_ingredients.clone(); 
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		
		IngredientPortion[] ingredients = roll_ingredients.clone();
		
		return ingredients;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		int calCount = 0; 
		for(int i =0; i<roll_ingredients.length; i++) {
			calCount+=roll_ingredients[i].getCalories();
		}
		return calCount;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		Double CostCount = 0.0; 
		for(int i =0; i<roll_ingredients.length; i++) {
			CostCount+=roll_ingredients[i].getCost();
		}
		return CostCount;
	}

	@Override
	public boolean getHasRice() {
		// TODO Auto-generated method stub
		for(int i =0; i<roll_ingredients.length; i++) {
			if(roll_ingredients[i].getIsRice()==true) {return true;}
		}
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		for(int i =0; i<roll_ingredients.length; i++) {
			if(roll_ingredients[i].getIsShellfish() ==true) {return true;}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		for(int i =0; i<roll_ingredients.length; i++) {
			if(roll_ingredients[i].getIsVegetarian() ==true) {return true;}
		}
		return false;
	}

}
