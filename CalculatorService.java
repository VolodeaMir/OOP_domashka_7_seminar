public class CalculatorService {
    private Calculator calculator;
    private Logger logger;

    public CalculatorService(Calculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public ComplexNumber performAddition(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        logger.log("Addition result: " + result.toString());
        return result;
    }

    public ComplexNumber performMultiplication(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.log("Multiplication result: " + result.toString());
        return result;
    }

    public ComplexNumber performDivision(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.log("Division result: " + result.toString());
        return result;
    }
}