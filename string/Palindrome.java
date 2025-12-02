
public class Palindrome {

  public static Boolean checkPallindrome(String str) {

    StringBuilder res = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      res.append(str.charAt(i));
    }
    System.out.println("res: " + res.toString());
    return str.equals(res.toString());
  }

  public static void main(String[] args) {
    String str = "abba";
    System.out.println(checkPallindrome(str));
  }
}
