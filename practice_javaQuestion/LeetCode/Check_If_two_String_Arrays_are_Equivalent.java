package LeetCode;

public class Check_If_two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
        // String s2 = String.join(" ",word2);

    }
}
