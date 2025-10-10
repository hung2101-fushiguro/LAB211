public class LargeNumber {
    private String num;


    public LargeNumber(String num) {
        this.num = num;
    }

    public String convertToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!(sb.length() == 0 && arr[i] == 0)) {
                sb.append(arr[i]);
            }
        }
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }

    public LargeNumber add(LargeNumber largeNumber) {
        int k = Math.max(this.num.length(), largeNumber.num.length());
        int[] result = new int[k + 1];
        int i = this.num.length() - 1;
        int j = largeNumber.num.length() - 1;
        int r = 0;
        while (i >= 0 || j >= 0) {
            int num1 = (i >= 0) ? this.num.charAt(i) - '0' : 0;
            int num2 = (j >= 0) ? largeNumber.num.charAt(j) - '0' : 0;
            int kq = num1 + num2 + r;
            result[k] = kq % 10;
            r = kq / 10;
            i--;
            j--;
            k--;
        }
        if (r > 0) result[k] = r;
        return new LargeNumber(convertToString(result));
    }

    public LargeNumber multiply(LargeNumber largeNumber) {
        int n1 = this.num.length();
        int n2 = largeNumber.num.length();
        int[] result = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int num1 = (i >= 0) ? this.num.charAt(i) - '0' : 0;
                int num2 = (j >= 0) ? largeNumber.num.charAt(j) - '0' : 0;
                int mul = num1 * num2;
                int sum = mul + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        return new LargeNumber(convertToString(result));
    }

    @Override
    public String toString() {
        return num;
    }
}
