class Solution {
    public int solution(int[] numbers, int k) {
        int idx = (1 + 2 * (k-1)) % numbers.length;
        return numbers[idx == 0 ? numbers.length - 1 : idx - 1];
    }
}