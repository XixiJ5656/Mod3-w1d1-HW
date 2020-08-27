import java.util.Scanner;

public class UnitConversion {
    static Scanner input= new Scanner(System.in);
    public void inchesToMeters(){
        System.out.println("input the number of Inches ");
        double in= input.nextDouble();
        double me= in*0.0254;
        System.out.println("it equals "+me+" meters");
    }
    public static void main(String[] args){
      var converter=new UnitConversion();
        converter.inchesToMeters();


    }
}
