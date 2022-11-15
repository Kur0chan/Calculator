public class StringReader {
    public Operators getCalculatorDataFromExample(String example) {
        StringBuilder numberWithNumber = new StringBuilder();
        char operator = ' ';
        for (int i = 0; i < example.length(); i++) {
            if (Character.isDigit(example.charAt(i))) {
                numberWithNumber = numberWithNumber.append(example.charAt(i));
            } else if (example.charAt(i) == '+' || example.charAt(i) == '-' || example.charAt(i) == '*' ||
                    example.charAt(i) == '/' || example.charAt(i) == '^') {
                operator = example.charAt(i);
            }
        }
        int indexOperator = example.indexOf(operator);
        return new Operators(Integer.parseInt(numberWithNumber.substring(0, indexOperator)), operator,
                             Integer.parseInt(numberWithNumber.substring(indexOperator)));
    }

}
