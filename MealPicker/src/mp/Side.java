package mp;
import java.util.ArrayList;

public class Side {
	String name;
	ArrayList<String> ingredients ;
	
	public Side(String name, ArrayList<String> ingred) {
		this.name = name;
		this.ingredients = ingred;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIngredients(ArrayList<String> ingred) {
		this.ingredients = ingred;
	}
	
	public boolean addIngredient(String ingred) {
		return ingredients.add(ingred);
	}
	
	public boolean removeIngredient(String ingred) {
		return ingredients.remove(ingred);
	}
}
