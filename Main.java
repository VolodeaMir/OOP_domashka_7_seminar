public class Main {
    public static void main(String[] args) {
        Calculator calculator = new AddCalculator();
        Logger logger = new ConsoleLogger();
        CalculatorService calculatorService = new CalculatorService(calculator, logger);

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        calculatorService.performAddition(num1, num2);
        calculatorService.performMultiplication(num1, num2);
        calculatorService.performDivision(num1, num2);
    }
}
