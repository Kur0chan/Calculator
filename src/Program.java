public class Program {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        String example = consoleReader.getExample();
        StringReader stringReader = new StringReader();
        Operators operators = stringReader.getCalculatorDataFromExample(example);
        Calculator calculator = new Calculator();
        int result = calculator.getResultByOperators(operators);
        System.out.println(result);
    }
}
