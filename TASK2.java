import java.util.Scanner;
public class TASK2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of all subjects:-");
        System.out.println(" Enter the marks of ENGLISH:-");
        int ENGLISh = sc.nextInt();
        System.out.println(" Enter the marks of HINDI:-");
        int HINDI = sc.nextInt();
        System.out.println(" Enter the marks of MATHS:-");
        int MATHS = sc.nextInt();
        System.out.println(" Enter the marks of SCIENCE:-");
        int SCIENCE = sc.nextInt();
        System.out.println(" Enter the marks of COMPUTER:- ");
        int COMPUTER = sc.nextInt();
        System.out.println(" Enter the marks of SST:-");
        int SST = sc.nextInt();
        int total = ENGLISh + HINDI + MATHS + SCIENCE + COMPUTER + SST;
        float percentage = total/6;
        System.out.println(" total " + total);
        System.out.println(" percentage " + percentage);
        if(percentage>=90)
        {
            System.out.println(" GRADE A");

        } 
        else if(percentage>=80)
        {
            System.out.println(" GRADE B");
        }
        else if(percentage>=70)
        {
            System.out.println(" GRADE C");
        }
        else if(percentage>=60)
        {
            System.out.println(" GRADE D");
        }
        else if(percentage>=50)
        {
            System.out.println(" GRADE E");
        }
        else
        {
            System.out.println(" FAIL ");
        }
    }




}   
