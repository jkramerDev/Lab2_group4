package template;
import java.util.List;
import java.util.Map;

public interface iPhonebookHander {
	//bubble sort / merge sort would do it
	public List<Contact> sortByName(Map<Contact,List<PhonebookEntry>> phonebook);
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
}
