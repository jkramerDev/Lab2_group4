package services;

import java.util.*;
import java.util.Map.Entry;
import entity.Employee;

public class WhimsicalToysEmployeeReporterImpl implements WhimsicalToysEmployeeReporter {
	private List<Employee> employees;

	public WhimsicalToysEmployeeReporterImpl(List<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public void pickRandomEmployeeAndGiveFreeToy() {
		Random rand = new Random();
		int winner = rand.nextInt(0, employees.size() - 1);
		System.out.print("[The winning randomly chosen employee ID is] : " + employees.get(winner).getID());
		System.out.println(", " + employees.get(winner).getfname() + " " + employees.get(winner).getlname());
	}

	@Override
	public void displayEmployeesByUniqueFirstName() {
		Set<String> uniqueFname = new HashSet<>();
        for (Employee employee : employees) {
            uniqueFname.add(employee.getfname());
        }
	    System.out.println("Unique First Names: " + uniqueFname);
	}

	@Override
	public void countNumberOfEmployeesWithPopularFirstName() {
		Map<String, Integer> popularFName = new HashMap<>();
		for(Employee employee : employees) {
			String fName = employee.getfname();
			if (popularFName.containsKey(fName)) {
				int count = popularFName.get(fName);
				popularFName.put(fName, count + 1);
			}else {
				popularFName.put(fName, 1);
			}
		}
		for(Entry<String, Integer> name : popularFName.entrySet()) {
			System.out.println("First Name: " + name.getKey() + ", count: " + name.getValue());
		}
	}

	@Override
	public void displayWaitingListForLacrosseTickets() {
		Queue<Employee> waitList = new LinkedList<>();
		
		for (Employee emp : employees) {
			waitList.add(emp);
		}
		
		System.out.println("Wait List for tickets: ");
		while(!waitList.isEmpty()) {
			Employee emp = waitList.remove();
			System.out.println(emp.getfname() + " " + emp.getlname());
		}
	}

}

