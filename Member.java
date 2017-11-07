import java.util.LinkedList;
import java.util.List;

public class Member {
	
	String Name;
	int Year;
	List <Member> FavoriteList= new LinkedList <Member> ();
	List <Interest> InterestList = new LinkedList <Interest> ();
	
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
		
		if( member.getIndex(member.getName) == member2.getIndex(member2.getName)
		   {
			   score+= member.getInterestLevel() * member2.getInterestLevel();
		   }
	else{
		score+= (member2.getInterestLevel() / 2);
	}
		
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
		System.out.println("Name: " + Name);
		System.out.println("Year: " + Year);
		System.out.println("Interests: ");
		System.out.println(InterestList);
		System.out.println("Favorites: ");
		System.out.println(FavoriteList);

	}

}
