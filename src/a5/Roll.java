package a5;

public class Roll implements Sushi{
	
	private String name; 
	private IngredientPortion[] roll_ingredients; 
	private boolean hasSeaweed = false; 
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		//The constructor should detect if a particular ingredient 
		//type is repeated and combine the separate portions of a repeated ingredient type into a single portion
		this.roll_ingredients = new IngredientPortionImpl[(roll_ingredients.length + 1)];
		this.name = name; 
		this.roll_ingredients = roll_ingredients.clone(); 
		 for (int i = 0; i < roll_ingredients.length; i++) {
		     for (int j = i + 1 ; j < roll_ingredients.length; j++) {
		          if (roll_ingredients[i].equals(roll_ingredients[j])) {
		                  roll_ingredients[i] = roll_ingredients[i].combine(roll_ingredients[j]);
		                  roll_ingredients[j] = null; 
		          }
		     }
		 }
		 
		 for (IngredientPortion element : roll_ingredients) {
			    if (element.getName().equals("seaweed")) {
			        hasSeaweed = true;
			    }
			}
		 
		 if(hasSeaweed==false) {roll_ingredients[roll_ingredients.length]= new SeaweedPortion(0.1);}
		
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
		return (Math.round(CostCount*100d)/100d);
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
