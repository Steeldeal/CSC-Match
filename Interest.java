public class Interest {
	String topic;
	int InterestLevel;
	
	public String getName()
	{
		return topic;
	}
	public int getInterestLevel()
	{
		return InterestLevel;
	}
	public void ChangeLevel(int newInterestLevel)
	{
		InterestLevel = newInterestLevel;
	}
}
