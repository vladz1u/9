import java.util.ArrayList;

public class fourthTask {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 2, 1};
        printAr(frequencyAr(ar));
    }

    public static ArrayList<Integer> frequencyAr(int[] ar){
        ArrayList<Integer> frequency = new ArrayList<>();
        int count;
        for (int i = 0; i < ar.length; i++) {
            count = 0;
            for (int j = 0; j < ar.length; j++) {
                if(ar[j] == ar[i]){
                    count++;
                }
            }
            frequency.add(count);
        }
        return frequency;
    }

    public static void printAr(ArrayList<Integer> ar){
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
    }
}
