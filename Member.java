import java.util.LinkedList;
import java.util.List;

public class Member {
	
	private String name;
	private int year;
	private List <Member> FavoriteList;
	private List <Interest> InterestList;
	
	public Member(String nameInput, int yearInput)
	{
		name = nameInput;
		year = yearInput;
		FavoriteList= new LinkedList <Member> ();
		InterestList = new LinkedList <Interest> ();
	}
	
	public String toString() 
	{
		return name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String addInterest(String interestInput, int levelInput)
	{
		return name;
	}
	
	public int getInterestLevel (String topic){
		
		int interestLevel = 0;
		return interestLevel;
		
	}
	
	public void changeInterestLevel (String Interest, int Level) {
		//user choose an interest and a new level for that interest
	}
	
	public int calculateScore (Member member2) {
		//current member's compatibility with entered member's compatibility
		//math stuff
		
		int score = 0;
		return score;
	}
	
	public void getFavorites () {
		System.out.print("Your Favorites are: ");
		System.out.println(FavoriteList);

		
	}
	
	public boolean exists (String Interest) {
		//If the interest exists, then return true, if not then false
		boolean exist = false;
		return exist;
	}
	
	public int getIndex (String Interest) {
		//the number of the interest 
		int count=0;
		int indexCount=0;
		
		return indexCount;
				
	}
	
	public void listSelf() {
		System.out.println("name: " + name);
		System.out.println("year: " + year);
		System.out.println("Interests: ");
		System.out.println(InterestList);
		System.out.println("Favorites: ");
		System.out.println(FavoriteList);

	}

}