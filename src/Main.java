import java.util.ArrayList;

public class Main {
    public static boolean isHappy(int number) {

        ArrayList<Integer> remember = new ArrayList<Integer>();
        while (number != 1) {
            remember.add(number);

            int sum = 0;

            while (number != 0) {
                sum+=Math.pow(number % 10, 2);
                number /= 10;
            }

            number = sum;

            if (remember.contains(number)) {
                return false;
            }


        }

        return  true;
    }


    public static void print10Happy(int number) {
        int count = 0;

        while (count < 10) {
            if(isHappy(number)) {
                count++;
                System.out.println(number);
            }

            number++;
        }
    }


    public static void main(String[] args) {
        print10Happy(100);
    }
}
