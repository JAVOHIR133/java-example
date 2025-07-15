//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Azizaa";
        System.out.println(palindrome(text));
        System.out.println(palindrome("javbohi"));
        System.out.println(palindrome("saasassa"));
        System.out.println(palindrome(text));
        System.out.println(palindrome(text));
    }

    static boolean palindrome(String value){
        StringBuilder newValue = new StringBuilder();

        for (int i=0;i<value.length();i++){
            newValue.append(value, value.length() - 1 - i, value.length() - i);
        }

        return value.equalsIgnoreCase(newValue.toString());
    }
}