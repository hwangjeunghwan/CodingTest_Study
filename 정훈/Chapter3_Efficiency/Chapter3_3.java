package CodingTest_Study.정훈.Chapter3_Efficiency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter3_3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum+=(arr[i]- arr[i-k]);
//            System.out.println("sum" + sum);
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }

}
