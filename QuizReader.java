import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QuizReader
{
	String[] questions = new String[4];
	String[] answers = new String[4];
	ArrayList<String> choicesSMC = new ArrayList<String>();
	ArrayList<String> choicesMMC = new ArrayList<String>();
	
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader file = new FileReader("quiz.txt");
		Scanner s = new Scanner (file);
		
		for(int i = 0; i < 4; i++)
		{
			String type = s.next();
	
			if(type.equals("T"))
			{
				questions[0] = s.nextLine();
				answers[0] = s.nextLine();
			}
			
			else if(type.equals("S"))
			{
				questions[1] = s.nextLine();
				
				for(int j = 0; j < 100; j++)
				{
					String correctness = s.next();
				
					String choice = s.next();
				
					if(correctness.equals("+")
				  		answers[1] = choice;
					if(correctness.equals("+") || correctness.equals("-"))
						choicesSMC.add(choice);
					else if(! correctness.equals("-") && ! correctness.equals("+"))
					    break;
				}
			}
					   
			else if(type.equals("M")
			{
				questions[2] = s.nextLine();
				
				answers[2] = "";
				
				for(int k = 0; k < 100; k++)
				{
					String correctness1 = s.next();
						
					String choice1 = s.next();
					
					if(correctness1.equals("+")
					   answers[2] += choice1 + " ";
					if(correctness1.equals("+") || correctness1.equals("-"))
						choicesMMC.add(choice1);
					else if(! correctness1.equals("-") && ! correctness1.equals("+"))
					   break;
				}
				
			}
					   
			else if(type.equals("N")
			{
				questions[3] = s.nextLine();
				
				Double number = (int)(s.nextDouble() * 10 + 0.5) / 10.0;
				
				answers[3] = number.toString();
			}
		}
		
	}
}
