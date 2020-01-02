public class SMCQuestion extends Question
{
    private String type;
    private String question;
    private String answer;
    private String[] choices;

    public SMCQuestion(String questionType, String theQuestion, String questionAnswers, String[] answerChoices)
    {
        type = questionType;
        question = theQuestion;
        answers = questionAnswer;
        choices = answerChoices;
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
