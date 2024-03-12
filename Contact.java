package template;
import java.util.ArrayList;
import java.util.List;
/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

public class Contact {
	 private String name;
	 private List<PhonebookEntry> phonebookEntries;
	 
	 public Contact(String name) {
		 this.name = name;
		 this.phonebookEntries = new ArrayList<>();
	 }
	 public void addPhonebookEntry(PhonebookEntry entry) {
		 phonebookEntries.add(entry);
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName (String name) {
		 this.name = name;
	 }
	 public List<PhonebookEntry> getPhonebookEntries(){
		 return phonebookEntries;
	 }
	 public void setPhonebookEntries(List<PhonebookEntry> phonebookEntries) {
		 this.phonebookEntries = phonebookEntries;
	 }
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Contact contact = (Contact)obj;
		return name.equals(contact.name);
	}

}
