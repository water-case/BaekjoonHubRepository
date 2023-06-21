import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board, int k) {
        return IntStream.range(0, board.length)
            .map(i -> IntStream.range(0, board[0].length)
                                    .map(j -> i+j <= k ? board[i][j] : 0 ).sum())
            .sum();
    }
}