package course1;
// 테트리스를 해본 사람이라면 작대기 모양 테트리미노가 나오길 간절히 기다렸던 적이 있을 것이다. 지금 윤성이가 그러하다.
// 기다리고 기다리던 작대기 모양 테트리미노가 드디어 나온 것이다.
// 테트리스 맵은 가로로 C칸, 세로로 R칸의 C×R격자형 모양이다. 예를 들어보자. 아래 그림은 가로가 6칸, 세로가 6칸인 테트리스 맵의 상태이다.
// 이때 가로가 1칸이고 세로가 4칸인 1×4 직사가형 작대기 모양의 테트리미노(테트리미노는 항상 1×4)를 왼쪽에서 5번째 칸에 둘 경우 총 세줄의 수평선을 메울 수 있다.
// 테트리스는 한번에 여러 수평선을 메울수록 큰 점수를 얻는 게임이므로, 위 경우에서는 이 방법이 가장 높은 점수를 얻을 수 있는 방법이다.
// 윤성이를 도와 작대기 모양 테트리미노를 어디에 두었을 때 가장 높은 점수를 얻을 수 있는지 알려주자.
// (윤성이는 작대기 모양 테트리미노가 나왔을때 게임오버를 당할지언정 가로가 더 길도록 눕혀서 두지 않는다는 나름의 테트리스 철학이 있다.)
// 첫 줄에는 격자 크기를 나타내는 정수 C와 R이 하나의 공백을 사이에 두고 차례대로 주어진다. 두 값의 범위는 5 ≤ C, R ≤ 20이다.
// 그다음 줄 부터 총 R줄에 걸쳐 맵의 상태를 나타내는 숫자들이 공백을 사이에 두고 주어진다. 0은 아직 채워지지 않은 칸을 나타내며 1은 채워져있는 칸을 나타낸다.
// input:
// 6 6
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 1 1 1 0 0 1
// 1 1 1 1 0 1
// 1 1 1 1 0 1
// 1 1 1 1 0 1
//
// output
// 5 3
import java.util.Scanner;

public class tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[C][R];
        int X = 0; // initialize X
        int Y = 0;
        for (int i = 0; i < C; i++) {
            for (int k = 0; k < R; k++) {
                arr[i][k] = sc.nextInt();
            }
        }

        for (int k = 0; k < R; k++) {
            int count = 0;
            int touched = 0;
            for (int i = 0; i < C; i++) {
                if (arr[i][k] == 0) {
                    count++;
                } else {
                    touched = i;
                    break;
                }
            }
            if (count >= 4) {
                if (count == C) {
                    touched = C - 1;
                }

                for (int i = touched; i > touched - 4; i--) {
                    arr[i][k] = 1;
                }
                int score = 0;
                for (int i = 0; i < C; i++) {
                    int track = 0;
                    for (int h = 0; h < R; h++) {
                        if (arr[i][h] == 1) {
                            track++;
                        }
                    }
                    if (track == R) {
                        score++;
                    }
                }
                if (Y < score) {
                    X = k + 1;
                    Y = score;
                }

                for (int i = touched; i > touched - 4; i--) {
                    arr[i][k] = 0;
                }
            }
        }

        System.out.println(X + " " + Y);
        sc.close();
    }
}
