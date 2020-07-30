
package Main;

import Student.*;
import java.util.*;

class Main{
    public static int n;
    public static void Reg(Student St[])
    {
        Scanner ob1 = new Scanner(System.in);
        if(St[0].matt() == 0)
        {
            System.out.print("\n====================================================================================\n");
            System.out.print("\t\t\tRegistration Portal");
            System.out.print("\n====================================================================================\n");
            System.out.print("Enter Student Name (ID : "+(n+1)+") :");
            St[n] = new Student(ob1.nextLine());
            n = n+1;
        }
        else
        {
            System.out.print("\n====================================================================================\n");
            System.out.print("\t\tRegistration Portal Is closed for Now See You next Time");
            System.out.print("\n====================================================================================\n");
        }
            
        
    }
    public static void main(String args[])
    {
        int ps;
        Scanner ob1 = new Scanner(System.in);
        Scanner ob2 = new Scanner(System.in);
        Scanner ob = new Scanner(System.in);
        Scanner ob3 = new Scanner(System.in);
        String Name,code;
        int ch=0,No,c=0;
        n=4;
        Student St[] = new Student[10];
        System.out.print("\n====================================================================================\n");
        System.out.print("\t\t\tInitial Registration Portal");
        System.out.print("\n====================================================================================\n");
        for(int i=0; i<n; i++)
        {
            System.out.print("\n=>Enter Student Name(ID : " +(i+1)+") : ");
            Name = ob1.nextLine();
            St[i] = new Student(Name);
        }
        System.out.print("\n====================================================================================\n");
        
        Teacher Tc = new Teacher();
        while(c!=4)
        {
            System.out.print("\n====================================================================================\n");
            System.out.print("\t\tA.R.M.S.(Academic Record Management System)");
            System.out.print("\n====================================================================================\n");
            System.out.print("\nWhat would You Like Access : \n1. Registration Portal \n2. Accademic Portal");
            System.out.print("\n3. Information Booklet \n4. Leave\n");
            c = ob.nextInt();
            System.out.print("\n====================================================================================\n");
            switch(c)
            {
                case 1:
                    Main.Reg(St);
                    break;
                case 2 :
                while(ch!=3)
                {
                    System.out.print("\n\n\n====================================================================================\n");
                    System.out.print("\t\t\t\tAccademic Portal");
                    System.out.print("\n====================================================================================\n\n");
                    System.out.println("Who are You? : \n1. Student \n2. Teacher\n3. Back to Main Screen\n");
                    ch = ob2.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.print("\n\n================================================================================");
                            System.out.print("====\n\nName : ");
                            Name = ob3.nextLine();
                            System.out.print("\nStudent ID : ");
                            No = ob.nextInt();
                            System.out.print("====================================================================================");
                            System.out.print("============\n\nWhat would you like to see : \n1.Attendence \n2.Marks");
                            ch = ob1.nextInt();
                            if(ch == 1)
                            {
                                for(int i=0; i<n; i++)
                                {
                                    if(No==(i+1)&&Name.equals(St[i].name))
                                    {
                                        St[i].display();
                                        break;
                                    }
                                    if(i==n-1)
                                        System.out.print("\n\t\tWrong Student Name or Student ID ");
                                }
                                
                            }
                            else if(ch==2)
                            {
                                for(int i=0; i<n; i++)
                                {
                                    if(No==(i+1)&&Name.equals(St[i].name))
                                    {
                                        St[i].displayM();
                                        break;
                                    }
                                    if(i==n-1)
                                        System.out.print("\n\t\tWrong Student Name or Student ID ");
                                }   
                            }   break;
                        case 2:
                            System.out.print("\nEnter Your Subject Code :");
                            code = ob1.nextLine();
                            System.out.print("\nEnter Passcode :");
                             ps = ob.nextInt();
                             if(ps == Tc.Pass)
                             {
                            System.out.print("\n\n=============================================================================");
                            System.out.print("=======\n\nWhat would you like to Enter : \n1.Attendence \n2.Marks\n");
                            ch = ob1.nextInt();
                            if(ch == 1)
                            {
                                Tc.takeattendence(code,St,n);
                            }
                            else if(ch==2)
                            {
                                Tc.TakeMarks(code,St,n);
                            } 
                             }
                             else
                                 System.out.print("\n\tPasscode or Subject Code Might be Wrong");
                            break;
                        default:
                            System.out.println("\t\t->See You Later!!<-");
                            break;
                    }       
                    System.out.print("\n====================================================================================\n");
               }
                break;
                
                case 3:
                    Book.info();
                    break;
                case 4:
                    System.out.print("\t\t\t\tGoodBye");
                    break;
            }
        }
    }
}

