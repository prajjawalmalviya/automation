
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr= {1,2,3,4,5};
		
	System.out.println(arr[3]);
		
		//for loop  
		for(int i=0; i<arr.length; i++)
	{
			System.out.println(arr[i]);
		}
		
		//when we don't know length of the array the use arr.length
		int[] arr2= {1,3,5,3,6,8,4,9};
		
	    System.out.println(arr2[4]);
	      	
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name= {"prajjawal","malviya", "Software", "Engineer"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s:name)
		{
			System.out.println(s);
		}
		
		  

	}

}
