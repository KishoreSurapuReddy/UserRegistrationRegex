package userregistration;

import java.util.Scanner;

public class UserInputData {
    Scanner scanner = new Scanner(System.in);

    public String stringInputData(){
        System.out.println("enter the details :");
        String data = null;
        try {
            data = scanner.nextLine();
        }
        catch (Exception e) {
            System.out.println("enter valid data");
        }
        return data;
    }

    public int intInputData(){
        System.out.println("enter the details: ");
        int data =0 ;
        try {
            data = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("enter valid data ");
        }
        return data;
    }
}
