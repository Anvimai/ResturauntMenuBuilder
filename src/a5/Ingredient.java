package a5;

public interface Ingredient {

	/* getName()
	 * getCaloriesPerOunce()
	 * getPricePerOunce()
	 * getCaloriesPerDollar()
	 * getIsVegetarian()
	 * getIsRice()
	 * getIsShellfish()
	 * 
	 * Getters for basic characteristics of ingredient.
	 */
	
	String getName();
	int getCaloriesPerOunce();
	double getPricePerOunce();
	boolean getIsVegetarian();
	boolean getIsRice();
	boolean getIsShellfish();

	/* equals(Ingredient other)
	 * 
	 * If other is null, returns false.
	 * Otherwise...
	 * Compares ingredient to other and returns true if both
	 * ingredients have the same name, same calories per ounce,
	 * is within 1 cent in price per ounce, and has the same 
	 * characteristics with regard to being vegetarian, rice, or 
	 * shellfish.
	 * 
	 */
	default double getCaloriesPerDollar() {
		return ((1/this.getPricePerOunce())*this.getCaloriesPerOunce());}
	
	
	default boolean equals(Ingredient other) {
			// TODO Auto-generated method stub
			if(other==null) {
				return false;
			}
			if(this.getName().equals(other.getName()) && this.getCaloriesPerOunce()==(other.getCaloriesPerOunce())
					&& this.getPricePerOunce()==(other.getPricePerOunce()) && this.getIsVegetarian()==(other.getIsVegetarian())
					&& this.getIsRice()==(other.getIsRice()) && this.getIsShellfish()==(other.getIsShellfish())){
				
				return true; 
			}
			return false;
		}
	}


