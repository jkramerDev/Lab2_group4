package template;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

class Contact {
	private String Cname; 
	private ArrayList<PhonebookEntry> Entries;
	
	public Contact(String Cname) {
		this.setCname(Cname);
		this.Entries = new ArrayList<>();
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		this.Cname = cname;
	}
	
	public void addPhonebookEntry(String number, String type) {
		PhonebookEntry entry = new PhonebookEntry(number, type);
		Entries.add(entry);
	}
	

	public List<PhonebookEntry> getPhonebookEntries() {
		return Entries;
	}
	
	@Override
    public String toString() {
        return "Name: " + Cname  + ", Phone Number(s): " + Entries;
    }
	
	@Override
	public int hashCode() {
	    return Objects.hashCode(Cname.length());
	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
        	return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
        	return false;
        }
        Contact contact = (Contact)obj;
        return Cname.equals(contact.Cname);
    }
}
