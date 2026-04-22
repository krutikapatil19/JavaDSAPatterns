public class sortArray {
    
    public static void sortTheArray(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            // find correct index for current element
            int correctIndex = arr[i] - 1;

            // swap only if element is not at correct position
            if (arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                // if already correct, then move ahead
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        sortTheArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

