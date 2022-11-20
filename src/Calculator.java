public class Calculator {
    public double getResultByOperators(Operators operators) {
        double numberOne = operators.getNumberOne();
        double numberTwo = operators.getNumberTwo();
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
                return (double) Math.pow(numberOne, numberTwo);
            default:
                return 0;
        }
    }
}