public class SMCQuestion implements Question
{
    private String type;
    private String question;
    private String answer;

    public SMCQuestion (String questionType, String theQuestion, String questionAnswer)
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

    @Override
    public int compareTo() {
        return 0;
    }

    public int compareTo(SMCQuestion response) {
        if(this.getAnswer().equals(response.getAnswer()))
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public int compareTo(Question o) {
        return 0;
    }
}
