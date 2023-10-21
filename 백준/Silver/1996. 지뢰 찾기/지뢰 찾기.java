import java.io.*;

public class Main {

    static int[] delx = {-1,-1, 0, 1, 1, 1, 0,-1}; // 12시부터 시계방향
    static int[] dely = { 0, 1, 1, 1, 0,-1,-1,-1}; // 12시부터 시계방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][];
        for(int i=0; i<N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        char[][] resMap = new char[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] != '.') {
                    resMap[i][j] = '*';
                    continue;
                }

                int cnt = 0;
                for(int d=0; d<8; d++) {
                    int dx = i + delx[d], dy = j+dely[d];
                    if(dx<0 || dx>=N || dy<0 || dy>=N || map[dx][dy] == '.') {
                        continue;
                    }

                    cnt += (map[dx][dy] - 48);
                }
                resMap[i][j] = cnt >= 10 ? 'M' : (char)(cnt + 48);
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                res.append(resMap[i][j]);
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
