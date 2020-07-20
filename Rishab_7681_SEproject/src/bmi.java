
public class bmi {

	private String name;
	private float height;
	private float weight;
	
	public bmi(String name, float height, float weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public float calculate(float height, float weight)
	{
		float heigh = height/100;
		float bmi = (weight / (heigh * heigh));
		return bmi;
	}
	
}
