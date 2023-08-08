import java.util.Scanner;

public class Demo1{

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String red = "\033[31m"; // ANSI escape code for Red colour text
        String blue = "\033[34m"; //ANSI escape code for  Blue colour text
        String green = "\033[32m"; //ANSI escape code for  Green colour text
        String yellow = "\033[33m"; //ANSI escape code for  Yellow colour text
        String r = "\033[0m"; //ANSI escape code for  reset colour text
        String bold = "\033[1m" ; //ANSI escape code for  bold text  ************************
        
        String name;
        int age;
        String sub1;
        double mark1;
        String sub2;
        double mark2;
        String sub3;
        double mark3;
        String subPrefix ="SE-";

        double total =0;
        double avg =0;

        String sub1Grade="";
        String sub2Grade="";
        String sub3Grade="";
        String overallGrade="";


        block1 :
        {   Name_Adding : {
            System.out.print(" Enter your name : ");
            name = sc.nextLine().strip();
            if(name.length()!=0){
                System.out.println("Name added successfully");
            }else {
                System.out.printf("%s Invalid name entered %s \n" , red, r);
                break block1;
                }
            
            }

            Age_Adding : {
            System.out.print(" Enter your age : ");
            age = sc.nextInt();
            sc.nextLine();
            if(age>=10 && age<= 18){
                System.out.println("Age added successfully");
            }else {
                System.out.printf("%s Invalid age entered %s \n", red, r);
                break block1;
                }
            }
            ///////////////////////////////SUBJECT01
            Subect1_Name_Adding : {
            System.out.print(" Enter Subject 1 Code : ");
            sub1 = sc.nextLine();
            
            if(sub1.startsWith(subPrefix)){
                System.out.println("Subject 01 added successfully");
            }else {
                System.out.printf("%s Invalid subject entered %s \n", red, r);
                break block1;
                }
            }

            Subect1_marks_Adding : {
            System.out.print(" Enter Subject 1 Marks: ");
            mark1 = sc.nextDouble();
            sc.nextLine();
            
            if(mark1>=0 && mark1<=100){  
                System.out.println("Subject 01 marks added successfully");
            }else {
                System.out.printf("%s Invalid mark entered %s \n", red, r);
                break block1;
                }
            }
            ///////////////////////////////SUBJECT02
            Subect2_Name_Adding : {
            System.out.print(" Enter Subject 2 Code : ");
            sub2 = sc.nextLine();
            
            if(sub2.startsWith(subPrefix)){ 
                System.out.println("Subject 02 added successfully");
            }else {
                System.out.printf("%s Invalid subject entered %s \n", red, r);
                break block1;
                }
            }

            Subect2_marks_Adding : {
            System.out.print(" Enter Subject 2 Marks: ");
            mark2 = sc.nextDouble();
            sc.nextLine();
            
            if(mark2>=0 && mark2<=100){  
                System.out.println("Subject 02 marks added successfully");
            }else {
                System.out.printf("%s Invalid mark entered %s \n", red, r);
                break block1;
                }
            }
            ///////////////////////////////SUBJECT03
            Subect3_Name_Adding : {
            System.out.print(" Enter Subject 3 Code : ");
            sub3 = sc.nextLine();
            
            if(sub3.startsWith(subPrefix)){
                System.out.println("Subject 03 added successfully");
            }else {
                System.out.printf("%s Invalid subject entered %s \n", red, r);
                break block1;
                }
            }

            Subect3_marks_Adding : {
            System.out.print(" Enter Subject 3 Marks: ");
            mark3 = sc.nextDouble();
            sc.nextLine();
            
            if(mark3>=0 && mark3<=100){  
                System.out.println("Subject 03 marks added successfully");
            }else {
                System.out.printf("%s Invalid mark entered %s \n", red, r);
                break block1;
                }
            }

            Find_Total:
            total = mark1+mark2+mark3;

            Find_Average:
            avg=total/3;

            Subject1_Status:
            if(mark1>=75){sub1Grade = String.format("%sDP%s", blue,r);
            }else if(mark1>=65){sub1Grade = String.format("%sCP%s", green,r);
            }else if (mark1>=55){sub1Grade = String.format("%sP%s", yellow,r);
            }else {sub1Grade = String.format("%sF%s", red,r); }

            Subject2_Status:
            if(mark2>=75){sub2Grade = String.format("%sDP%s", blue,r);
            }else if(mark2>=65){sub2Grade = String.format("%sCP%s", green,r);
            }else if (mark2>=55){sub2Grade = String.format("%sP%s", yellow,r);
            }else {sub2Grade = String.format("%sF%s", red,r); }

            Subject3_Status:
            if(mark3>=75){sub3Grade = String.format("%sDP%s", blue,r);
            }else if(mark3>=65){sub3Grade = String.format("%sCP%s", green,r);
            }else if (mark3>=55){sub3Grade = String.format("%sP%s", yellow,r);
            }else {sub3Grade = String.format("%sF%s", red,r); }

            Overall_Status:
            if(avg>=75){overallGrade = String.format("%sDP%s", blue,r);
            }else if(avg>=65){overallGrade = String.format("%sCP%s", green,r);
            }else if (avg>=55){overallGrade = String.format("%sP%s", yellow,r);
            }else {overallGrade = String.format("%sF%s", red,r); }
           

            Print_outputs:
            System.out.println("------------------------------------------------");

            System.out.printf("Name : %s%s%s%s \n",bold,blue,name.toUpperCase(),r);
            System.out.printf("age : %s Years Old \n", age);
            System.out.printf("Status : %s%s%s \n",bold,overallGrade,r); ////******************** */
            System.out.printf("Total : %.2f \t Average : %.2f \n\n", total, avg);

            System.out.println("+-----------------+----------------+--------------+");
            System.out.println("|-----SUBJECT-----|-----MARKS------|----STATUS----|");
            System.out.println("+-----------------+----------------+--------------+");
            System.out.printf("|%s  \t\t|%.2f\t\t|%s\t\t|\n",sub1,mark1,sub1Grade);
            System.out.printf("|%s  \t\t|%.2f\t\t|%s\t\t|\n",sub2,mark2,sub2Grade);
            System.out.printf("|%s  \t\t|%.2f\t\t|%s\t\t|\n",sub3,mark3,sub3Grade);
            System.out.println("+-----------------+----------------+--------------+");
        }
        System.out.println("-------------------PROGRAM END---------------------");
    }
}