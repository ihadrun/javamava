package hackerrank15;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        System.out.println(A.length()+B.length());
        if ((A.compareTo(B))==0) {
        System.out.println("No");}
        else { System.out.println("Yes");}
        String firstLetStr = A.substring(0, 1);
        String remLetStr = A.substring(1);
        firstLetStr = firstLetStr.toUpperCase();
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.print(firstLetterCapitalizedName);
        String LetStr = B.substring(0, 1);
        String rem2LetStr = B.substring(1);			
        String first2LetStr = LetStr.toUpperCase();
        String first2LetterCapitalizedName = first2LetStr + rem2LetStr;
        System.out.print(" "+first2LetterCapitalizedName);
        
        
        /* Enter your code here. Print output to STDOUT. */

	}

}
