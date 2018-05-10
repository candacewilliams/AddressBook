import java.util.ArrayList;
import java.util.Collections;
public class AddressBook {
	static ArrayList<PersonEntry> AddressBook;
	static ArrayList <String> UpdatedEntries = new ArrayList<String>();
	public AddressBook() {
		AddressBook = new ArrayList<PersonEntry>();
	}
	public void AddEntry(PersonEntry PersonEntry) {
		AddressBook.add(PersonEntry);
	}
	public void DeleteEntry(PersonEntry PersonEntry) {
		AddressBook.remove(PersonEntry);
	}
	public void EditEntry(PersonEntry OriginalEntry, PersonEntry UpdatedEntry) {
		DeleteEntry(OriginalEntry);
		AddEntry(UpdatedEntry);
	}
	public void SortEntries() {
		ConvertEntriestoString();
		Collections.sort(UpdatedEntries);
		ConvertEntriesBack();	
	}
	public void ConvertEntriestoString() {
		
		for (int i = 0; i < AddressBook.size(); i++) {
			PersonEntry Entry = AddressBook.get(i);
			String Person = String.valueOf(Entry);
			UpdatedEntries.add(Person);
		}
	}
	
public ArrayList<PersonEntry> ConvertEntriesBack() {
		AddressBook.clear();
		for (int i = 0; i < UpdatedEntries.size(); i++) {
			PersonEntry Person = new PersonEntry(UpdatedEntries.get(i)); 
			AddressBook.add(Person);
		}
		return AddressBook;
}
	public void OpenBook() {
		for (int i = 0; i < AddressBook.size(); i++) {
			PersonEntry Entry = AddressBook.get(i);
			System.out.println(Entry);
				
			}
		}
}