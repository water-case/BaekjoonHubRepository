import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static Map<Integer, List<String>> albumMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        initAlbumMap();

        int Q = Integer.parseInt(br.readLine());
        while(Q-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            int cnt = 0;
            StringBuilder tmp = new StringBuilder();

            for(int i=S; i<=E; i++) {
                if(!albumMap.containsKey(i)) {
                    continue;
                }

                List<String> sList = albumMap.get(i);
                cnt += sList.size();
                for(String str : sList) {
                    tmp.append(i).append(" " ).append(str).append("\n");
                }
            }

            res.append(cnt).append("\n")
                .append(tmp);
        }

        System.out.println(res.toString());
        br.close();
    }

    private static void albumMapPut(int i, String str) {
        if(!albumMap.containsKey(i)) {
            List<String> strList = new ArrayList<>();
            strList.add(str);
            albumMap.put(i, strList);
        } else {
            albumMap.get(i).add(str);
        }
    }

    private static void initAlbumMap() {
        albumMap = new HashMap<>();

        albumMapPut(1967, "DavidBowie");
        albumMapPut(1969, "SpaceOddity");
        albumMapPut(1970, "TheManWhoSoldTheWorld");
        albumMapPut(1971, "HunkyDory");
        albumMapPut(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
        albumMapPut(1973, "AladdinSane");
        albumMapPut(1973, "PinUps");
        albumMapPut(1974, "DiamondDogs");
        albumMapPut(1975, "YoungAmericans");
        albumMapPut(1976, "StationToStation");
        albumMapPut(1977, "Low");
        albumMapPut(1977, "Heroes");
        albumMapPut(1979, "Lodger");
        albumMapPut(1980, "ScaryMonstersAndSuperCreeps");
        albumMapPut(1983, "LetsDance");
        albumMapPut(1984, "Tonight");
        albumMapPut(1987, "NeverLetMeDown");
        albumMapPut(1993, "BlackTieWhiteNoise");
        albumMapPut(1995, "1.Outside");
        albumMapPut(1997, "Earthling");
        albumMapPut(1999, "Hours");
        albumMapPut(2002, "Heathen");
        albumMapPut(2003, "Reality");
        albumMapPut(2013, "TheNextDay");
        albumMapPut(2016, "BlackStar");
    }

}
