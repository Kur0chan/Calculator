public class Operators {
    private double numberOne;
    private char operator;
    private double numberTwo;

    public Operators(double numberOne, char operator, double numberTwo) {
        this.numberOne = numberOne;
        this.operator = operator;
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

}