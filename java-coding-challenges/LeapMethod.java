import java.util.Scanner;
public class LeapMethod {
    public static void main (String [] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("enter your year");
        int year=scr.nextInt();
        leapYear(year);

}

    public static int leapYear(int year){
        if(year % 4==0 && year  %100!=0 || year % 400 == 0){
            System.out.println("leap");
        }
            else{
                System.out.println("not leap");
            }
             return year ;
         }
       

    }

    


