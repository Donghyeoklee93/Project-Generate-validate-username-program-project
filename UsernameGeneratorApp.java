/*
 * UsernameGeneratorApp.java
 * @author Donghyeok.Lee
 * 08/01/2023
 */


import java.util.Scanner;

public class UsernameGeneratorApp {
    public static void main(String args[]) {

        // Question 1

        // Declare variables
        String foreName;
        String surName;
        String userName;
        String answer;

        // Declare and create objects
        UsernameGenerator myU = new UsernameGenerator();
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");


        // The while loop started at least one time. So, do-while loop is used.
        do {
            // Input
            System.out.println("Please provide user's full name");
            Scanner name = new Scanner(System.in);

            foreName = name.next();
            myU.setForeName(foreName);

            surName = name.next();
            myU.setSurName(surName);

            myU.setFullName(foreName, surName);

            // Process
            myU.generateUserName();

            // Output
            userName = myU.getUserName();
            System.out.println("UserName: " + userName);
            System.out.println();
            System.out.println("Would you like to generate another username?");
            answer = name.next();
            System.out.println();

        // In the information related to approachs to entering multiple full names in the Word file,
        // it said that only 'yes' can be accepted to repeat while and it's not mentioned about accepting Uppercase.
        // So, '.equals' method is used (Not '.equalsIgnoreCase')
        } while (answer.equals("yes"));
        System.out.println("----------------------------------------------------------------------------");



        // Question 2

        int userNameNumber;

        // Declare variables and Input

        System.out.println("How many number of handles/usernames would you like to validate?");
        Scanner size = new Scanner(System.in);
        userNameNumber = size.nextInt();
        myU.setUserNameNumber(userNameNumber);

        // The sizes of String array and boolean array are determined by userNameNumber
        String[] userNameArray = new String[userNameNumber];
        boolean[] isResultOfValidation = new boolean[userNameNumber];
        myU.setIsResultOfValidation(isResultOfValidation);

        // Through for loop, the userNameArray[i] values are declared
        for (int i = 0; i < userNameNumber; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("Please provide handle/username you would like to validate " + '(' + (i + 1) + '/'
                    + userNameNumber + ')');
                    userNameArray[i] = scan.nextLine();
        }
        System.out.println();

        // userNameArray is delivered to instantiable class by set method
        // and serNameArray(Before converting) maded with certain format is got by get method
        System.out.println("Provided handle/username : ");
        myU.setUserNameArray(userNameArray);
        myU.getProvidedUserName();
        System.out.println();

        // userNameArray(After converting) maded with certain format is got by get method
        System.out.println("Converted handle/username : ");
        myU.getLowerCaseUserName();
        System.out.println();


        // Process
        // validationUserName method is used for validating usernames

        myU.validateUserName();


        // Output
        // isResultOfValidation maded with certain format is got by get method

        System.out.println("Validation Result : ");
        myU.getIsResultOfValidation();
        System.out.println();

        System.out.println("----------------------------------------------------------------------------");
    }
}
