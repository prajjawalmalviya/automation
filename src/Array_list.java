import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("prajjawal");
		a.add("malviya");
		a.add("Software");
		a.add("Engineer");
		
		System.out.println(a.get(2));
		
		System.out.println(a);
		
		//Create object of the class - object method
		
		for(int i=0; i<a.size(); i++)
		{
			System.out .println(a.get(i));
		}
		System.out.println("*********");
		
		for(String val:a)
		{
			System.out.println(val);
		}
		//Item present in array list
		
	      System.out.println(a.contains("Software"));
	      
	   //convert list in array
	      String[] name = {"Prajjawal","Malviya","Automation","Tester"};
	      List<String> nameArraysList = Arrays.asList(name);
	    System.out.println(nameArraysList.contains("Automation"));
	    
	     
	    
	    
		
		
		

	}

}
