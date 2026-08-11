import java.util.HashMap;
import java.util.Scanner;
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
			 return b.get(1) - a.get(1);
		}
	    else
		{
			return b.get(0) - a.get(0);
		}
	}
}
class HashFreq
{
  public static ArrayList<ArrayList<Integer>> sortByfreq(int a[],int n)
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
	  return f;
	  
  }
    public static ArrayList<Integer> topKfreq(int a[], int n, int k) {
        ArrayList<ArrayList<Integer>> f = sortByfreq(a, n);
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<k && i<f.size(); i++) {
            result.add(f.get(i).get(1)); // add the value
        }

        return result;
    }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	   System.out.println("enter the number k");
	   int k=sc.nextInt();
	  int a[]=new int[n];
	    System.out.println("enter the number into arraylist");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> topK = topKfreq(a, n, k);
        System.out.println("Top " + k + " elements based on frequency:");
          for(int x : topK) {
             System.out.print(x + " ");
             }

	  
  }

}
