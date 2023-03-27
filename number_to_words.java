import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
/*number say in words*/
        System.out.print("Enter number from 20 to 99: ");
        int myNum = numScan.nextInt(); //47
        int secondNum = myNum / 10;//4
        int firstNum = myNum % 10;//7
        String result = "";
        switch (secondNum) {
            case 2:
                result += "Twenty ";
                break;
            case 3:
                result += "Thirty ";
                break;
            case 4:
                result += "Fourty ";
                break;
            case 5:
                result += "Fifty ";
                break;
            case 6:
                result += "Sixty ";
                break;
            case 7:
                result += "Seventy ";
                break;
            case 8:
                result += "Eighty ";
                break;
            case 9:
                result += "Ninety ";
                break;
        }

        switch (firstNum) {
            case 1:
                result += "one";
                break;
            case 2:
                result += "two";
                break;
            case 3:
                result += "three";
                break;
            case 4:
                result += "four";
                break;
            case 5:
                result += "five";
                break;
            case 6:
                result += "six";
                break;
            case 7:
                result += "seven";
                break;
            case 8:
                result += "eight";
                break;
            case 9:
                result += "nine";
                break;
        }

       

        System.out.println(result);
    }
}
