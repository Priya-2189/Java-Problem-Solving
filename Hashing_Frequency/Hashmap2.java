import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
class Hashmap2
{
    public static void main(String args[])
    {
	    HashMap<String,Double> hm=new HashMap<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of students");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{   String roll=sc.next();
	
			 Double cgpa=sc.nextDouble();
			hm.put(roll,cgpa);
		}
		Set<String> s1=hm.keySet();
		System.out.println("key... values");
		for(Map.Entry<String,Double>e : hm.entrySet())
		{
			String roll=e.getKey();
			Double cgpa=e.getValue();
			System.out.println("roll no : "+roll+"  "+"cgpa: "+cgpa);
			
		}
		
	}
}	
