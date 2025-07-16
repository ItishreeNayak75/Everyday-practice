 class AlphanumericSum {
	static int sumOfNumbers(String input) {
        int sum = 0;
        String temp = "0";  

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        sum += Integer.parseInt(temp);

        return sum;
    }

    public static void main(String[] args) {
        String str = "ab12cd34ef56";
        int result = sumOfNumbers(str);
        System.out.println("Sum of numbers in string: " + result);
    }
}
