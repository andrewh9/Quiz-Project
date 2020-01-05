public class SMCQuestion extends Question
{
    private String type;
    private String question;
    private String answer;

    public SMCQuestion(String questionType, String theQuestion, String questionAnswers)
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
