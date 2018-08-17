import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
// 1th trial: 0-3 1 1 1
// 2nd trial: 1-5 1 2 1
// 4th trial: 45-50 1 2 1 1
public class fmmtalpha {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] line;
        line = in.nextLine().split(" ");
        int dist = Integer.parseInt(line[1]) - Integer.parseInt(line[0]);
        sb.append(warp(dist));

        out.write(sb.toString());
        out.close();
        in.close();
    }

    private static long warp(int dist) {
        long n, minN, powN, maxN, warpcount = 0;
        for (n=1;;n++) {
            powN = n * n;
            minN = powN - n + 1;
            maxN = powN + 1 - n + 1;
            if (minN <= dist && dist <= maxN) {
                warpcount = (n << 1) - 1;
                break;
            }else {
                warpcount = (n << 1);
                break;
            }

        }
        return warpcount;
    }
}