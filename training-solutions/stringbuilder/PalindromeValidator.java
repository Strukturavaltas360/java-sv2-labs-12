package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {

        if (word == null)  {
            System.out.println("A string értéke null!");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(word).reverse();
        return word.equalsIgnoreCase(sb.toString()) ? true : false;

    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        System.out.println(palindromeValidator.isPalindrome("rétipipitér"));
    }

}
