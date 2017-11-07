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
		String filename;
	}
	
	public void addMember(String member, int year)
	{
		Member newMember = new Member();
		if (newMember != null)
			list.add(newMember);
	}
	
	public void removeMember(String member)
	{
		Member newMember = new Member();
		if (newMember != null)
			list.remove(newMember);
	}
	
	public void listMember(String member)
	{
		Member newMember = new Member();
		if (newMember != null)
			list.remove(newMember);
	}
	
	public void addInterestToMember(String member, String interest, int level)
	{
		Member newMember = new Member();
		if (newMember != null)
			list.remove(newMember);
	}
}
