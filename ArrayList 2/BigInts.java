
import java.util.ArrayList;

public class BigInts
{
    public static ArrayList<Integer> add (ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        ArrayList<Integer> sum1 = new ArrayList<Integer>();
        int tempSum = 0;
        int ones = 0;
        int tens = 0;
        if (a.size() > b.size()){
            for (int i = 1; i <= b.size(); i ++) {
                tempSum = a.get(a.size() - i) + b.get(b.size() - i);
                System.out.println("a: " + a.get(a.size() - 1));
                System.out.println("b: " + b.get(b.size() - 1));
                System.out.println("tempSum: " + tempSum);
                ones = tempSum%10 + tens;
                System.out.println("ones: " + ones);
                tens = (tempSum - tempSum%10)/10;
                System.out.println("tens: " + tens);
                tempSum = 0;
                sum.add(ones);
            }
            for (int i = a.size() - b.size() - 1; i >= 0; i --) {
                tempSum = a.get(i) + tens;
                System.out.println("End tens: " + tens);
                System.out.println("End tempSum: " + tempSum);
                sum.add(tempSum);
                tempSum = 0;
            }
            for (int i = sum.size() - 1; i >= 0; i --) {
                sum1.add(sum.get(i));
            }          
        }
        if (b.size() > a.size()) {
            for (int i = 1; i <= a.size(); i ++) {
                tempSum = a.get(a.size() - i) + b.get(b.size() - i);
                System.out.println("a: " + a.get(a.size() - 1));
                System.out.println("b: " + b.get(b.size() - 1));
                System.out.println("tempSum: " + tempSum);
                ones = tempSum%10 + tens;
                System.out.println("ones: " + ones);
                tens = (tempSum - tempSum%10)/10;
                System.out.println("tens: " + tens);
                tempSum = 0;
                sum.add(ones);
            }
            for (int i = b.size() - a.size() - 1; i >= 0; i --) {
                tempSum = b.get(i) + tens;
                System.out.println("End tens: " + tens);
                System.out.println("End tempSum: " + tempSum);
                sum.add(tempSum);
                tempSum = 0;
            }
            for (int i = sum.size() - 1; i >= 0; i --) {
                sum1.add(sum.get(i));
            }
        }
        return sum1;
    }

    public static void main (String args[]) {
        ArrayList<Integer> sixtyNine = new ArrayList<Integer>();
        sixtyNine.add(6);
        sixtyNine.add(9);
        sixtyNine.add(6);
        sixtyNine.add(9);
        ArrayList<Integer> fourTwenty = new ArrayList<Integer>();
        fourTwenty.add(4);
        fourTwenty.add(2);
        fourTwenty.add(0);
        System.out.println(sixtyNine + " + " + fourTwenty + " = [7, 3, 8, 9]");
        System.out.println(add(sixtyNine, fourTwenty));
        System.out.println(fourTwenty + " + " + sixtyNine + " = [7, 3, 8, 9]");
        System.out.println(add(fourTwenty, sixtyNine));
    }
}
