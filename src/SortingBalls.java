/**
 * Created by Jose.Loureiro on 2017/09/20.
 */

import java.util.*;

public class SortingBalls {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);//scanner to read input
        int in;//input to be read from Standard Input
        Vector<Integer> vector = new Vector<Integer>();//vector to manipulate input
        Integer n[] = new Integer[6];// array with results;

        for (int i=0;i<6;i++){
            in = sc.nextInt();
            //System.out.println(in);
            vector.add(in);
        }

        //convert and print result
        n = (Integer[]) vector.toArray(new Integer[6]);
        for (int i=0;i<6;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();

    }
}
