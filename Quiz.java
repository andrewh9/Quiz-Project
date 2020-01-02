import java.util.Scanner;
import java.util.ArrayList;

public class Quiz extends QuizReader
{
	String[] responses = new String[4];

	public abstract void main(String[] args)
	{
		TextQuestion text = new TextQuestion("T", questions[0], answers[0]);
		SMCQuestion SMC = new SMCQuestion("S", questions[1], answers[1], choicesSMC);
		MMCQuestion MMC = new MMCQuestion("M", questions[2], answers[2], choicesMMC);
		NumberQuestion number = new NumberQuestion("N", questions[3], answers[3]);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(text.getQuestion());
		responses[0] = s.next();
		
		System.out.println(SMC.getQuestion());
		responses[1] = s.next();
		
		System.out.println(MMC.getQuestion() + " Enter answers in listed order with only spaces separating them.");
		responses[2] = s.nextLine();
		
		System.out.println(number.getQuestion());
		Double numberResponse = s.nextDouble();
		responses[3] = numberResponse.toString();
	}
}
