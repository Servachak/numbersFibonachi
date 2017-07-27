/**
 * Created by adavi on 26.07.2017.
 */
public class Fibonachi {

    public int [] arrayBuild(int k){
        int [] arr = new int [k];
        int numberFibonachi = 1;
        int s = 0;
        int f = 1;
        for (int i = 0; i < arr.length; i++){

            arr[i] = numberFibonachi;
            System.out.println(arr[i]);

            numberFibonachi += s;
            s = f;
            f = numberFibonachi;
        }
        return arr;
    }
}
