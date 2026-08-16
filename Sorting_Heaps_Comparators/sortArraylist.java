
import java.util.Comparator;
import java.util.*;
class Student
{
	int rollno;
	String sname;
	String branch;
	int total;
	double Cgpa;
	Student(int roll,String name,String br,int tot,double perc)
	{
		rollno=roll;
		sname=name;
		branch=br;
		total=tot;
		Cgpa=perc;
    }
     public String toString() {
        return rollno + " " + sname + " " + branch + " " + total + " " + Cgpa;
    }
    
}

	
class SortByRollno implements Comparator<Student>
{
	
  public int compare(Student s1, Student s2)
  {
	  if(s1.rollno==s2.rollno)
		  return 0;
	  else if(s1.rollno>s2.rollno)
		  return 1;
	  else
		  return -1;
  }
}
class SortBySname implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		 if(s1.sname.compareTo(s2.sname)==0)
			 return 0;
		 else if(s1.sname.compareTo(s2.sname)>0)
			 return 1;
		 else
			 return -1;
    }
}
class SortBybranch implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		 if(s1.branch.compareTo(s2.branch)==0)
			 return 0;
		 else if(s1.branch.compareTo(s2.branch)>0)
			 return 1;
		 else
			 return -1;
    }
}
class SortByTotal implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		 if(s1.total==s2.total)
			 return 0;
		 else if(s1.total>s2.total)
			 return 1;
		 else
			 return -1;
    }
}
class SortByCgpa implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		 if(s1.Cgpa ==s2.Cgpa)
			 return 0;
		 else if(s1.Cgpa>s2.Cgpa)
			 return 1;
		 else
			 return -1;
    }
}
class Main
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Student>al=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			 int rolln=sc.nextInt();
			 String name=sc.next();
			 String br=sc.next();
			 int tot=sc.nextInt();
			 double per=sc.nextDouble();
			 Student s1=new Student( rolln,name,br,tot,per);
			 al.add(s1);
		}
   for(Student s1:al)
   {
      System.out.println(s1);
   }
   Collections.sort(al,new SortByRollno());   
   
	   for(Student s1:al)
	   {
		   System.out.println(s1);
	   }
	}
}	