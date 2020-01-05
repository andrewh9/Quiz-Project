public abstract class Question
{
	public String type;
	public String question;
	public String answer;	
	
    public Question(String questionType, String theQuestion, String questionAnswer)
    {
    	super(questionType, theQuestion, questionAnswer);
    }
    
    public abstract String getType();
    
    public abstract String getQuestion();
    
    public abstract String getAnswer();
    
    public abstract String gradeResponse(String response);
}
