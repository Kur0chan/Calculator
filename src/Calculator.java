public class Calculator {
    public int getResultByOperators(Operators operators) {
        int numberOne = operators.getNumberOne();
        int numberTwo = operators.getNumberTwo();
        char operator = operators.getOperator();
        switch (operator) {
            case ('+'):
                return numberOne + numberTwo;
            case ('-'):
                return numberOne - numberTwo;
            case ('*'):
                return numberOne * numberTwo;
            case ('/'):
                if (numberTwo == 0) {
                    return -1;
                }
                return numberOne / numberTwo;
            case ('^'):
                return (int) Math.pow(numberOne, numberTwo);
            default:
                return 0;
        }
    }
}