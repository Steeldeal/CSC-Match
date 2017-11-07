public class Interest {
	private String name;
	private int level;
	
	public Interest(String nameInput, int levelInput)
	{
		name = nameInput;
		level = levelInput;
	}
	
	public String getName()
	{
		return name;
	}
	public int getLevel()
	{
		return level;
	}
	public void ChangeLevel(int levelInput)
	{
		level = levelInput;
	}
}
