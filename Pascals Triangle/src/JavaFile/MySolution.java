package JavaFile;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public List<List<Integer>> generate(int numRows) {

//        This solution only works when numRows <=21
//        It's based on mathematical terms and formulas and unfortunately 22! is too much
//        for long variable

        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        //creating list of list
        for (int i = 1; i <= addRow(numRows).size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                row.add(addRow(i).get(j));
            }
            pascalsTriangle.add(row);
        }
        //printing list of lists
        for (int i = 0; i < pascalsTriangle.size() ; i++) {
            for (int j = 0; j < pascalsTriangle.get(i).size(); j++) {
                System.out.print(pascalsTriangle.get(i).get(j) + " ");
            }
            System.out.println();
        }


        return pascalsTriangle;
    }
    //adding a number to the list of certain layer
    public static List<Integer> addRow(int n){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(binomialTheorem(n - 1, i));
        }

        return numbers;
    }
    //counting Binomial Theorem for certain number of layer
    public static int binomialTheorem(int n, int k){
        int binomial;
        binomial = (int) (factorial(n)/(factorial(k) * factorial(n - k)));

        return binomial;
    }
    //counting factorial needed in Binomial Theorem
    public static long factorial(int x) {
        long factorial = 1;
        for (int i = 1; i <= x ; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

