import java.io.*;
import java.util.*;

public class Main {

    static class Piece {
        int n, r, c, d;

        public Piece(int n, int r, int c, int d) {
            this.n = n;
            setPos(r, c);
            this.d = d;
        }

        public void setPos(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public int getDx() {
            return this.r + delx[d];
        }

        public int getDy() {
            return this.c + dely[d];
        }

        public void changeDirect() {
            d = (d%2==0) ? d+1 : d-1;
        }
    }

    static class Pos {
        ArrayList<Piece> list;
        int r, c, color;

        public Pos(int r, int c, int color) {
            list = new ArrayList<>();
            this.r = r;
            this.c = c;
            this.color = color;
        }

        public void add(Piece p) {
            p.setPos(r, c);
            this.list.add(p);
        }

        public void addList(ArrayList<Piece> list) {
            for(Piece p : list) {
                this.add(p);
            }

            list.removeAll(list);
        }

        public void addReverseList(ArrayList<Piece> list) {
            Collections.reverse(list);
            addList(list);
        }
    }

    static int[] delx={ 0, 0,-1, 1}; // 우좌상하
    static int[] dely={ 1,-1, 0, 0}; // 우좌상하
    static int N,K;
    static Pos[][] map;
    static Piece[] pieces;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new Pos[N][N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++) {
                map[i][j] = new Pos(i, j, Integer.parseInt(st.nextToken())); // 0:흰 1:빨 2:파
            }
        }

        pieces = new Piece[K];
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            int d = Integer.parseInt(st.nextToken())-1;

            pieces[i] = new Piece(i, r, c, d);
            map[r][c].add(pieces[i]);
        }

        int res = 1;
        while(nextTime()) {
            if(res++>1000) {
                break;
            }
        }
        System.out.println(res>1000?-1:res);
        br.close();
    }

    private static boolean nextTime() {
        for(int i=0; i<K; i++) {
            Piece nowPiece = pieces[i];
            Pos nowPos = map[nowPiece.r][nowPiece.c];

            if(nowPos.list.size()>=4) return false;

            if(nowPos.list.get(0) != nowPiece) {
                continue;
            }

            int dx = nowPiece.getDx();
            int dy = nowPiece.getDy();

            boolean moveChk = true;
            int caseNum = 0;
            if(dx<0 || dx>=N || dy<0 || dy>=N) {
                caseNum = 2;
                moveChk = false;
            }
            caseNum = caseNum==2 ? 2 : map[dx][dy].color;

            switch (caseNum) {
                case 0:
                    map[dx][dy].addList(nowPos.list);
                    break;
                case 1:
                    map[dx][dy].addReverseList(nowPos.list);
                    break;
                case 2:
                    if(moveBlue(nowPiece, nowPos.list)) {
                        dx = nowPiece.getDx();
                        dy = nowPiece.getDy();

                        if(map[dx][dy].color == 0) {
                            map[dx][dy].addList(nowPos.list);
                        } else {
                            map[dx][dy].addReverseList(nowPos.list);
                        }
                        moveChk = true;
                    }
                    break;
            }

            if(moveChk && map[dx][dy].list.size()>= 4) {
                return false;
            }
        }

        return true;
    }

    private static boolean moveBlue(Piece nowPiece, ArrayList<Piece> list) {
        nowPiece.changeDirect();

        int dx = nowPiece.getDx();
        int dy = nowPiece.getDy();

        if(dx<0 || dx>=N || dy<0 || dy>=N || map[dx][dy].color == 2) {
            return false;
        }

        return true;
    }

}
