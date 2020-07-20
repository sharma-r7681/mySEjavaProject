
public class dietitian {
	private String[] dietitianId = {"201", "202", "203", "204"};
	private String[] dietitianName = {"Dr. Shawn", "Dr. Mike", "Dr. Garry", "Dr. Liza"};
	private String[] dietitianCost = {"$165.0","$158.0", "$151.0", "$155.0"};
	
	
	
	
	public void displaydietitian()
	{
		int j=1;
		for(int i=0; i<dietitianId.length; i++)
		{
			
			System.out.println(j+"\t" +dietitianId[i] + "\t"+ dietitianName[i]+ "\t\t"+ dietitianCost[i]);
			j++;
		}
	}
	
	public String dietitian(int x)
	{
		
		return "Dietitian added : \n Dietitian Name: " + dietitianName[x] + "\n Dietitian Cost: " + dietitianCost[x];
	}
}
