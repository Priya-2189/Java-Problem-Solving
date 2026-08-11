import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
class TripletAllElement
{
   /** public static List<List<Integer>>FindAll(int a[],int n,int tar)
	{
			List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<n-1;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					
					if(a[i]+a[j]+a[k]==tar)
					{
						ArrayList<Integer>res=new ArrayList<>();
					   res.add(a[i]);
					   res.add(a[j]);
					   res.add(a[k]);
					   al.add(res);
					}
				}
			}
			
		}
		return al;
	}*/
	/**public static List<List<Integer>>FindAll(int a[],int n,int  tar)
	{
	   Arrays.sort(a);
		List<List<Integer>>al=new ArrayList<>();
		for(int i=0;i<n-2;i++)
		{
			int l=i+1,r=n-2;
			
		 while(l<r)
		 {
			ArrayList<Integer>res=new ArrayList<>();
			
				if(a[i]+a[l]+a[r]==tar)
				{
					res.add(a[i]);
					res.add(a[l]);
					res.add(a[r]);
					al.add(res);
					l++;
					r--;
				}
				else if(a[i]+a[l]+a[r]<tar)
				{
				 l++;
				}
				else
				{
				 r--;
				}
		}
	}
		return al;
	}*/
	
	public static List<List<Integer>> FindAll(int a[], int n, int tar) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            int newTarget = tar - a[i]; 
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                int x1 = newTarget - a[j];

                if (hm.containsKey(x1)) {
                    List<Integer> al = new ArrayList<>();
                    al.add(a[i]);
                    al.add(a[j]);
                    al.add(x1);
                    Collections.sort(al); 
                    if (!res.contains(al)) 
                        res.add(al);
                }

                hm.put(a[j], hm.getOrDefault(a[j], 0) + 1);
            }
        }
        return res;
    }

   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the target number");
		int tar=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the pairs are"+FindAll(a,n,tar));
		
	}
}
