import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = Integer.parseInt(br.readLine());

        br.close();
    }

    static int S;

    private static void solve() {
        int res = 0;

        res = bfs();

        System.out.println(res);
    }

    private static int bfs() {
        int cnt = 0;

        boolean[][] v = new boolean[1001][1001];
        Queue<EmoticonIF> q = new ArrayDeque<>();
        q.offer(new EmoticonIF());
        v[1][0] = true;
        while(!q.isEmpty()) {
            EmoticonIF now = q.poll();

            EmoticonIF first = new EmoticonIF(now);
            first.copy();
            if(!v[first.windowCnt][first.clipCnt]) {
                q.offer(first);
                v[first.windowCnt][first.clipCnt] = true;
            }

            EmoticonIF second = new EmoticonIF(now);
            if(second.paste() == S) {
                cnt = second.time;
                break;
            }
            if(!v[second.windowCnt][second.clipCnt]) {
                q.offer(second);
                v[second.windowCnt][second.clipCnt] = true;
            }

            EmoticonIF third = new EmoticonIF(now);
            if(third.remove() == S) {
                cnt = third.time;
                break;
            }
            if(!v[third.windowCnt][third.clipCnt]) {
                q.offer(third);
                v[third.windowCnt][third.clipCnt] = true;
            }
        }

        return cnt;
    }

    static class EmoticonIF {
        int windowCnt, clipCnt, time;

        public EmoticonIF() {
            windowCnt = 1;
            clipCnt = 0;
            time = 0;
        }

        public EmoticonIF(EmoticonIF emoticonIF) {
            windowCnt = emoticonIF.windowCnt;
            clipCnt = emoticonIF.clipCnt;
            time = emoticonIF.time;
        }

        public int copy() {
            clipCnt = windowCnt;

            return lastAction();
        }

        public int paste() {
            if(clipCnt != 0 && windowCnt + clipCnt <=1000) {
                windowCnt += clipCnt;
            }

            return lastAction();
        }

        public int remove() {
            if(windowCnt > 0) {
                windowCnt--;
            }

            return lastAction();
        }

        private int lastAction() {
            time++;
            return windowCnt;
        }
    }

}
