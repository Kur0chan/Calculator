public class Program {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        String example = consoleReader.getExample();
        StringReader ex = new StringReader();
        Operators operators = ex.getCalculatorDataFromExample(example);
        Calculator calculator = new Calculator();
        int result = calculator.getResultByOperators(operators);
        System.out.println(result);
    }
}
