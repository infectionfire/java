import java.util.Arrays;
import java.util.Scanner;

public class PointCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] data = new int[n][];
        int count = 0;
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            data[count++] = new int[]{a,b};
        }
        Arrays.sort(data,(o1, o2) -> {
            int v = o1[1] - o2[1];
            return v != 0 ? v : o1[0] - o2[0];
        });
        //System.out.println(Arrays.deepToString(data));
        String[] res = coverArray(data);
        System.out.println(res.length);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }
    }

    public static String[] coverArray(int[][] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0, l = arr.length; i < l ; i++ ) {
            int point = arr[i][1];
            for (int j = i ; j < l && point <= arr[j][1] && point >= arr[j][0] ; j++) {
                i = j;
            }
            sb.append(point).append(" ");
        }
        return sb.toString().split(" ");
    }
}
