import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static String reverseInputString(String myString) {

		if (myString == null)
			return myString;

		String reverseString = "";

		for (int i = myString.length() - 1; i >= 0; i--) {

			reverseString = reverseString + myString.charAt(i);
		}
		return reverseString;
	}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String binaryNumber;
        System.out.print("Nhap vao so nhi phan ban muon chuyen doi: ");
        binaryNumber = sc.nextLine();
        int length = binaryNumber.length();
        String bianaryAfterReversed = reverseInputString(binaryNumber);
        int array[] = new int[length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String tmpString = "";
            tmpString += bianaryAfterReversed.charAt(i);
            array[i] = Integer.parseInt(tmpString);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            } else {
                sum += Math.pow(2, i); 
            }
        }
        System.out.printf("So sau khi chuyen sang he thap pha la %d", sum);
    }
}
