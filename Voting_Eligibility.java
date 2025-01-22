//Write java program to check  candidate eligible for voting or not

package ANP_D0453.com;

import java.util.Scanner;

public class Voting_Eligible {
	
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible for vote.");
        }
        else
        {
            System.out.println("You are not eligible for vote.");
        }
    }
}


//Output
Enter your age:20
You are eligible for vote.

Enter your age:18
You are eligible for vote.

Enter your age:17
You are not eligible for vote.