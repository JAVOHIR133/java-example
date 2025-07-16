import java.util.Locale;
import java.util.logging.SocketHandler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//String ism = "javohir";
//        System.out.println(ism);
//        String text = "Javohir";
//        System.out.println(text.length());
//        System.out.println(text.toUpperCase());
//        System.out.println(text.toLowerCase());
//        System.out.println(text.charAt(4));
//        System.out.println(text.substring(1,4));
//        String matn = "hello";
//        for (int i = 0; i < matn.length(); i++) {
//            System.out.println(matn.charAt(i));
//        }
//        String text ="classmasterghgghgggggh" ;
//        System.out.println(text.length());
//        System.out.println("boshlanish yarmi "+text.substring(0,5));
//        System.out.println("oxirgi yarimi "+text.substring(5,11));
//        System.out  .println("orta yarimi "+text.substring(3,7));
//        System.out.println(text);


        String text = "adjngdfhdhudfdbvsjbvhdsfb";
        System.out.println(text.length());


    }

    static boolean palindrome(String value) {
        StringBuilder newValue = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            newValue.append(value, value.length() - 1 - i, value.length() - i);
        }

        return value.equalsIgnoreCase(newValue.toString());
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }
    //     return a==b ? a+b:(a+b)*2;

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return a + b;
        } else {
            return 2 * a + 2 * b;
        }
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;

        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) && a+b==10) {
            return true;
        } else {
            return false;
        }
    }
    public boolean nearHundred(int n) {
        if (Math.abs(100-n)==10 || Math.abs(200-n)==10){
            return true;
        } else {
            return false;
        }
    }
    public static String frontBack(String str) {
        return "";
    }
    public boolean startHi(String str) {
       return true;
    }
    public static String makeTags(String tag, String word) {
       return String.format("<%s>%s</%s>", tag, word, tag);
    }


}