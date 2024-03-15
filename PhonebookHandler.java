package template;

import java.util.*;
import java.util.List;
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
	public List<Contact> sortByName() {
		List<Contact> sortedContacts = new ArrayList<>();
		sortedContacts.addAll(phonebook.keySet());
		
		for(int current = 0; current < sortedContacts.size() - 1; current++) {
			for(int index = 0; index < sortedContacts.size() - current - 1; index++) {
				if((sortedContacts.get(index).getCname()).compareTo(sortedContacts.get(index - 1).getCname()) < 0) {
					Contact temp = sortedContacts.get(index);
					sortedContacts.set(index, sortedContacts.get(index - 1));
					sortedContacts.set((index - 1), temp);
				}
			}
			current++;
		}
		return sortedContacts;
	}

	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		for (Contact c : sortedContacts)
			System.out.print("contact: "+ c.getCname() + ": " + c.getPhonebookEntries());
		
	}
}
