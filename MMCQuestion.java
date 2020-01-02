public class MMCQuestion extends Question
{
    private String type;
    private String question;
    private String answer;
    private String choices;

    public MMCQuestion(String questionType, String theQuestion, String questionAnswer, String answerChoices)
    {
      type = questionType;
      question = theQuestion;
      answer = questionAnswer;
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
