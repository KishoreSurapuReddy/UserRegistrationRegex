package userregistration;

import java.util.Scanner;

public class UserInputData {
    Scanner scanner = new Scanner(System.in);

    public String stringInputData(){
        System.out.println("enter the details :");
        String data = scanner.nextLine();
        return data;
    }

    public int intInputData(){
        System.out.println("enter the details: ");
        int data = scanner.nextInt();
        return data;
    }
}
