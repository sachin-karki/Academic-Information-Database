package project1;
import java.util.ArrayList; //Provides Resizable-array Implement List Interface 
import java.util.Scanner;
public class DriverClass
{
			// Scanner Class
		static Scanner sc = new Scanner(System.in);
		private static int dataset;
		private static int students;
		private static int initial;
	
		public static int getInitial()
	{
		return initial;
 }
		public static void setInitial(int initial)
		{
	DriverClass.initial = initial;
		}
		
		public static int getStudents()
		{
			return students;
	 }
			public static void setStudents(int students)
			{
		DriverClass.students = students;
			}
			
public static int getDataset()
		{
	return dataset;
		}
public static void setDataset(int dataset)
	{
	DriverClass.dataset = dataset;
	}
static ArrayList<StudentInfo> studentInfo = new ArrayList<StudentInfo>();

		// Method for searching in the array list.
public static int search(ArrayList<StudentInfo > std,String studentName)
{
	// Loop to repeat the process
	for (int i = 0; i < std.size(); i++)
{
		//Returning the index value from the list

if (std.get(i).getName().compareTo(studentName) == 0)
	return i;
	}	
return -1;
}

//Executing the Main-Method from MainClass
public static void main(String[] args)
{
	mainClass mainClass = new mainClass();
while (true)
{
				System.out.println("1. Insert A Record");
				
				System.out.println("2. View A Record");
				
				System.out.println("3. Delete A Record");
									
				System.out.println("4. Update A Record");
									
				System.out.println("5. Display All Records");
									
				System.out.println("6. Exit");
				
				System.out.print("Choose Your Option:");
					  
int n = sc.nextInt();
	// Switch-Case for Checking Condition.
switch(n)
{
case 1:
{
	// Checking the Size ArrayList.
	if (studentInfo.size() >= dataset)
	{
		System.out.println("Dataset Entry Exceeded");
		continue;
	}
	System.out.print("Enter Student Name : ");
	sc.nextLine();
	
		String studentName = sc.nextLine();
		System.out.print("Enter ID : ");
		int studentID = sc.nextInt();
		System.out.print("Enter GPA : ");
		double studentGPA = Double.parseDouble(sc.next());
		boolean key = false;
		for(StudentInfo str:DriverClass.studentInfo)
		{
  if(str.getName().equals(studentName))
  {
    key = true;
    break;
  }
else
{
	continue;
	}
}
if(key)
{
System.out.println("Duplicated Entry: The Provided Record Exists Already");
	break;
}
else
{
		StudentInfo record =new StudentInfo(studentName,studentID,studentGPA);
		// Adding Student Details
		studentInfo.add(record);
			}
break;
}
		// Fetching or viewing the record
case 2:
{
	System.out.print("Enter Student Name : ");
	sc.nextLine();
	String studentName = sc.nextLine();
	int index = search(studentInfo, studentName);
	if (index == -1)
      System.out.println("No Records Found");
	else
	{
      System.out.println("**** STUDENT INFORMATION SUMMARY ****");
      System.out.println("NAME : "+studentInfo.get(index).getName());
      System.out.println("ID : "+studentInfo.get(index).getID());
      System.out.println("GPA : "+studentInfo.get(index).getGrade());
	}
break;
}
			// Deleting the record.
case 3:
{
		System.out.print("Enter Student Name : ");
		sc.nextLine();
		String studentName = sc.nextLine();
		int index = search(studentInfo,studentName);
		
if (index == -1)
	System.out.println("No Existing Records");
else{
	studentInfo.remove(index);
  System.out.println("****Record Deleted!****");
}
break;
}
			//Updating the record
case 4:
{
System.out.print("Enter Student Name : ");
sc.nextLine();
String studentName = sc.nextLine();
int index = search(studentInfo,studentName);
if (index == -1)
	System.out.println("No Records Found");
else
{
			System.out.print("Enter Student ID : ");
			int studentID =Integer.parseInt(sc.nextLine());
			System.out.print("Enter Grade point: ");
			double studentGPA =Double.parseDouble(sc.nextLine());
			studentInfo.get(index).setName(studentName);
			studentInfo.get(index).setID(studentID);
			studentInfo.get(index).setGrade(studentGPA);
			}
break;
}
		// Displaying the records in Sorted form.
case 5:
{
  mainClass.SortedList();
  break;
}
		//Exiting the Program
case 6:
    {
    	System.out.println("**** End of the Program ****");
    } 
default:
	return;
		}
	}
}
public void addData(StudentInfo record)
{
	studentInfo.add(record);
	}
}