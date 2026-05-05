package dao;
import java.util.List;

import com.dto.Employee;

import java.util.ArrayList;



public class Dao {
	
	static List list ;
	static {
		list = new ArrayList();
	}
	
	
	public List insert(Employee e) {
		ArrayList alMsg = new ArrayList();
		
		
		try {
		list.add(e);
		
		alMsg.add("Data inserted sucessfully");
		return alMsg;
		}
		catch(Exception excetion)
		{
			alMsg.add("Something Went wrong");
			return alMsg;
		}
		
	}
	
	public List readAllEmployees() {
		ArrayList alMsg = new ArrayList();
		return list;
	}
	
	public List deleteEmployee(int id ) {
		ArrayList alMsg = new ArrayList();
		int count = 0;
		if(list.size()==0) {
			
			alMsg.add("List is Empty");
			return alMsg;
		}
		for(int i = 0;i< list.size();i++) {
			Employee e = (Employee)list.get(i);
			if(e.getEmployeeId()==id) {
				list.remove(i);
				count++;
//				System.out.println("Remove working");
				
		
				alMsg.add("Removed Successfully");
				break;
				
			}
			
			
		}
		
		if(count == 0) {
			alMsg.add("Employee id not Matched");
		}
		
		return alMsg;
		
	}

	public List update(int n,String name ) {
		List alMsg = new ArrayList();
		
		for(int i = 0;i<list.size();i++) {
			    Employee e =(Employee)  list.get(i);
			if(    e.getEmployeeId()== n) {
				e.setName(name);
				 alMsg.add("Updated Record successfully");
				 return alMsg;
			}
			
		}
		
		alMsg.add("No matching id found");
		
		// TODO Auto-generated method stub
		return alMsg;
	}

}
