import java.util.Scanner;

public class Multiplyoutput {
         Scanner scan= new Scanner(System.in);
        private void output(){
             System.out.println("Your first number: ");
              int num1=scan.nextInt();
             System.out.println("Your second number ");
             int num2=scan.nextInt();
             System.out.println(num1+"x"+num2+"="+num1*num2);
        }
        public static void main(String[] args){
            Multiplyoutput addTogether= new Multiplyoutput();
              addTogether.output();
        }
}
