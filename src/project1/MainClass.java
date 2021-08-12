package project1;
import java.util.Collections;
import java.util.Scanner;
class mainClass
{
	//Main Method - Welcome Screen and Initial Inputs
mainClass()
{
System.out.println("**** Welcome to Academic Information Database **** \n");

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Max Dataset Size:");
	int dataset = scan.nextInt();
	DriverClass.setDataset(dataset);
  
	 System.out.print("Enter Initial Number Of Students:");
	 int students = scan.nextInt();
	 DriverClass.setStudents(students);
  
	  System.out.print("Enter Initial Dataset Size:");
	  int initial = scan.nextInt();
	  DriverClass.setInitial(initial);
	  int size = DriverClass.getInitial();
	  while(size > 0)
  {
      scan.nextLine();
      System.out.print("Enter Student Name:");
      String studentName = scan.nextLine();  
      System.out.print("Enter Student ID:");
      int studentID = scan.nextInt(); 
      System.out.print("Enter GPA:");
      double studentGPA = scan.nextDouble();  
      StudentInfo record = new StudentInfo(studentName,studentID,studentGPA);
      DriverClass dv = new DriverClass();
      dv.addData(record);
      size--;
	}
} 
// Display the informations of the student and sort the array in the array list.
static void SortedList()
{
Collections.sort(DriverClass.studentInfo,StudentInfo.NameComparator);
System.out.println("Names\t\tID\tGPA");

for(StudentInfo str:DriverClass.studentInfo){
	System.out.println(str.getName()+"\t"+str.getID()+"\t"+str.getGrade()+"\t");
		} } }
