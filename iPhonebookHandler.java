package template;
import java.util.List;

public interface iPhonebookHander {
	
	//bubble sort / merge sort would do it
	public List<Contact> sortByName(List<Contact> contacts);
	
	
	/*
	 * To implement searchByName using binary search, we need to make sure that the
	 * phonebook is sorted by names. Here's the modified sortByKeys method using
	 * Merge Sort, followed by the implementation of searchByName using binary
	 * search:
	 */
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name);

	//iterate over the contacts.  
	//no sorting here, just display
	public void display(List<Contact> sortedContacts);
	for(Contact contact: contacts) {
		System.out.println(contact.getName() + " : " + contact.getPhoneNumber());
	}
}
