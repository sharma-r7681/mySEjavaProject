import java.util.*;
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String comments = "";
		System.out.println("Welcome To Stay Fit App");
		System.out.println("");
		System.out.println("Calculate Your BMI");
		System.out.println("------------------------------------");
		System.out.println("Please enter Name ");
		String name = scanner.nextLine();
		System.out.println("Please enter your height (in centimeter)");
		int height = scanner.nextInt();
		System.out.println("Please enter your weight (in Kg)");
		int weight = scanner.nextInt();
		bmi newBmi = new bmi(name, height, weight);
		newBmi.calculate(height, weight);
		float bmi = newBmi.calculate(height, weight);
		System.out.println("Your BMI is :"+ bmi);
		if(bmi>25)
		 comments += "You are Over Weight!";
		if(bmi<25 && bmi>18.5)
		 comments += "You are Healthy!";
	    if(bmi<18.5)
	     comments += "You are Under Weight!";
		   
		    System.out.println(comments);
			System.out.println("------------------------------------");
			System.out.println("");
		   System.out.println("Do you wana See Your Diet ? (1: Yes  2: No)");
		   int input = scanner.nextInt();
		   
		   if(input == 1)
		   {
			   diet newDiet= new diet(weight);
			   if(bmi>25)
				System.out.println(newDiet.dietForOver());
			   if(bmi<25 && bmi>18.5)
				System.out.println(newDiet.dietForHealty());
			   if(bmi<18.5)
				System.out.println(newDiet.dietForUnder());
			   System.out.println("------------------------------------");
				System.out.println("");
			   System.out.println("Do you wana add Trainer or Dietition ? (1: Yes  2: No)");
			   int input1 = scanner.nextInt();
			   if(input1 ==1 )
			   {
				   System.out.println("Press 1: Trainer    2: Dietitian");
				   int input3 = scanner.nextInt();
				   if(input3 == 1)
				   {
					   trainer newTrainer = new trainer();
					   newTrainer.displayTrainer();
					   System.out.println("Please select trainer e.g(1,2,3....) ");
					   int input2 = scanner.nextInt();
					   System.out.println(newTrainer.trainer(input2-1));
				  
					   System.out.println("");
					   System.out.println("------------------------------------");
					   System.out.println("If you need any help. Please contact us at abc@example.com");
					   System.out.println("ThankYou! \n Logout !!");
				   }
				   if(input3 == 2)
				   {
					   dietitian newDietitian = new dietitian();
					   newDietitian.displaydietitian();
					   System.out.println("Please select dietitian e.g(1,2,3....) ");
					   int input2 = scanner.nextInt();
					   System.out.println(newDietitian.dietitian(input2-1));
				  
					   System.out.println("");
					   System.out.println("------------------------------------");
					   System.out.println("If you need any help. Please contact us at abc@example.com");
					   System.out.println("ThankYou! \n Logout !!");
				   }
			   }
			   else
			   {
				   System.out.println("");
				   System.out.println("------------------------------------");
				   System.out.println("If you need any help. Please contact us at abc@example.com");
				   System.out.println("ThankYou! \n Logout !!"); 
			   }
		   }
		   else
			   if(input == 2)
			   {
				   System.out.println("");
				   System.out.println("------------------------------------");
				   System.out.println("ThankYou! \n Logout !!"); 
				   System.out.println("If you need any help. Please contact us at abc@example.com");
			   }
	}

}
