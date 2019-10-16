package a5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Roll implements Sushi{
	
	private String name; 
	private IngredientPortion[] roll_ingredients; 
	private boolean hasSeaweed = false; 
	private List<IngredientPortion> list_roll_ingredients;
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		//The constructor should detect if a particular ingredient 
		//type is repeated and combine the separate portions of a repeated ingredient type into a single portion
		
		this.name = name; 
		this.roll_ingredients = roll_ingredients.clone();
		//this.roll_ingredients = roll_ingredients.clone(); 
		this.list_roll_ingredients = new ArrayList<IngredientPortion>(Arrays.asList(roll_ingredients.clone()));
		
		 for (int i = 0; i < roll_ingredients.length; i++) {
		     for (int j = i + 1 ; j < roll_ingredients.length; j++) {
		          if (roll_ingredients[i].getIngredient().equals(roll_ingredients[j].getIngredient())) {
		                  list_roll_ingredients.set(i, (roll_ingredients[i].combine(roll_ingredients[j])));
		                  list_roll_ingredients.remove(j); 
		          }
		     }
		 }
		 for (IngredientPortion element : roll_ingredients) {
			    if (element.getIngredient().equals(new Seaweed())==true) {
			        hasSeaweed = true;
			    }
			}
		 for (IngredientPortion element : roll_ingredients) {
			    if ((element.getIngredient().equals(new Seaweed())==true) && (element.getAmount()<0.12)) {
			        list_roll_ingredients.remove(element);
			        list_roll_ingredients.add(new SeaweedPortion(0.12));}
			}
		 
		 if(hasSeaweed==false) {list_roll_ingredients.add(new SeaweedPortion(0.12));}
		 
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		
		IngredientPortion[] arrIng = new IngredientPortion[list_roll_ingredients.size()];
		
		arrIng = list_roll_ingredients.toArray(arrIng); 
		
		return arrIng;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		int calCount = 0; 
		//for(int i =0; i<list_roll_ingredients.size(); i++) {
			//calCount+=roll_ingredients[i].getCalories();
		//}
		
		for(int i = 0; i < list_roll_ingredients.size(); i++)
		    calCount += list_roll_ingredients.get(i).getCalories();
;
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
