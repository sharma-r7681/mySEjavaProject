
public class diet {
	
	private String diet;
	private int weight;
	
	public diet(int weight)
	{
		this.weight = weight;
	}
	
	public String dietForHealty()
	{
		float protien = (float) (weight * 1.7);
		float carbs = (float) (weight * 4);
		float fats = (float) (weight * 0.75);
		float fibers = (float) (weight * 0.5);
		int water = 3;
		diet = "You need : \n Calories: 2000 Kcal per day \n Protien: "+ protien +"grams per day \n Carbohydrates: "+ carbs +"grams per day \n Fats: "+ fats +"grams per day \n Fibers: "+ fibers +"grams per day \n Water: " + water +" liters per day" ;
		return diet;
	}
	
	public String dietForOver()
	{
		float protien = (float) (weight * 2);
		float carbs = (float) (weight * 2);
		float fats = (float) (weight * 0.5);
		float fibers = (float) (weight * 0.5);
		int water = 4;
		diet = "You need : \n Calories: 2000 Kcal per day \n Protien: "+ protien +"grams per day \n Carbohydrates: "+ carbs +"grams per day \n Fats: "+ fats +"grams per day \n Fibers: "+ fibers +"grams per day \n Water: " + water +" liters per day" ;
		return diet;
	}
	
	public String dietForUnder()
	{
		float protien = (float) (weight * 2.2);
		float carbs = (float) (weight * 4.5);
		float fats = (float) (weight * 1);
		float fibers = (float) (weight * 0.25);
		int water = 3;
		diet = "You need : \n Calories: 2000 Kcal per day \n Protien: "+ protien +"grams per day \n Carbohydrates: "+ carbs +"grams per day \n Fats: "+ fats +"grams per day \n Fibers: "+ fibers +"grams per day \n Water: " + water +" liters per day" ;
		return diet;
	}
}
