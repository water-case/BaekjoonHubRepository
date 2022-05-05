import java.io.*;
import java.util.*;

public class Main {

	static class TrieNode {
		private Map<Character, TrieNode> child=new HashMap<>();
		private boolean last;
		
		Map<Character, TrieNode> getChild() {
			return this.child;
		}
		boolean isLast() {
			return last;
		}
		void setIsLast(boolean isLast) {
			this.last=isLast;
		}
	}
	
	static class Trie {
		private TrieNode root;
		
		public Trie() {
			root=new TrieNode();
		}
		
		void insert(String word) {
			TrieNode thisNode=this.root;
			for(int i=0; i<word.length(); i++) {
				thisNode=thisNode.getChild().computeIfAbsent(word.charAt(i), c->new TrieNode());
			}
			thisNode.setIsLast(true);
		}
		
		int contain(String word) {
			TrieNode thisNode=this.root;
			for(int i=0; i<word.length(); i++) {
				char c=word.charAt(i);
				TrieNode node=thisNode.getChild().get(c);
				if(node==null) return -1;
				thisNode=node;
			}
			return thisNode.isLast() ? 1: 0;
		}
		
	}
	
	static String[][] smap;
	static HashSet<String> set;
	static Trie trie;
	static int[] delx= {-1,-1, 0, 1, 1, 1, 0,-1}; // 12시부터 시계방향
	static int[] dely= { 0, 1, 1, 1, 0,-1,-1,-1}; // 12시부터 시계방향
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		trie=new Trie();
		
		int w=Integer.parseInt(br.readLine());
		for(int i=0; i<w; i++) {
			trie.insert(br.readLine());
		}
		br.readLine();
		
		int b=Integer.parseInt(br.readLine());
		smap=new String[4][4];
		for(int c=0; c<b; c++) {
			// 단어들 맵으로 만든다
			for(int m=0; m<4; m++)
				smap[m]=br.readLine().split("");
			
			// dfs로 단어만들어 체크하고, 존재하면 중복방지위해 set에 삽입
			set=new HashSet<>();
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					boolean[][] v=new boolean[4][4];
					v[i][j]=true;
					dfs(i,j,smap[i][j],v);
				}
			}
			br.readLine(); // 빈칸삭제
			
			// 점수계산
			int score=0, cnt=0;
			String max="";
			cnt=set.size();
			for(String s:set) {
				// 긴단어찾기
				if(s.length()>max.length()) max=s;
				// 길이같으면 사전순으로 앞서는것
				else if(s.length()==max.length() && s.compareTo(max)<0) max=s;
				// 점수
				if(s.length()==8) score+=11;
				else if(s.length()==7) score+=5;
				else if(s.length()==6) score+=3;
				else if(s.length()==5) score+=2;
				else if(s.length()==4||s.length()==3) score+=1;
			}
			System.out.println(score+" "+max+" "+cnt);
		}

		br.close();
	}

	static void dfs(int x, int y, String s, boolean[][] v) {
		int n=trie.contain(s);
		if(n==-1) {
			return;
		} else if(n== 1) {
			set.add(s);
		}
		
		for(int d=0; d<8; d++) {
			int dx=x+delx[d], dy=y+dely[d];
			if(dx<0||dx>=4||dy<0||dy>=4||v[dx][dy]) continue;
			v[dx][dy]=true;
			dfs(dx,dy,s+smap[dx][dy],v);
			v[dx][dy]=false;
		}
	}
	
}
