public class SMCQuestion extends Question
{
    private String type;
    private String question;
    private String answers[];

    public SMCQuestion (String questionType, String theQuestion, String questionAnswers[])
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
       for(int i = 0; i < answers.length; i++)
       {
            System.out.println(answers[i]);
       }
    }
}
