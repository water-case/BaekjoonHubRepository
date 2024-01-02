import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        String n1 = "", n2 = "=";
        if(input[0]+input[1] == input[2]) {
            n1 = "+";
        } else if(input[0]-input[1] == input[2]) {
            n1 = "-";
        } else if(input[0]*input[1] == input[2]) {
            n1 = "*";
        } else if(input[0]/input[1] == input[2]){
            n1 = "/";
        } else if(input[0] == input[1]+input[2]) {
            n1 = "=";
            n2 = "+";
        } else if(input[0] == input[1]-input[2]) {
            n1 = "=";
            n2 = "-";
        } else if(input[0] == input[1]*input[2]) {
            n1 = "=";
            n2 = "*";
        } else if(input[0] == input[1]/input[2]){
            n1 = "=";
            n2 = "/";
        }

        System.out.println(input[0]+n1+input[1]+n2+input[2]);
        br.close();
    }

}
