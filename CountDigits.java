import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
     
        int count = 0;
        int temp = num;
        
        if (num == 0) {
            count = 1;
        } else {
            while (temp>0) {
                temp = temp/10;
                count++;
            }
        }
        System.out.println("Number of digits:" + count);

        scan.close();
    }
}
