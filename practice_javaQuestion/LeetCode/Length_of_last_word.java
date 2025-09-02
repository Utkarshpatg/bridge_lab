package LeetCode;

public class Length_of_last_word {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return (arr[arr.length-1]).length();
    }
}
