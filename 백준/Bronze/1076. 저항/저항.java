import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        colorList = new ArrayList<>();
        for(int i=0; i<3; i++) {
            colorList.add(br.readLine());
        }

        br.close();
    }

    static List<String> colorList;

    private static void solve() {
        long cal = 0;

        for(int i=0; i<2; i++) {
            cal *= 10;
            switch (colorList.get(i)) {
                case "black" : cal += 0; break;
                case "brown" : cal += 1; break;
                case "red" : cal += 2; break;
                case "orange" : cal += 3; break;
                case "yellow" : cal += 4; break;
                case "green" : cal += 5; break;
                case "blue" : cal += 6; break;
                case "violet" : cal += 7; break;
                case "grey" : cal += 8; break;
                case "white" : cal += 9; break;
            }
        }

        switch (colorList.get(2)) {
            case "black" : cal *= 1; break;
            case "brown" : cal *= 10; break;
            case "red" : cal *= 100; break;
            case "orange" : cal *= 1_000; break;
            case "yellow" : cal *= 10_000; break;
            case "green" : cal *= 100_000; break;
            case "blue" : cal *= 1_000_000; break;
            case "violet" : cal *= 10_000_000; break;
            case "grey" : cal *= 100_000_000; break;
            case "white" : cal *= 1_000_000_000; break;
        }

        System.out.println(cal);
    }

}
