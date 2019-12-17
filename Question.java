public interface Question implements Comparable<Question>
{
	public Question(String type, String question, String answer)
	{
		
	}
	
	public abstract int compareTo();
}
