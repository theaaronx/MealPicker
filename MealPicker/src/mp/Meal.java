package mp;

import java.util.ArrayList;

public class Meal {

	public String name;
	public String meat;
	public ArrayList<String> ingredients;
	public ArrayList<Side> sides;
	public int difficulty;
	public int cookTime;
	public int daysSince;
	
	/**
	 * Constructor
	 */
	public Meal(String name, String meat, ArrayList<String> ingredients, ArrayList<Side> sides, int difficulty, int cookTime, int daysSince) {
		setName(name);
		setMeat(meat);
		setIngredients(ingredients);
		setSides(sides);
		setDifficulty(difficulty);
		setCookTime(cookTime);
		setDaysSince(daysSince);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeat() {
		return meat;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public int getDaysSince() {
		return daysSince;
	}

	public void setDaysSince(int daysSince) {
		this.daysSince = daysSince;
	}
}
