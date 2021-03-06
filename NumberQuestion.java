public class NumberQuestion extends Question
{
    private String type;
    private String question;
    private String answer;

    public NumberQuestion(String questionType, String theQuestion, String questionAnswer)
    {
      	super(questionType, theQuestion, questionAnswer);
    }
    
    public String getType()
    {
        return type;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getAnswer()
    {
       return answer;
    }
    
    public String gradeResponse(String response)
    {
        if(response.equals(answer))
            return "Correct";
        else
            return "Incorrect";
    }
}
