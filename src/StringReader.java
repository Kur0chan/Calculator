public class StringReader {
    public Operators getCalculatorDataFromExample(String example) {
        example = example.trim();
        StringBuilder numberWithNumber = new StringBuilder();
        char operator = ' ';
        for (int i = 0; i < example.length(); i++) {
            if (Character.isDigit(example.charAt(i)) || example.charAt(i) == '.' || i == 0) {
                numberWithNumber = numberWithNumber.append(example.charAt(i));
            } else if (i > 0 && Character.isDigit(example.charAt(i - 1)) && (example.charAt(i) == '+' ||
                    example.charAt(i) == '-' || example.charAt(i) == '*' || example.charAt(i) == '/' ||
                    example.charAt(i) == '^')) {
                operator = example.charAt(i);
                if (example.charAt(i + 1) == '+' || example.charAt(i + 1) == '-') {
                    numberWithNumber = numberWithNumber.append(example.charAt(i + 1));
                }
                if (example.charAt(i + 1) == '(') {
                    numberWithNumber = numberWithNumber.append(example.charAt(i + 2));
                }
            }
        }
        int indexOperator = example.indexOf(operator);
        return new Operators(Double.parseDouble(numberWithNumber.substring(0, indexOperator)), operator,
                Double.parseDouble(numberWithNumber.substring(indexOperator)));
    }
}