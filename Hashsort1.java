//hashmap sorting with Arraylist
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map;
import java.util.Comparator;
class Sortby implements Comparator<ArrayList<Integer>>
{
	public int compare(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		if(a.get(0).equals(b.get(0)))
		{
			return a.get(1)-b.get(1); // return b.get(1) - a.get(1);
		}
	    else
		{
			return b.get(0)-a.get(0);  //return b.get(0) - a.get(0);
		}
	}
}
class Hashsort1
{
  public static ArrayList<Integer>sortByfreq(int a[],int n)
  {
	  HashMap<Integer,Integer> hm= new HashMap<>();
	  for(int i=0;i<n;i++)
	  {
		  hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	  }
	  ArrayList<ArrayList<Integer>>f =new ArrayList<>();
	  for(Map.Entry<Integer,Integer>en:hm.entrySet())
	  {
		  ArrayList<Integer>t=new ArrayList<>();
		  t.add(en.getValue());
		  t.add(en.getKey());
		  f.add(t);
	  }
	  Collections.sort(f,new Sortby());
	  ArrayList<Integer> ans=new ArrayList<>();
	  for(int i=0;i<f.size();i++)
	  {
		  int c= f.get(i).get(0);
           int x= f.get(i).get(1);
		   for(int j=0;j<c;j++)
		   {
			   ans.add(x);
		   }
		   
		   
	   }
	   return ans;
  }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	    System.out.println("enter the number into arraylist");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer>res= sortByfreq(a,n);
		 System.out.println("The numbers are in sorted oreder");
		for(int x:res)
		{
			System.out.println(x+" ");
		}
	  
  }

}


class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> a:hm.entrySet())
        {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }