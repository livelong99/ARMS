
package Main;

public class Book {
    public static void info()
    {
        System.out.print("\t\tInformation BookletVaibhav"
                + "");
        System.out.print("\n====================================================================================\n");
        System.out.print("Introduction:\n");
        System.out.print("This Academic Record Management System(ARMS) helps the teachers in\nmaintaining ");
        System.out.print("a record of the attendance and marks of their students.It also");
        System.out.print(" allows the students to \nview their attendance and marks.While making this project");
        System.out.print(", we have used different features of \nJava and object oriented programming like polymorphism,");
        System.out.print(" encapsulation, inheritance(single \nlevel and multilevel ) and exception handling.");
        System.out.print("The use of keywords like final, static and abstract \nare also showcased here in detail");
        System.out.print("\n\nFeatures :\n");
        System.out.print("-> First, there will be an Initial Registration Portal, which will ask you to enter 4 entries \n   (Student Name). Registration IDs will be allotted to them and will be displayed beside \n   their name.");
        System.out.print("\n-> After which, the main screen will appear where the user will be given the option to enter\n   the academic portal, or register more students, or leave the portal.");
        System.out.print("\n-> Registration Portal is open only till attendance is updated for the first time.");
        System.out.print("\n-> ARMS allows the teachers to keep a record of the academic performance and\n   attendance of their students. ");
        System.out.print("\n-> ARMS will ask the user to recognise themselves as a Teacher or Student. If the User\n   picks Teacher, then he/she will have to enter a common password to continue. ");
        System.out.print("\n-> Teachers will have to enter their Subject code. After this, ARMS will decide if the subject\n   code is correct or incorrect. If it is the former, then the next screen will ask the user if\n   they wish to update the attendance or update marks. If it is the latter, then an error\n   message will be displayed. ");
        System.out.print("\n-> To update attendance, the name of the students will be displayed one by one, the user\n   will enter ‘P’ if the student was present, and ‘A’ if the student was absent. ");
        System.out.print("\n-> After the attendance has been updated for the entire class, ARMS will take you back\n   to the Academic portal. ");
        System.out.print("\n-> The minimum number of classes that the teachers must take in order to upload marks\n   are 1 for the First Term, 2 for the Second Term and 3 for the Third Term. If the minimum\n   number of classes are not taken,  an error message will be displayed and the User will\n   be taken back to the Academic Portal. ");
        System.out.print("\n-> To update marks, the name of the students will be displayed one by one and the teacher\n   will enter the marks between 0 and 100. ");
        System.out.print("\n-> If the marks entered are more than 100 or less than 0, then because of user defined\n   exception, the entire program will crash and an error message will be displayed.");
        System.out.print("\n-> If the User is a student, then he/she can enter whether they want to check their marks or\n   attendance. ");
        System.out.print("\n-> One of the features of ARMS is that if the attendance of a student is below 75% at the\n   end of Term III, the marks of Term III will be reduced by 50% (For eg. If a student scores\n   80 marks, 40 marks will be uploaded).");
    }
}
