import java.io.*;
import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());

    }

}
