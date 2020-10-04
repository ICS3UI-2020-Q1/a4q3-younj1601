import java.util.Scanner;
/**
 *Calculate the sum from one to inputed number
 * @author Jackson 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the interger
    System.out.println("Please enter an integer to count down to");
    int num = input.nextInt();
    int count = 0;
    int sum = 0;

    while(count < num){
      count = count + 1;
      sum = sum + count;
      
    }
    System.out.println("The sum from 1 - " + num + " is " + sum);
  }
}
