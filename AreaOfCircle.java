import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radious of Area:");
        double radius = scanner.nextDouble();
        // Calculate the Area of circle
        double areaOfcircle = 0;
        areaOfcircle = (22.0 / 7) * radius * radius;
        System.out.println("Area of Circle ="+areaOfcircle);
        // close the scanner
        scanner.close();
    }
}
