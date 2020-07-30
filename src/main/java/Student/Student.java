package Student;
import java.util.*;
import CLASS.*;

class Java extends Attendence  {
    final String code = "CS1304" ;
    public Java()
    {
        super();
    }
    
}

class DS extends Attendence  {
    final String code = "CS1303" ;
    public DS()
    {
        super();
    }
}

class STLD extends Attendence  {
    final String code = "CS1302" ;
    public STLD()
    {
        super();
    }
}

class COA extends Attendence  {
    final String code = "CS1301" ;
    public COA()
    {
        super();
    }
}

class Maths extends Attendence  {
    final String code = "MA1307" ;
    public Maths()
    {
        super();
    }
}


public class Student{
    public String name;
    Maths M;
    STLD S;
    Java J;
    DS D;
    COA C;
    public int matt(){
        return(M.t);
    }
    public Student(String n){
        name = n;
        M = new Maths();
        S = new STLD();
        J = new Java();
        D = new DS();
        C = new COA();
    }
    
    public void takeattendence(String cd,Student St[],int n){
        Scanner ob = new Scanner(System.in);
        char ch;
        if(cd.equals(M.code))
        {   
            System.out.print("Maths :\n");
            for(int i=0 ; i<n ; i++)
            {
                System.out.print("\n"+St[i].name + " ("+(i+1)+")");
                ch = ob.next().charAt(0);
                St[i].M.take(ch);
            }
        }
        else if(cd.equals(S.code))
        {   
            System.out.print("STLD :\n");
            for(int i=0 ; i<n ; i++)
            {
                System.out.println("\n"+St[i].name + " ("+(i+1)+")");
                ch = ob.next().charAt(0);
                St[i].S.take(ch);
            }
        }
         else if(cd.equals(J.code))
        {   
            System.out.print("Java :\n");
            for(int i=0 ; i<n ; i++)
            {
                System.out.print("\n"+St[i].name + " ("+(i+1)+")");
                ch = ob.next().charAt(0);
                St[i].J.take(ch);
            }
        }
         else if(cd.equals(D.code))
        {   
            System.out.print("Data Structures :\n");
            for(int i=0 ; i<n ; i++)
            {
                System.out.println("\n"+St[i].name + " ("+(i+1)+") :");
                ch = ob.next().charAt(0);
                St[i].D.take(ch);
            }
        }
           else if(cd.equals(C.code))
        {   
            System.out.print("COA :\n");
            for(int i=0 ; i<n ; i++)
            {
                System.out.println("\n"+St[i].name + " ("+i+1+")");
                ch = ob.next().charAt(0);
                St[i].C.take(ch);
            }
        }
           else 
               System.out.print("Incorrect Subject code");
    }
    
    
    
