package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumber{
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String args[]) throws IOException{
    System.out.print("Enter Number1 : ");
    
    int number1 = Integer.parseInt(br.readLine());
    
    System.out.print("Enter Number2 : ");
    
    int number2 = Integer.parseInt(br.readLine());
    
    int total = number1 + number2;
    
    System.out.print("Total is : "+ total);
  }
}
