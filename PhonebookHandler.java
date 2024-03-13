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
 
	public List<Contact> sortByName(List<Contact> contacts){
		return contacts;
		
				}

	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
		return null;
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		
	}
			
		}
