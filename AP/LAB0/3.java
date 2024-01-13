// Program function to tyake 2 strings and check if one is present as a substring in the other string and return true is yes else false

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        System.out.println("The result is " + isSubstring(str1, str2));
    }

    public static boolean isSubstring(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 == 0 || len2 == 0) {
            return false;
        }
        if (len1 > len2) {
            return isSubstring(str2, str1);
        }
        for (int i = 0; i < len2; i++) {
            if (str1.charAt(0) == str2.charAt(i)) {
                if (len1 == 1) {
                    return true;
                }
                if (i + len1 > len2) {
                    return false;
                }
                int j = 1;
                while (j < len1) {
                    if (str1.charAt(j) != str2.charAt(i + j)) {
                        break;
                    }
                    j++;
                }
                if (j == len1) {
                    return true;
                }
            }
        }
        return false;
    }
}

//generate test cases foir the same
// 1. str1 is empty
// 2. str2 is empty
// 3. str1 is longer than str2
// 4. str2 is longer than str1
// 5. str1 is present in str2
// 6. str2 is present in str1
// 7. str1 is not present in str2
// 8. str2 is not present in str1
// 9. str1 is equal to str2
// 10. str1 is null
// 11. str2 is null


