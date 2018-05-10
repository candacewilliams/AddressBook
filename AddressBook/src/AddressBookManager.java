import java.util.ArrayList;

public class AddressBookManager {
	static ArrayList<AddressBook> AddressBookManager;
	public AddressBookManager() {
		AddressBookManager = new ArrayList<AddressBook>();
	}
	public void AddBook(AddressBook Book) {
		AddressBookManager.add(Book);
	}
	
	public void DeleteBook() {
		for (int i = 0; i < AddressBookManager.size(); i++) {
			AddressBookManager.remove(i);
		}
	}
}
