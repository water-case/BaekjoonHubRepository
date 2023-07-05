class Solution {
    public long solution(String numbers) {
        
        long res = 0;
        
        while(numbers.length() != 0) {
            res *= 10;
            if(numbers.startsWith("zero")) {
                numbers = numbers.substring(4, numbers.length());
            }
            else if(numbers.startsWith("one")) {
                res += 1;
                numbers = numbers.substring(3, numbers.length());
            }
            else if(numbers.startsWith("two")) {
                res += 2;
                numbers = numbers.substring(3, numbers.length());
            }
            else if(numbers.startsWith("three")) {
                res += 3;
                numbers = numbers.substring(5, numbers.length());
            }
            else if(numbers.startsWith("four")) {
                res += 4;
                numbers = numbers.substring(4, numbers.length());
            }
            else if(numbers.startsWith("five")) {
                res += 5;
                numbers = numbers.substring(4, numbers.length());
            }
            else if(numbers.startsWith("six")) {
                res += 6;
                numbers = numbers.substring(3, numbers.length());
            }
            else if(numbers.startsWith("seven")) {
                res += 7;
                numbers = numbers.substring(5, numbers.length());
            }
            else if(numbers.startsWith("eight")) {
                res += 8;
                numbers = numbers.substring(5, numbers.length());
            }
            else if(numbers.startsWith("nine")) {
                res += 9;
                numbers = numbers.substring(4, numbers.length());
            }
        }
        
        return res;
    }
}