public class MCQuestion implements Question
{
    private String type;
    private String question;
    private String answer;

    public MCQuestion (String questionType, String theQuestion, String questionAnswer)
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
    public int compareTo(Question o) {
        return 0;
    }

    @Override
    public int compareTo() {
        return 0;
    }
}
