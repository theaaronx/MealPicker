package mp;

import java.util.ArrayList;
import java.util.Date;

public class Meal {

	public String name;
	public String meat;
	public ArrayList<Side> sides;
	public int difficulty;
	public int cookTime;
	public int daysSince;
	public Date dateSince;
	
	/**
	 * Constructor
	 */
	public Meal(String name, String meat, ArrayList<Side> sides, int difficulty, int cookTime, int daysSince) {
		setName(name);
		setMeat(meat);
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

	public Date getDateSince() {
		return dateSince;
	}

	public void setDateSince(Date dateSince) {
		this.dateSince = dateSince;
	}
	
	
}
