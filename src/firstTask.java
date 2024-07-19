public class firstTask {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        maxAr(ar);
    }
    public static void maxAr(int[] ar){
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max){
                max = ar[i];
            }
        }
        System.out.println("Найбільше число у масиві = " + max);
    }
}
