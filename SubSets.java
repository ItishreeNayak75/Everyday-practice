public class SubSets {
    public static void generateSubsets(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }
        generateSubsets(str, curr, index + 1);
        generateSubsets(str, curr + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        generateSubsets("abc", "", 0);
    }
}
