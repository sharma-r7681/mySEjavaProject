
public class trainer {
		
		private String[] trainerId = {"101", "102", "103", "104"};
		private String[] trainerName = {"John", "Eric", "Peterson", "Petric"};
		private String[] trainerCost = {"$55.0","$48.0", "$51.0", "$52.0"};
		
		
		
		
		public void displayTrainer()
		{
			int j=1;
			for(int i=0; i<trainerId.length; i++)
			{
				
				System.out.println(j+"\t" +trainerId[i] + "\t"+ trainerName[i]+ "\t\t"+ trainerCost[i]);
				j++;
			}
		}
		
		public String trainer(int x)
		{
			
			return "Trainer added : \n Trainer Name: " + trainerName[x] + "\n Trainer Cost: " + trainerCost[x];
		}
}

