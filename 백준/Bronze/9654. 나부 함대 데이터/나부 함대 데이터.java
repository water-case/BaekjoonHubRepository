import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%-15s", "SHIP NAME")).append(String.format("%-15s", "CLASS")).append(String.format("%-11s", "DEPLOYMENT")).append(String.format("%-10s", "IN SERVICE")).append("\n");
        sb.append(String.format("%-15s", "N2 Bomber")).append(String.format("%-15s", "Heavy Fighter")).append(String.format("%-11s", "Limited")).append(String.format("%-10s", "21")).append("\n");
        sb.append(String.format("%-15s", "J-Type 327")).append(String.format("%-15s", "Light Combat")).append(String.format("%-11s", "Unlimited")).append(String.format("%-10s", "1")).append("\n");
        sb.append(String.format("%-15s", "NX Cruiser")).append(String.format("%-15s", "Medium Fighter")).append(String.format("%-11s", "Limited")).append(String.format("%-10s", "18")).append("\n");
        sb.append(String.format("%-15s", "N1 Starfighter")).append(String.format("%-15s", "Medium Fighter")).append(String.format("%-11s", "Unlimited")).append(String.format("%-10s", "25")).append("\n");
        sb.append(String.format("%-15s", "Royal Cruiser")).append(String.format("%-15s", "Light Combat")).append(String.format("%-11s", "Limited")).append(String.format("%-10s", "4")).append("\n");

        System.out.println(sb.toString());
    }

}
