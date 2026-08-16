import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.ArrayList;
class Student
{
  int rollno;
  String Sname,branch;
  int total;
  double cgpa;
  public Student(int rollno,String Sname,String branch,int total,double cgpa)
   {
   
      this.rollno=rollno;
	  this.Sname=Sname;
	  this.branch=branch;
	  this.total=total;
	  this.cgpa=cgpa;
	 
   }
    public String toString() {
    return rollno + " " + Sname + " " + branch + " " + total + " " + cgpa;


   
   }
}
class SortByCgpa implements Comparator<Student>
{


   public int compare(Student s1,Student s2)
    {
	  if(s1.cgpa==s2.cgpa)
	  {
	      return 0;
	  
	   }
	   else if(s1.cgpa<s2.cgpa)
	   {
	   return 1;
	   }
	   else  
	    return -1;
	
    }	
}
class QueueMaxArray

{
	public static void main(String arg[])
	{
   Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
	 PriorityQueue<Student> p1=new PriorityQueue<>(new SortByCgpa());
	 ArrayList<Student> sub=new ArrayList<>();
	 for(int i=0;i<n;i++)
	 {
	     int roll=sc.nextInt();
		 String name=sc.next();
		 String br=sc.next();
		 int tot=sc.nextInt();
		 double cgp=sc.nextDouble();
	 
	 
	 Student s1=new Student(roll,name,br,tot,cgp);
	   sub.add(s1);
	  
	 }
	  p1.addAll(sub);
	  while(!p1.isEmpty())
	  {
		  
		  System.out.println(p1.poll());
	  }
	  
	 
	}

}