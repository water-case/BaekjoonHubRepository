import java.io.*;
import java.util.*;

public class Main {

    enum DNA_ORDER {
        A('A'), G('G'), C('C'), T('T');
        
        char ch;
        
        DNA_ORDER(char ch) {
            this.ch=ch;
        }
        
        public char getCharacter() {
            return ch;
        }
    }
    
    static char[][] dna= 
        {
            {'A','C','A','G'},
            {'C','G','T','A'},
            {'A','T','C','G'},
            {'G','A','G','T'}
        };
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        char[] input=br.readLine().toCharArray();
        int idx=N-1;
        
        char res=input[idx];
        while(idx-->0) {
            res=dna[searchDnaNumber(input[idx])][searchDnaNumber(res)];
        }
        System.out.println(res);
    }
    
    private static int searchDnaNumber(char c) {
        int res=-1;
        
        switch(c) {
            case 'A': res=DNA_ORDER.A.ordinal(); break;
            case 'G': res=DNA_ORDER.G.ordinal(); break;
            case 'C': res=DNA_ORDER.C.ordinal(); break;
            case 'T': res=DNA_ORDER.T.ordinal(); break;
        }
        
        return res;
    }
    
}
