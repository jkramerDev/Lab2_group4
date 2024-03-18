package template;
import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{

	Map<Contact, List<PhonebookEntry>> phonebook;
	
	public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
		this.phonebook = phonebook;
	}


	@Override
	//bubble sort
	public List<Contact> sortByName(Map<Contact, List<PhonebookEntry>> phonebook) {
	    List<Contact> sortedContacts = new ArrayList<>();
	    sortedContacts.addAll(phonebook.keySet());
	    
	    for (int i = 0; i < sortedContacts.size() - 1; i++) {
	        for (int j = 0; j < sortedContacts.size() - i - 1; j++) {
	            if (sortedContacts.get(j).getCname().compareTo(sortedContacts.get(j + 1).getCname()) > 0) {
	                Contact temp = sortedContacts.get(j);
	                sortedContacts.set(j, sortedContacts.get(j + 1));
	                sortedContacts.set(j + 1, temp);
	            }
	        }
	    }
	    return sortedContacts;
	}
	
	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
	    int low = 0;
	    int high = sortedContacts.size() - 1;

	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        int compare = sortedContacts.get(mid).getCname().compareTo(name);
	        if (compare == 0) {
	            return sortedContacts.get(mid).getPhonebookEntries();
	        } else if (compare < 0) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    System.out.println("no matches found");
	    return new ArrayList<>(); // not found
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		for (Contact c : sortedContacts)
			System.out.println(c.getCname());
	}
}
