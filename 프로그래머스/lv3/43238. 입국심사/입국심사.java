class Solution {
    public long solution(int n, int[] times) {
        long start = 0, end = 1_000_000_000_000_000_000L;
        long res = 0;

        while(start <= end) {
            long mid = (start + end) / 2;

            long cal = 0;
            for(int time : times) {
                cal += mid / time;
            }

            if(cal >= n) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}