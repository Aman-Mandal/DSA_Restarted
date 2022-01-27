package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,-62,7896};
        System.out.println(findNumbers(nums));
    }

    // finding the numbers
    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    // checking the number is Even or not
    static public boolean isEven(int num){
        int digits = numberOfDigits(num);
        if (digits % 2 == 0) {
            return true;
        }
        return false;
    }

    // for finding the digits
    static public int numberOfDigits(int num){
        int count = 0;

        if(num == 0){
            return 1;
        }
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
