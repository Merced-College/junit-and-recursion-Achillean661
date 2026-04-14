/**
 * Ryan Lee
 * 4.14.26
 * Testing Recurison
 */

public class TestingRecursion {
    

    public static int countHi(String str) {
        
        // base case
        if (str.length() == 1 || str == null) {
            return 0;
        }

        //check if the first 2 letters are h or i
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);

        if (firstLetter == 'h' && secondLetter == 'i') {
            //hi found and taken out of the string.
            return 1 + countHi(str.substring(2));
        }
        else {
            return countHi(str.substring(1));
        }


    }

    public static String stringClean(String str) {
        
        //base case
        if (str.length() == 1 || str == null) {
            return str;
        }

        //check if first and second letters match
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);

        if (firstLetter == secondLetter) {
            return stringClean(str.substring(1));
        }

        return firstLetter + stringClean(str.substring(1));

    }


    public static void main(String[] args) {

        System.out.println(countHi("xxhixxhxxxxxxxhixxxxxixxxxxx"));
        System.out.println(stringClean("yyzzza"));

    }
}