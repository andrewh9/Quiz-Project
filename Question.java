public abstact class Question
{
    public Question(String questionType, String theQuestion, String questionAnswer){};
    
    public abstract String getType();
    
    public abstract String getQuestion();
    
    public abstract String getAnswer();
}
