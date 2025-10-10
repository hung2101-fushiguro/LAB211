import java.util.Random;

public class binarySearch {
    private int[] array;

    public binarySearch(int n) {
        this.array = new int[n];
    }

    public void addArray() {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(50);
        }
    }

    public void disp() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int Search(int x) {
        int left = 0;
        int right = array.length - 1;
        for (int i = left; i <= right; i++) {
            int mid = (left + right) / 2;
            if (array[mid] == x)
                return mid;
            else if (array[mid] > x)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public void Sort() {
        int size = array.length;
        boolean check = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if (!check)
                break;
        }
    }
}
