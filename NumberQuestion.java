public class NumberQuestion extends Question
{
    private String type;
    private String question;
    private String answer;

    public NumberQuestion(String questionType, String theQuestion, String questionAnswer)
    {
      type = questionType;
      question = theQuestion;
      answer = questionAnswer;
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
