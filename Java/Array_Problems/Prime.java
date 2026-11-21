public class Prime {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 8, 7, 9, 11};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 1; j <= arr[i]; j++) {

                if (arr[i] % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(arr[i]);
            }
        }
    }
}