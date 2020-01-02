public class SMCQuestion extends Question
{
    private String type;
    private String question;
    private String answer;

    public SMCQuestion(String questionType, String theQuestion, String questionAnswers)
    {
        type = questionType;
        question = theQuestion;
        answers = questionAnswer;
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
}
