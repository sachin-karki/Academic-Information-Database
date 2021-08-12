package project1;
import java.util.Comparator;

		//Encapsulating variables
		class StudentInfo 
		{
		private String name;
		private int ID;
		private double Gpa;

	StudentInfo()
	{
	  this.name = " ";
	  this.ID = 0;
	  this.Gpa= 0.0;
	}
	
	public StudentInfo(String n,int id,double g) 
		{
		this.name = n;
		this.ID = id;
		this.Gpa = g;
		}
// Returns student Name
String getName()
{
return name;
}
	// Updating Student Name
	void setName(String n)
	{
	name = n;
	}

// Returning ID
int getIDnum()
{
return getID();
}

	// Updating ID
	void setIDnum(int id)
	{
	setID(id);
	}

// Returning GPA
double getgpa()
{
return Gpa;
}

	// Setting the Grade
	void setgpa(double g)
	{
	setgpa(g);
	}

// Method to get ID
public int getID()
{
return ID;
}
	// Method to set the ID
	public void setID(int ID)
	{
	this.ID = ID;
	}

// Method to get the grade
public double getGrade()
{
return Gpa;
}

	// Method to set the grade
	public void setGrade(double Gpa)
	{
	this.Gpa = Gpa;
	}

// Compare method to compare the listing.
public static Comparator<StudentInfo>
NameComparator=new Comparator<StudentInfo >()
{
public int compare(StudentInfo s,StudentInfo s2)
{
	String StudentNameList =s.getName().toUpperCase();
  	String StudentNameList2 =s2.getName().toUpperCase();
	return StudentNameList.compareTo(StudentNameList2);
}};

}