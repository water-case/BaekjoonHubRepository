import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve(br);

        System.out.println(res);
        br.close();
    }

    static int[] delx = { 0, 1, 0,-1};
    static int[] dely = { 1, 0,-1, 0};
    static int A, B, N, M;
    static Robot[][] map;
    static ArrayList<Robot> robotList = new ArrayList<>();
    static String res = "OK";

    private static void solve(BufferedReader br) throws Exception {
        while(M-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int robotNum = Integer.parseInt(st.nextToken())-1;
            String order = st.nextToken();
            int orderNum = Integer.parseInt(st.nextToken());

            Robot nowRobot = robotList.get(robotNum);
            while(orderNum-->0) {
                switch(order) {
                    case "L":
                        nowRobot.d = DIRECT.values()[((nowRobot.d.ordinal()+3)%4)];
                        break;
                    case "R":
                        nowRobot.d = DIRECT.values()[((nowRobot.d.ordinal()+1)%4)];
                        break;
                    case "F":
                        if(!robotMove(nowRobot)) {
                            return;
                        }
                        break;
                }
            }
        }
    }

    private static boolean robotMove(Robot robot) {
        int dx = robot.x + delx[robot.d.ordinal()];
        int dy = robot.y + dely[robot.d.ordinal()];

        if(dx<0 || dx>=A || dy<0 || dy>=B) {
            res = "Robot " + robot.n + " crashes into the wall";
            return false;
        }

        if(map[dy][dx] != null) {
            res = "Robot " + robot.n + " crashes into robot " + map[dy][dx].n;
            return false;
        }

        map[robot.y][robot.x] = null;

        robot.x = dx;
        robot.y = dy;
        map[dy][dx] = robot;

        return true;
    }

    private static void init(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        map = new Robot[B][A];

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            String d = st.nextToken();
            Robot robot = new Robot(i, x, y, DIRECT.valueOf(d));
            robotList.add(robot);
            map[y][x] = robot;
        }
    }

    static class Robot {
        int n, x, y;
        DIRECT d;

        public Robot(int n, int x, int y, DIRECT d) {
            this.n = n;
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    enum DIRECT {
        N, E, S, W;
    }

}
