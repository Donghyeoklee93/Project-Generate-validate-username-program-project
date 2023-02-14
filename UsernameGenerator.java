/*
 * UsernameGenerator.java
 * @author Donghyeok.Lee
 * 08/01/2023
 */

public class UsernameGenerator {

    // Declare variables (Qestion 1)
    private String foreName;
    private String surName;
    private String fullName;
    private String userName;

    // Declare variables (Qestion 2)
    private int userNameNumber;
    private String[] userNameArray;
    private boolean[] isResultOfValidation;

    // Constructor
    public UsernameGenerator() {
        foreName = "";
        surName = "";
        fullName = "";
        userName = "";

        userNameNumber = 0;
        userNameArray = new String[userNameNumber];
        isResultOfValidation = new boolean[userNameNumber];
    }

    // Method1 (Qestion 1) : This method is for generating username corresponding
    // with rules.
    public void generateUserName() {

        // Stringbuffer object is made to make username
        StringBuffer strBuff = new StringBuffer();

        // Through for loop, the programe checks each letter of the full name
        // and through if, else if, else condition, strBuff is made.
        for (int i = 0; i < fullName.length(); i++) {

            if (fullName.charAt(i) == 'A' ||
                    fullName.charAt(i) == 'E' ||
                    fullName.charAt(i) == 'I' ||
                    fullName.charAt(i) == 'O' ||
                    fullName.charAt(i) == 'U') {
                strBuff.append(fullName.charAt(i));
                strBuff.append(fullName.charAt(i));

            } else if (fullName.charAt(i) == ' ') {

            } else {
                strBuff.append(fullName.charAt(i));
            }
        }

        // After escaping for loop, the last letter of forename and the last name of
        // surname are added at the index[0], [1] place.
        strBuff.insert(0, foreName.charAt(foreName.length() - 1));
        strBuff.insert(1, surName.charAt(surName.length() - 1));

        // Strbuff is changed to String type
        userName = strBuff.toString();

        // To calcuate how many String userName has uppercase vowels, for loop is used.
        int numberOfUpperCaseVowels = 0;
        for (int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) == 'A' ||
                    userName.charAt(i) == 'E' ||
                    userName.charAt(i) == 'I' ||
                    userName.charAt(i) == 'O' ||
                    userName.charAt(i) == 'U') {
                numberOfUpperCaseVowels++;
            }
        }

        // Completed userName is maded by adding the number of uppercase vowels.
        userName = userName + numberOfUpperCaseVowels;
    }

    // Getter and Setter

    // To set forName valuse, set method is used.
    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    // To set surName valuse, set method is used.
    public void setSurName(String surName) {
        this.surName = surName;
    }

    // fullName is maded by being given forName and surName values.
    public void setFullName(String foreName, String surName) {
        this.fullName = foreName + ' ' + surName;
    }

    // Completed userName value is delivered by get method.
    public String getUserName() {
        return userName;
    }

    // Method2 (Qestion 2) : This method is for validating username corresponding
    // with rules.
    public void validateUserName() {

        // Through for loop, the programe checks each value of userNameArray
        // and through the other for loop in the for loop, the programe checks each
        // letter of value of userNameArray
        // and through if, else condition, the program validates each value of
        // userNameArray and declare value to isResultOfValidation array
        for (int i = 0; i < userNameArray.length; i++) {

            for (int j = 1; j < userNameArray[i].length(); j++) {
                if (!(userNameArray[i].charAt(0) == '@') ||

                        !(5 <= userNameArray[i].length() && userNameArray[i].length() <= 16) ||

                        !(('a' <= userNameArray[i].charAt(j) && userNameArray[i].charAt(j) <= 'z') ||
                                ('A' <= userNameArray[i].charAt(j) && userNameArray[i].charAt(j) <= 'Z') ||
                                ('0' <= userNameArray[i].charAt(j) && userNameArray[i].charAt(j) <= '9') ||
                                (userNameArray[i].charAt(j) == '_'))

                ) {
                    isResultOfValidation[i] = false;
                    break;
                }

                else {
                    isResultOfValidation[i] = true;
                }
            }

        }

    }

    // Getter and Setter

    // To set userNameNumber valuse, set method is used.
    public void setUserNameNumber(int userNameNumber) {
        this.userNameNumber = userNameNumber;
    }

    // To set userNameArray valuse, set method is used.
    public void setUserNameArray(String[] userNameArray) {
        this.userNameArray = userNameArray;
    }

    // To set isResultOfValidation valuse, set method is used.
    public void setIsResultOfValidation(boolean[] isResultOfValidation) {
        this.isResultOfValidation = isResultOfValidation;
    }

    // userNameArray(Before converting) is maded with certain format like below by
    // get method.
    public String[] getProvidedUserName() {

        System.out.print("[");
        for (int i = 0; i < userNameNumber; i++) {
            if (i == (userNameNumber - 1)) {
                System.out.print(userNameArray[i]);
            } else {
                System.out.print(userNameArray[i] + "," + " ");
            }
        }
        System.out.println("]");
        return userNameArray;
    }

    // userNameArray(After converting) is maded with certain format like below by
    // get method.
    public String[] getLowerCaseUserName() {
        for (int i = 0; i < userNameNumber; i++) {
            userNameArray[i] = userNameArray[i].toLowerCase();
        }

        System.out.print("[");
        for (int i = 0; i < userNameNumber; i++) {
            if (i == (userNameNumber - 1)) {
                System.out.print(userNameArray[i]);
            } else {
                System.out.print(userNameArray[i] + "," + " ");
            }
        }
        System.out.println("]");
        return userNameArray;
    }

    // isResultOfValidation is maded with certain format like below by get method.
    public boolean[] getIsResultOfValidation() {

        System.out.print("[");
        for (int i = 0; i < userNameNumber; i++) {
            if (i == (userNameNumber - 1)) {
                System.out.print(isResultOfValidation[i]);
            } else {
                System.out.print(isResultOfValidation[i] + "," + " ");
            }
        }
        System.out.println("]");
        return isResultOfValidation;

    }

}
