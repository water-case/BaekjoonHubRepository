import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static int res, N, M, mid, mapSize;
    static int[][] map;
    static List<Integer> mapList;
    static List<Magic> magicList;
    static List<Integer>[] delIdx; // 상하좌우
    static int[] rotateX = { 0, 1, 0,-1}; // 좌하우상
    static int[] rotateY = {-1, 0, 1, 0}; // 좌하우상

    private static void solve() {
        for(Magic m : magicList) {
            magic(m);
            move();
            while(searchExplode()) {
                res += explode();
                move();
            }
            changeMap();
        }
    }

    private static void changeMap() {
        List<Integer> newMapList = new ArrayList<>();
        newMapList.add(0);

        if(mapList.size() == 1) {
            return;
        }

        int num = mapList.get(1), cnt = 1;
        for(int i=2; i<mapList.size(); i++) {
            if(newMapList.size() > mapSize) {
                break;
            }
            int now = mapList.get(i);
            if(now == 0) {
                newMapList.add(cnt);
                newMapList.add(num);
                break;
            }

            if(now != num) {
                newMapList.add(cnt);
                newMapList.add(num);
                num = now;
                cnt = 1;
            } else {
                cnt++;
            }
        }
        if(newMapList.size() > mapSize) {
            newMapList = newMapList.subList(0, mapSize);
        }
        mapList = newMapList;
        mapList.add(0);
    }

    private static boolean searchExplode() {
        int num, cnt, startIdx;
        num = cnt = startIdx = 0;

        for(int i=1; i<mapList.size(); i++) {
            if(num != mapList.get(i)) {
                if(cnt < 4) {
                    num = mapList.get(i);
                    startIdx = i;
                    cnt = 1;
                    continue;
                }
                return true;
            } else {
                cnt++;
            }
        }

        return false;
    }

    private static int explode() {
        int res = 0;
        int num, cnt, startIdx;
        num = cnt = startIdx = 0;

        for(int i=1; i<mapList.size(); i++) {
            if(num != mapList.get(i)) {
                if(cnt < 4) {
                    num = mapList.get(i);
                    startIdx = i;
                    cnt = 1;
                    continue;
                }

                for(int j=startIdx; j<i; j++) {
                    res += mapList.get(j);
                    mapList.set(j, 0);
                }
                startIdx = i;
                num = mapList.get(i);
                cnt = 1;
            } else {
                cnt++;
            }
        }

        return res;
    }

    private static void move() {
        for(int i=1; i<mapList.size(); i++) {
            if(mapList.get(i) != 0) {
                continue;
            }
            for(int j=i+1; j<mapList.size(); j++) {
                if(mapList.get(j) != 0) {
                    mapList.set(i, mapList.get(j));
                    mapList.set(j, 0);
                    break;
                }
            }
        }
    }

    private static void magic(Magic m) {
        for(int s=0; s<m.s; s++) {
            if(delIdx[m.d].get(s) >= mapList.size()) {
                break;
            }
            mapList.set(delIdx[m.d].get(s), 0);
        }
    }

    private static void init(BufferedReader br) throws Exception {
        res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        mid = N/2;
        mapSize = N*N;

        map = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        mapList = new ArrayList<>();
        makeMapList();

        magicList = new ArrayList<>();
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int d = Integer.parseInt(st.nextToken()) - 1;
            int s = Integer.parseInt(st.nextToken());
            magicList.add(new Magic(d, s));
        }

        delIdx = new ArrayList[4];
        makeIdx();
    }

    private static void makeIdx() {
        for(int i=0; i<4; i++) {
            delIdx[i] = new ArrayList<Integer>();
        }
        delIdx[0].add(7);
        delIdx[1].add(3);
        delIdx[2].add(1);
        delIdx[3].add(5);

        for(int i=0; i<4; i++) {
            int prev = 0;
            int n = delIdx[i].get(0);
            while(true) {
                int cal = n + (n-prev+8);

                if(cal > N*N) {
                    break;
                }

                delIdx[i].add(cal);
                prev = n;
                n = cal;
            }
        }
    }

    private static void makeMapList() {
        int x ,y, s, cnt, d;
        x = y = mid;
        d = 0;
        s = 1;
        cnt = 0;

        mapList.add(map[x][y]);

        while(true) {
            x += rotateX[d];
            y += rotateY[d];
            if(x<0 || y<0 || map[x][y]==0) {
                break;
            }
            mapList.add(map[x][y]);

            cnt++;
            if(s == cnt) {
                if(d % 2 != 0) {
                    s++;
                }
                cnt = 0;
                d = (d+1) % 4;
            }
        }

        mapList.add(0);
    }

    static class Magic {
        int d, s;

        public Magic(int d, int s) {
            this.d = d;
            this.s = s;
        }
    }

}
