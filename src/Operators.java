public class Operators {

    private int numberOne;
    private char operator;
    private int numberTwo;

    public Operators(int numberOne, char operator, int numberTwo) {
        this.numberOne = numberOne;
        this.operator = operator;
        this.numberTwo = numberTwo;
    }


    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
}