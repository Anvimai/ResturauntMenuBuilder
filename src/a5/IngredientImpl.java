package a5;

public class IngredientImpl implements Ingredient{
	
	
	private String name; 
	private int CalsOZ; 
	private double PriceOZ; 
	private boolean isVeg; 
	private boolean isRice; 
	private boolean isShell; 
	
	public IngredientImpl(String name, int CalsOZ, double PriceOZ, boolean isVeg, boolean isRice, boolean isShell) {
		
		this.name = name; 
		this.CalsOZ = CalsOZ;
		this.isRice = isRice; 
		this.isShell = isShell;
		this.isVeg = isVeg; 
		this.PriceOZ = PriceOZ;
		
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getCaloriesPerOunce() {
		// TODO Auto-generated method stub
		return CalsOZ;
	}

	@Override
	public double getPricePerOunce() {
		// TODO Auto-generated method stub
		return PriceOZ;
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return isVeg;
	}

	@Override
	public boolean getIsRice() {
		// TODO Auto-generated method stub
		return isRice;
	}

	@Override
	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return isShell;
	}
	
	 public double getCaloriesPerDollar() {
			return ((1/this.getPricePerOunce())*this.getCaloriesPerOunce());}
	 
	 public boolean equals(Ingredient other) {
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
