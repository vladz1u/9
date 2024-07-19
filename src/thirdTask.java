import java.util.ArrayList;
import java.util.HashSet;

public class thirdTask {
    public static void main(String[] args) {
        int[] ar = {5, 3, 3, 4, 7, 5};
        ArrayList<Integer> arUnique = uniqueAr(ar);
        printAr(arUnique);
    }

    public static ArrayList<Integer> uniqueAr(int[] ar) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : ar) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }

    public static void printAr(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();
    }
}
