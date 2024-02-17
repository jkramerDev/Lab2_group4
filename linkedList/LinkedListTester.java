package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList stations = new LinkedListImpl();
		
		//add stations
		stations.addItem("Town Sqaure");
		stations.addItem("Grocery Store");
		stations.addItem("Fairfield Parking Circle");
		stations.addItem("Shopping Center");
		stations.addItem("Bellermine Hall");
		
		//list stations
		stations.listItems();
		
		//check if itemCount works lol 
		System.out.println(stations.itemCount());
		
		stations.addItem("Jogues Hall");
		stations.addItem("CVS");
		
		System.out.println(stations.itemCount());
		
		//checking isItemInList function
		System.out.println("input station you want to check");
		String userIn = sc.nextLine();
		if (stations.isItemInList(userIn) == true) {
			System.out.println("The station is already added to the list");
		} else {
			stations.addItem(userIn);
			System.out.println("The station is not in the list.");
		}
		
		//Remove a station
		System.out.println("input station to delete: ");
		String userDelete = sc.nextLine();
		if (stations.deleteItem(userDelete) == true) {
			System.out.println("The station has been deleted");
		}else {
			System.out.println("The station does not exist in the List");
		}
		
		//List the stations again
		stations.listItems();
		
		//Add a station before another station
		System.out.println("Adding station before another station...");
		System.out.println("input station to add: ");
		String userAdd = sc.nextLine();
		System.out.println("input station to add before: ");
		String userAddBefore = sc.nextLine();
		if (stations.isItemInList(userAddBefore) == false) {
			System.out.println("The station is not found. cannot add station before. ");
		}else {
			stations.insertBefore(userAdd, userAddBefore);
			System.out.println("station added to list.");
		}
		
		//List the stations
		stations.listItems();
		
		//Add a station after another station
		System.out.println("Adding station after another station...");
		stations.insertAfter("Taffic Circle", "Shopping Center");
		
		//Print the stations
		stations.listItems();
		System.out.println();
		stations.sort();
		stations.listItems();
		

	}

}
