import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
//get both the values using scanf, and then check if they are lesser than zero , if they are lesser than zero then dsplay the error text or else display the area
//Write your code here
    
static boolean flag = true; 
static int B,H;

static{

Scanner scan = new Scanner(System.in);
B = scan.nextInt();

H = scan.nextInt();

if(B>0 && H>0){
    flag = true;

}else if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}


    
    

public static void main(String[] args){