    public void TakeMarks(String cd,Student St[],int n)
    {
        Scanner ob = new Scanner(System.in);
        int m;
        if(cd.equals(M.code))
        {   
            System.out.print("Maths (Term :"+(St[0].M.term+1)+" ):\n");
            if(St[0].M.Attcheck()!=0)
            {
              for(int i=0 ; i<n ; i++)
                {
                    System.out.print("\n"+St[i].name + " ("+(i+1)+") : ");
                    m = ob.nextInt();
                    try{
                        if(m>=0&&m<=100)
                            St[i].M.TakeM(m);
                        else
                            throw new error("\t\tSorry Marks Not Within required Range");
                     
                
                    }
                    catch(error e)
                    {
                     System.out.print("TRY LATER!\n");
                     System.out.print(e.getMessage());
                     i-=1;
                    }
                }
                    
                    
            }
            else 
            {
                System.out.print("\n \nMarks cannot be uploaded, Please try Again Later \n\n");
            }
        }
        else if(cd.equals(S.code))
        {   
            System.out.print("STLD (Term -"+St[0].S.term+" ):\n");
            if(St[0].S.Attcheck()!=0)
            {
              for(int i=0 ; i<n ; i++)
                {
                    System.out.print("\n"+St[i].name + " ("+(i+1)+") : ");
                    m = ob.nextInt();
                    try{
                        if(m>=0&&m<=100)
                            St[i].S.TakeM(m);
                        else
                            throw new error("\t\tSorry Marks Not Within required Range");
                     
                
                    }
                    catch(error e)
                    {
                     System.out.print("TRY LATER!\n");
                     System.out.print(e.getMessage());
                     i-=1;
                    }
                }
            }
            else
            {
                System.out.print("\n \n\t\tMarks cannot be uploaded, Please try Again Later \n\n");
            }
        }
        else if(cd.equals(J.code))
        {   
            System.out.print("Java (Term -"+St[0].J.term+" ):\n");
            if(St[0].J.Attcheck()!=0)
            {
              for(int i=0 ; i<n ; i++)
                {
                    System.out.print("\n"+St[i].name + " ("+(i+1)+") : ");
                    m = ob.nextInt();
                    try{
                        if(m>=0&&m<=100)
                            St[i].J.TakeM(m);
                        else
                            throw new error("\t\tSorry Marks Not Within required Range");
                     
                
                    }
                    catch(error e)
                    {
                     System.out.print("TRY LATER!\n");
                     System.out.print(e.getMessage());
                     i-=1;
                    }
                }
            }
            else
            {
                System.out.print("\n \n\t\tMarks cannot be uploaded, Please try Again Later \n\n");
            }
        }
        else if(cd.equals(D.code))
        {   
            System.out.print("Data Structures (Term -"+St[0].D.term+" ):\n");
            if(St[0].D.Attcheck()!=0)
            {
              for(int i=0 ; i<n ; i++)
                {
                    System.out.print("\n"+St[i].name + " ("+(i+1)+") : ");
                    m = ob.nextInt();
                    try{
                        if(m>=0&&m<=100)
                            St[i].D.TakeM(m);
                        else
                            throw new error("\t\tSorry Marks Not Within required Range");
                     
                
                    }
                    catch(error e)
                    {
                     System.out.print("TRY LATER!\n");
                     System.out.print(e.getMessage());
                     i-=1;
                    }
                }
            }
            else
            {
                System.out.print("\n \n\t\tMarks cannot be uploaded, Please try Again Later \n\n");
            }
        }
        else if(cd.equals(C.code))
        {   
            System.out.print("COA (Term -"+St[0].C.term+" ):\n");
            if(St[0].C.Attcheck()!=0)
            {
              for(int i=0 ; i<n ; i++)
                {
                    System.out.print("\n"+St[i].name + " ("+(i+1)+") : ");
                    m = ob.nextInt();
                    try{
                        if(m>=0&&m<=100)
                            St[i].C.TakeM(m);
                        else
                            throw new error("\t\tSorry Marks Not Within required Range");
                     
                
                    }
                    catch(error e)
                    {
                     System.out.print("TRY LATER!\n");
                     System.out.print(e.getMessage());
                     i-=1;
                    }
                }
            }
            else
            {
                System.out.print("\n \n\t\tMarks cannot be uploaded, Please try Again Later \n\n");
            }
        }
           else 
               System.out.print("\n\tPasscode or Subject Code Might be Wrong");
    }
    
    
    public void display()
    {
        System.out.print("\n====================================================================================\n");
        System.out.println("Subject         CODE         Presents        Absents        Total        Percent");
        System.out.println("Maths          "+M.code+"           "+M.display());
        
        System.out.println(" STLD          "+S.code+"           "+S.display());
        
        System.out.println(" Java          "+J.code+"           "+J.display());
        
        System.out.println("  DS           "+D.code+"           "+D.display());
        
        System.out.println(" COA           "+C.code+"           "+C.display());
        System.out.print("\n====================================================================================\n");
    }
    
    public void displayM()
    {
        System.out.print("\n====================================================================================\n");
        System.out.println("Subject         CODE         Term I        Term II        Term III        Total");
        System.out.println("Maths          "+M.code+"           "+M.displayM());
        
        System.out.println(" STLD          "+S.code+"           "+S.displayM());
        
        System.out.println(" Java          "+J.code+"           "+J.displayM());
        
        System.out.println("  DS           "+D.code+"           "+D.displayM());
        
        System.out.println(" COA           "+C.code+"           "+C.displayM());
        System.out.print("\n====================================================================================\n");
    }
}
