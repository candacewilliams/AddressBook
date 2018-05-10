import java.util.Arrays;

public class PersonEntry {
	String[] PersonEntry;
	public PersonEntry(String Entry) {
		PersonEntry = SplitEntry(Entry);
	}
	public String[] SplitEntry(String Entry) {
		PersonEntry = Entry.split(",",-1);
		return PersonEntry;
	}
	public void PrintEntry() 
	{
		for (int i = 0; i < PersonEntry.length; i++) {
			System.out.println(PersonEntry[i]);
		}
	}
	@Override
	  public String toString() {
		String Entry = Arrays.toString(PersonEntry);
	    return Entry;
	  }
}
