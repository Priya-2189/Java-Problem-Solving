import java.util.Scanner;
class TrapingRain
{
	/**public static int traped(int a[],int n)
	{
		int lmax=a[0],rmax=a[n-1];
		int i=1,j=n-2,res=0;
		while(i<=j)
		{
			if(lmax<=rmax)
			{
				lmax=Math.max(lmax,a[i]);
				res=res+Math.max(0,lmax-a[i]);
				i++;
			}
			else
			{
				rmax=Math.max(rmax,a[j]);
				res=res+Math.max(0,rmax-a[j]);
				j--;
			}
		}
		return res;
	}**/
	/**public static int traped(int a[],int n)
	{
		int lmax[]=new int[n];
		int rmax[]=new int[n];
	
		int res=0;
		lmax[0]=a[0];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(lmax[i-1],a[i]);
		}
		rmax[n-1]=a[n-1];
		for(int j=n-2;j>=0;j--)
		{
			rmax[j]=Math.max(rmax[j+1],a[j]);
		}
		  for (int k = 0; k < n; k++) {
            res += Math.min(lmax[k], rmax[k]) - a[k];
        }
		return res;
	}*/
	public static List<List<Integer>>FindAll(int a[],int n,int  tar)
	{
		List<List<Integer>>res=new ArrayList<>();
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
	      int x1=tar-a[i];
		  if(hm.containsKey(x1))
		  {
				  List<Integer>al=new ArrayList<>();
				  al.add(a[i]);
				  al.add(x1);
				  res.add(al);
				

			}
			
		 hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	   }  
		return res;
	}
	public static void main(String args[])
     {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the water present is"+traped(a,n));
	 }
	
}