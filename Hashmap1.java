import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
class Hashmap1
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
		for(String x:s1)
		{
			System.out.println(x+" :"+hm.get(x));
			
		}
		
	}
}	
