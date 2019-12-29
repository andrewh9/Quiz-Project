import java.util.Scanner;

public class Quiz
{
		public abstract void main(String[] args)
		{
   		FileReader file = new FileReader("quiz.txt");
			Scanner s = new Scanner (file);
		
			String type = s.next();
	
			if(type.equals("T"))
			{
					String question = s.nextLine();
					String answer = s.nextLine();
			}
		}
}
