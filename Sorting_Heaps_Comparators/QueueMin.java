import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;
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
}
class SortByCgpa implements Comparator<Student>
{


   public int compare(Student s1,Student s2)
    {
	  if(s1.cgpa==s2.cgpa)
	  {
	      return 0;
	  
	   }
	   else if(s1.cgpa>s2.cgpa)
	   {
	   return 1;
	   }
	   else  
	    return -1;
	
    }	
}
class QueueMin
{
	public static void main(String arg[])
	{
   Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
	 PriorityQueue<Student> p1=new PriorityQueue<>(new SortByCgpa());
	 for(int i=0;i<n;i++)
	 {
	     int roll=sc.nextInt();
		 String name=sc.next();
		 String br=sc.next();
		 int tot=sc.nextInt();
		 double cgp=sc.nextDouble();
	 
	 
	 Student s1=new Student(roll,name,br,tot,cgp);
	 p1.add(s1);
	 }
	 Iterator<Student>it=p1.iterator();
	 while(it.hasNext())
	 {
	    Student s2=it.next();
		System.out.println(s2.rollno+" "+s2.Sname+" "+s2.branch+" "+s2.total+" "+s2.cgpa);
	 }
	 
	}

}