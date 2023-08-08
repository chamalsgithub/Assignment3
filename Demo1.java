import java.util.Scanner;

public class Demo1{

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String red = "\033[31m"; // ANSI escape code for Red colour
        String r = "\033[0m"; //ANSI escape code for  reset colour

        
        final String name;
        final int age;
        final String sub1;
        final double mark1;
        final String sub2;
        final double mark2;
        final String sub3;
        final double mark3;

        double total;
        double avg;

        String sub1Grade;
        String sub2Grade;
        String sub3Grade;


        block1 :
        {   Name_Adding : {
            System.out.print(" Enter your name : ");
            name = sc.nextLine();
            if(name.length()!=0){
                System.out.print("Name added successfully");
            }else {
                System.out.printf("%s Invalid name entered %s \n" , red, r);
                break block1;
                }
            
            }

            Age_Adding : {
            System.out.print(" Enter your age : ");
            age = sc.nextInt();
            if(age>=10 && age<= 18){
                System.out.print("Age added successfully");
            }else {
                System.out.printf("%s Invalid age entered %s \n", red, r);
                break block1;
                }
            }
            ///////////////////////////////SUBJECT01
            Subect1_Name_Adding : {
            System.out.print(" Enter Subject 1 Code : ");
            sub1 = sc.nextLine();
            
            if(true){ //******** */
                System.out.print("Subject 01 added successfully");
            }else {
                System.out.printf("%s Invalid subject entered %s \n", red, r);
                break block1;
                }
            }

            Subect1_marks_Adding : {
            System.out.print(" Enter Subject 1 Marks: ");
            mark1 = sc.nextDouble();
            
            if(mark1>=0 && mark1<=100){  
                System.out.print("Subject 01 marks added successfully");
            }else {
                System.out.printf("%s Invalid mark entered %s \n", red, r);
                break block1;
                }
            }
            ///////////////////////////////SUBJECT02
            Subect2_Name_Adding : {
            System.out.print(" Enter Subject 2 Code : ");
            sub2 = sc.nextLine();
            
            if(true){ //******** */
                System.out.print("Subject 02 added successfully");
            }else {
                System.out.printf("%s Invalid subject entered %s \n", red, r);
                break block1;
                }
            }

            Subect2_marks_Adding : {
            System.out.print(" Enter Subject 2 Marks: ");
            mark2 = sc.nextDouble();
            
            if(mark2>=0 && mark2<=100){  
                System.out.print("Subject 02 marks added successfully");
            }else {
                System.out.printf("%s Invalid mark entered %s \n", red, r);
                break block1;
                }
            }
            ///////////////////////////////SUBJECT03
            Subect3_Name_Adding : {
            System.out.print(" Enter Subject 3 Code : ");
            sub3 = sc.nextLine();
            
            if(true){ //******** */
                System.out.print("Subject 03 added successfully");
            }else {
                System.out.printf("%s Invalid subject entered %s \n", red, r);
                break block1;
                }
            }

            Subect3_marks_Adding : {
            System.out.print(" Enter Subject 3 Marks: ");
            mark3 = sc.nextDouble();
            
            if(mark3>=0 && mark3<=100){  
                System.out.print("Subject 03 marks added successfully");
            }else {
                System.out.printf("%s Invalid mark entered %s \n", red, r);
                break block1;
                }
            }

            Find_Total:
            total = mark1+mark2+mark3;

            Find_Average:
            avg=total/3;

            Status:
            if(mark1>=75){sub1Grade = "DP";
            }else if(mark1>=65){sub1Grade = "CP";
            }else if (mark1>=55){sub1Grade = "P";
            }else {sub1Grade = "F"; }
            
        }
        System.out.println("---------------------");
    }
}