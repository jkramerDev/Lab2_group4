package linkedList;

public class LinkedListImpl implements LinkedList {
	private ListItem head;
	
	public LinkedListImpl() {
		head = null;
	}
	
	@Override
	public Boolean isItemInList(String thisItem) {
		//if done = false, item is not in list. if true item is in the list 
		ListItem pre = null;
		ListItem curr = head;
		boolean done = false;
		while (curr != null && !done) {
			if (curr.getData().equalsIgnoreCase(thisItem) == false) {
				curr = curr.getNext();
				pre = curr;
			} else 
				done = true;
		}
		return done;
	} 
	
	@Override
	public Boolean addItem(String thisItem) {
		//when head empty add Item to head else find next empty node and add item there 
		//return true when item is added
		if (head == null) {
			head = new ListItem(thisItem);
		} else {
			ListItem current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new ListItem(thisItem);
		}
		return true;
	}
	

	@Override
	public Integer itemCount() {
		int count = 0;
		ListItem curr = head;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	@Override
	public void listItems() {
		System.out.println("");
		ListItem current = head;
        while (current != null) {
        	System.out.println(current.getData());
        	current = current.getNext();
    	}
    }

	@Override
	public Boolean deleteItem(String thisItem) {
	//if false item is not in list therefore nothing to delete 
	//else delete previous.next node cuz its linked to the next node which holds the data value
		
		boolean search = isItemInList(thisItem);
		ListItem curr = head;
		ListItem previous = null;
		
		if (head == null){
			return false;
		}
		if (search == false) {
			return false;
		}else{ 
			if (curr.getData().equals(thisItem)) {
	            head = curr.getNext();
	            return true;
			}
			while(curr.getData().equals(thisItem) == false) {
				previous = curr;
				curr = curr.getNext();
			}
			previous.setNext(curr.getNext());
	        return true;
		}
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		
	}	
}
