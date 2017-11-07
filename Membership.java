import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Membership implements Serializable
{
	private static final long serialVersionUID = 1L;
	private List<Member> mship;
	
	public Membership()
	{
		mship = new LinkedList<Member>();
	}
	
	public Iterator<Member> iterator()
	{
		return mship.iterator();
	}
	
	public static Membership load(String filename) throws IOException, ClassNotFoundException, FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Membership mship = (Membership) ois.readObject();
		ois.close();
		
		return mship;
	}
	
	public void save(String filename) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(filename); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(mship); 
		oos.flush(); 
		oos.close(); 
	}
	
	public void listSelf()
	{
		// If mship is not empty, list all members
		if (mship.size() > 0)
		{
			for(Member m : mship)
				// The toString method of Member returns the name of the member
			    System.out.println(m);
		}
		else
			System.out.println("Current membership is empty.");
	}
	
	public void addMember(String member, int year)
	{
		boolean exists = false;
		for(Member m : mship)
		{
		    if (m.getName().equals(member))
		    	exists = true;
		}
		
		if (!exists)
		{
			Member newMember = new Member(member, year);
			mship.add(newMember);
		}
		else
			System.out.println(member + " already exists");
		
	}
	
	public void removeMember(String member)
	{
		// need help
		boolean exists = false;
		for(Member m : mship)
		{
		    if (m.getName().equals(member))
		    {
		    	exists = true;
		    	mship.remove(m);
		    	System.out.println(member + " has been removed.");
		    }
		}
		
		if (!exists)
			System.out.println(member + " does not exist.");
	}
	
	public void listMember(String member)
	{
		boolean exists = false;
		for(Member m : mship)
		{
		    if (m.getName().equals(member))
    		{
		    	exists = true;
		    	m.listSelf();
    		}
		}
		
		if (!exists)
			System.out.println(member + " does not exist.");
	}
	
	public void addInterestToMember(String member, String interest, int level)
	{
		boolean exists = false;
		for(Member m : mship)
		{
		    if (m.getName().equals(member))
    		{
		    	exists = true;
		    	m.addInterest(interest, level);
    		}
		}
		
		if (!exists)
			System.out.println(member + " does not exist.");
	}
}
