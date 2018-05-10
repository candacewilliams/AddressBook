import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//AddressBookManager Manager = new AddressBookManager();
		Scanner UserInput = new Scanner(System.in);
		System.out.println(" Enter in the following Format: First & Last Name, Address, City, Zip, Phone Number ");
		String PersonInfo = UserInput.nextLine();
		PersonEntry Person= new PersonEntry(PersonInfo);
		AddressBook Book = new AddressBook();
		Book.AddEntry(Person);
		
		System.out.println("*******************");
		
		System.out.println(" Enter in the following Format: First & Last Name, Address, City, Zip, Phone Number ");
		String PersonInfo2 = UserInput.nextLine();
		PersonEntry Person2= new PersonEntry(PersonInfo2);
		Book.AddEntry(Person2);
		
		System.out.println("*******************");
		System.out.println(" Enter in the following Format: First & Last Name, Address, City, Zip, Phone Number ");
		String PersonInfo3 = UserInput.nextLine();
		PersonEntry Person3= new PersonEntry(PersonInfo3);
		Book.AddEntry(Person3);
	
		
		Book.SortEntries();
		System.out.println("*******************");
		
		Book.OpenBook();
		
		UserInput.close();
	}

}