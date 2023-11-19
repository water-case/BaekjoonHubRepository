import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] wordArr = br.readLine().toCharArray();

        for(int i=0; i<wordArr.length; i++) {
            wordArr[i] = (char)(((wordArr[i]-65+23)%26)+65);
        }

        StringBuilder res = new StringBuilder();
        for(char c:wordArr){
            res.append(c);
        }
        System.out.println(res.toString());
        br.close();
    }

}
