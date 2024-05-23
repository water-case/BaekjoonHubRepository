import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());
        String res = "";
        switch (y) {
            case 1995 : res = "ITMO"; break;
            case 1996 : res = "SPbSU"; break;
            case 1997 : res = "SPbSU"; break;
            case 1998 : res = "ITMO"; break;
            case 1999 : res = "ITMO"; break;
            case 2000 : res = "SPbSU"; break;
            case 2001 : res = "ITMO"; break;
            case 2002 : res = "ITMO"; break;
            case 2003 : res = "ITMO"; break;
            case 2004 : res = "ITMO"; break;
            case 2005 : res = "ITMO"; break;
            case 2006 : res = "PetrSU, ITMO"; break;
            case 2007 : res = "SPbSU"; break;
            case 2008 : res = "SPbSU"; break;
            case 2009 : res = "ITMO"; break;
            case 2010 : res = "ITMO"; break;
            case 2011 : res = "ITMO"; break;
            case 2012 : res = "ITMO"; break;
            case 2013 : res = "SPbSU"; break;
            case 2014 : res = "ITMO"; break;
            case 2015 : res = "ITMO"; break;
            case 2016 : res = "ITMO"; break;
            case 2017 : res = "ITMO"; break;
            case 2018 : res = "SPbSU"; break;
            case 2019 : res = "ITMO"; break;
        }

        System.out.println(res);
        br.close();
    }

}
