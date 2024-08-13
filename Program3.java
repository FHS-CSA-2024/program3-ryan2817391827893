//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
public static void main(String[] args){
    
    Scanner num = new Scanner(System.in);
    double length = 0.0;
    double width = 0.0;
    double area = 0.0;
    double perimeter = 0.0;
    
    System.out.println("enter length");   
    length = num.nextDouble();  
    
    System.out.println("enter width");
    width = num.nextDouble();
    
    area = length*width;
    perimeter = (2*length)+(2*width);
    System.out.println();
    System.out.println("length is " + length);
    System.out.println("width is " + width);
    System.out.println("area is " + area);
    System.out.println("perimeter is " + perimeter);

//Paste console output below:
  /*
enter length
40.1
enter width
10

length is 40.1
width is 10.0
area is 401.0
perimeter is 100.2

   */


}
}
