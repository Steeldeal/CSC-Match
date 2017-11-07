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

public class Membership
{
	private List<Member> list;
	
	public Membership()
	{
		list = new LinkedList<Member>();
	}
	
	public Iterator<Member> iterator()
	{
		return list.iterator();
	}
	
	public boolean exists(String member)
	{
		boolean exists = false;
		for(Member m : list)
		{
		    if (m.Name == member)
		    	exists = true;
		}
		return exists;
	}
	
	public static Membership load(String filename) throws IOException, ClassNotFoundException
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
		oos.writeObject(this); 
		oos.flush(); 
		oos.close(); 
	}
	
	public void listSelf()
	{
		for(Object o : list)
		{
		    System.out.println(o);
		}
	}
	
	public void addMember(String member, int year)
	{
		boolean exists = false;
		for(Member m : list)
		{
		    if (m.Name == member)
		    	exists = true;
		}
		
		if (!exists)
		{
			Member newMember = new Member(member, year);
			list.add(newMember);
		}
		else
		{
			System.out.println(member + " already exists");
		}
		
	}
	
	public void removeMember(String member)
	{
		// need help
		boolean exists = false;
		for(Member m : list)
		{
		    if (m.Name == member)
		    {
		    	exists = true;
		    	System.out.println(member + " has been removed.");
		    }
		}
		
		if (!exists)
		{
			System.out.println(member + " does not exist.");
		}
	}
	
	public void listMember(String member)
	{
		boolean exists = false;
		for(Member m : list)
		{
		    if (m.Name == member)
    		{
		    	exists = true;
		    	System.out.println(m.Name);
		    	System.out.println(m.Year);
		    	System.out.println("(Interests here)");
		    	System.out.println("(Favorites here)");
    		}
		}
		
		if (!exists)
		{
			System.out.println(member + " does not exist.");
		}

	}
	
	public void addInterestToMember(String member, String interest, int level)
	{
		String i;
	}
}
