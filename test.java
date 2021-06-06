import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=1;
		EditSubjects obj=new EditSubjects();
		cls objj=new cls();
		while(x==1)
		{
			
			objj.Cls();
			System.out.print("\n******************************************\n");
			System.out.print("\tATTENDANCE MANAGER\n");
			System.out.print("******************************************\n");
			System.out.print("\n\t1.ATTENDANCE REPORT\n\t2.EDIT SUBJECTS\n\t3.MARK ATTENDANCE\n\t4.EXIT");
			System.out.print("\nEnter your Choice: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{

			case 1:		obj.display();
					break;
				
			case 2: 	obj.editSubjects();
					break;

			case 3: 	obj.markAttendance();
					break;
			case 4:		System.out.print("\t!!!SUCCESSFULLY EXITED THE APPLICATION!!!");
					System.exit(0);

			default:	System.out.print("\n\t!!!!ENTER VALID CHOICE!!!");
					break;
			}	
			
			System.out.print("\nEnter 1 to go back to MAIN WINDOW 2 to exit: ");
			x=sc.nextInt();
		}
		objj.Cls();

	}
}
