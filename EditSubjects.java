import java.util.*;

class EditSubjects extends Subjects {
	void editSubjects()
	{
		cls obj1=new cls();
		Scanner sc =new Scanner(System.in);
		char y='y';
		while(y=='y'||y=='Y')
		{
			obj1.Cls();
			System.out.print("\n**********************************\n");
			System.out.print("ATTENDANCE MANAGER->EDIT SUBJECTS\n");
			System.out.print("**********************************\n");
			System.out.print("\n\t1.ADD SUBJECT\n\t2.DELETE SUBJECT\n\t3.EDIT SUBJECT DETAILS");
			System.out.print("\n\nEnter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: 	obj1.Cls();
						System.out.print("\n***********************************************\n");
						System.out.print("ATTENDANCE MANAGER->EDIT SUBJECTS->ADD SUBJECT\n");
						System.out.print("***********************************************\n");
						try
						{
							System.out.print("Enter name of subject: ");
							sub_names[count]=sc.next();
							System.out.print("Enter no. of lec attended: ");
							sub[count][0]=sc.nextInt();
							System.out.print("Enter no. of lec not attended: ");
							sub[count][1]=sc.nextInt();
							sub[count][2]=sub[count][0]+sub[count][1];
							count++;
							
						}	
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
				case 2: 	obj1.Cls();
						System.out.print("\n**************************************************\n");
						System.out.print("ATTENDANCE MANAGER->EDIT SUBJECTS->DELETE SUBJECT\n");
						System.out.print("\n**************************************************\n");
		
						if(count==0)
						System.out.println("\nNothing to DELETE!! Add subjects first...");			
						else
						{
							for(int i=0;i<count;i++)
							{
								if(sub_names[i]==null)
									{}
								else
								System.out.print(i+". "+sub_names[i]+"\n");
							}
							System.out.print("\nEnter subject ID: ");
							int id=sc.nextInt();
							sub_names[id]=null;
							sub[id]=null;
						}
						break;
						
				case 3: 	obj1.Cls();
						System.out.print("\n********************************************************\n");
						System.out.print("ATTENDANCE MANAGER->EDIT SUBJECTS->EDIT SUBJECT DETAILS\n");
						System.out.print("********************************************************\n");
						if(count==0)
						System.out.println("\nNo Subjects to EDIT!! Add subjects first...");
						else
						{
							for(int i=0;i<count;i++)
							{
								if(sub_names[i]==null)
									{}
								else
								System.out.print(i+". "+sub_names[i]+"\n");
							}
							try{
								System.out.print("\nEnter Subject ID to edit it: ");
								int x=sc.nextInt();
								System.out.print("Enter name of subject: ");
								sub_names[x]=sc.next();
								System.out.print("\nEnter no. of lec attended: ");
								sub[x][0]=sc.nextInt();
								System.out.print("\nEnter no. of lec not attended: ");
								sub[x][1]=sc.nextInt();
								sub[x][2]=sub[x][0]+sub[x][1];
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
						}
						break;
	
				default:	System.out.print("\n\t!!!!ENTER VALID CHOICE!!!");
						break;					
			}
			System.out.print("\nPRESS Y/y to Stay in EDIT SUBJECTS OR n/N to go to MAIN WINDOW : ");
			String yy=sc.next();
			y=yy.charAt(0);
			
		}
	}
	
	
	void display()
	{	
		cls obj2=new cls();
		obj2.Cls();
		int[] sum=new int[2];
		sum[0]=0;
		sum[1]=0;
		System.out.print("\n************************************\n");
		System.out.print("ATTENDANCE MANAGER->ATTENDANCE REPORT\n");
		System.out.print("**************************************\n");
		if(count==0)
			System.out.println("\nNothing to display!! Add subjects first");
		else 
		{
			for(int i=0;i<count;i++)
			{
				if(sub_names[i]==null)
					i=i+1;
				System.out.println(i+". "+sub_names[i]+"\n");
				System.out.println("LECTURE ATTENDED = "+sub[i][0]);
				System.out.println("LECTURE NOT ATTENDED = "+sub[i][1]);
				System.out.println("TOTAL LECTURES = "+sub[i][2]);
				System.out.println("PERCENTAGE= "+(((float)sub[i][0]/sub[i][2])*100)+"%");
				System.out.println("__________________________\n");
				sum[0]=sum[0]+sub[i][0];
				sum[1]=sum[1]+sub[i][2];
			}
			System.out.println("\n\n\t\tOVERALL ATTENDANCE- "+((float)sum[0]/sum[1])*100+"%");	
		}
	}
	
	
	void markAttendance()
	{
		cls obj3=new cls();
		obj3.Cls();
		System.out.print("\n************************************\n");
		System.out.print("ATTENDANCE MANAGER->MARK ATTENDENCE\n");
		System.out.print("************************************\n");
		if(count==0)
			System.out.println("Nothing to display!! Add subjects first");
		else 
		{
			Scanner sc=new Scanner(System.in);
			int z=1;
			while(z==1) 
			{
				for(int i=0;i<count;i++)
				{
					if(sub_names[i]==null)
					{}
					else
						System.out.print(i+". "+sub_names[i]+"\n");
				}
				
				System.out.print("Enter choice for subject to mark attendance : ");
				int x=sc.nextInt();
				obj3.Cls();
				System.out.print("\n******************************************\n");
				System.out.print("ATTENDANCE MANAGER->EDIT SUBJECTS->"+sub_names[x]+"\n");
				System.out.print("******************************************\n");
				System.out.print("\nEnter p/P to mark present a/A to mark absent: ");
				String yy=sc.next();
				char y=yy.charAt(0);
				if(y=='p'||y=='P')
				{
					sub[x][0]++;
					sub[x][2]++;
					System.out.print("\n\n!!!Chages Saved!!!\n\n");
				}
				else if (y=='a'||y=='A')
				{
					sub[x][1]++;
					sub[x][2]++;
					System.out.print("\n\n!!!Chages Saved!!!\n\n");
				}
				else
					System.out.print("\n\n!!!ENTER VALID CHARACTER!!!\n\n");
				System.out.print("\nPRESS 1 to stay in MARK ATTENDANCE/ 0 to go back to MAIN WINDOW: ");
				z=sc.nextInt();
			}
		}
	}
	
}