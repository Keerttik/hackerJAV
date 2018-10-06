import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        
        try{
        Scanner sc = new Scanner(System.in);
        int n=20;
        
        System.out.println("enter no of spaces");
        int space= sc.nextInt();
        System.out.println("enter first string");
        String s1 = sc.nextLine();

        System.out.println("enter first string");
        String s2 = sc.nextLine();
  
        prints(s1.length(),s1.toCharArray(),space);
        System.out.println();
        prints(s2.length(),s2.toCharArray(),space);
        
        } catch(Exception e){System.out.println(" a ");};
    }
    
    public static void prints(int s, char [] sa, int spac){
        for(int i=0 ; i<s;i++){
            if(i%2!=0){
                System.out.print(sa[i]);
            }
        }
         for(int j=0;j<spac;j++){
                    System.out.print(" ");
        }
        
          for(int i=0 ; i<s;i++){
            if(i%2==0){
                System.out.print(sa[i]);
            }
        }        
          
    }
}
