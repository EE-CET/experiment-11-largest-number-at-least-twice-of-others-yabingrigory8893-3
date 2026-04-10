import java.util.Scanner;

public class LargestTwice {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int[] nums = new int[n];
            int max = -1;
            int maxIndex = -1;
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    nums[i] = sc.nextInt();
                    if (nums[i] > max) {
                        max = nums[i];
                        maxIndex = i;
                    }
                }
            }
            
            boolean isValid = true;
            for (int i = 0; i < n; i++) {
                if (i != maxIndex && max < 2L * nums[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                System.out.println(maxIndex);
            } else {
                System.out.println(-1);
            }
        }
    }
}

