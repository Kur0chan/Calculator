import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Example: ");
        String example = sc.nextLine();
        sc.close();
        System.out.println(Program.solution(example));
    }

    public static int solution(String example) {
        Operators abc = searchExample(example);
        char operator = abc.getOperator().charAt(0);
        int indexOperator = example.indexOf(operator);
        int numberOne = Integer.parseInt(abc.getNumberWithNumber().substring(0,indexOperator));
        int numberTwo = Integer.parseInt(abc.getNumberWithNumber().substring(indexOperator));
        switch (operator) {
            case ('+'):
                return  numberOne + numberTwo;
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

    public static Operators searchExample(String example) {
        StringBuilder numberWithNumber = new StringBuilder();
        StringBuilder operator = new StringBuilder();
        for (int i = 0; i < example.length(); i++) {
            if (Character.isDigit(example.charAt(i))) {
                numberWithNumber.append(example.charAt(i));
            } else  {
                operator.append(example.charAt(i));
            }
        }
        return new Operators(numberWithNumber.toString(), operator.toString());
    }
}
