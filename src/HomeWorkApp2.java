import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 15;
        String peace = "Hello World!!!";
        System.out.println(doWork(x, y));
        System.out.println(doCompare(y));
        System.out.println(doComparison(y));
        doCopy(peace, x);
        System.out.println(LeapYear(x));
    }

    public static boolean doWork(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String doCompare(int a) {
        if (a >= 0) {
            return "число положительное";
        } else {
            return "число отрицательное";
        }
    }

    public static boolean doComparison(int a) {
        return (a < 0);
    }

    public static void doCopy(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean LeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
