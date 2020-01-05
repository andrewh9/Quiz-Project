public class QuizGrader extends Quiz
{
	System.out.println("Your Quiz Results");
	
	System.out.println("Text Question: " + text.gradeResponse(responses[0]));
	
	System.out.println("Single Choice Question: " + SMC.gradeResponse(responses[1]));
	
	System.out.println("Multiple Choice Question: " + MMC.gradeResponse(responses[2]));
	
	System.out.println("Number Question: " + number.gradeResponse(responses[3]));
}
