public class DivideCalculator implements Calculator {

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realPartSum = a.getReal() + b.getReal();
        double imaginaryPartSum = a.getImaginary() + b.getImaginary();

        return new ComplexNumber(realPartSum, imaginaryPartSum);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();

        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double c = b.getReal();
        double d = b.getImaginary();

        double denominator = c * c + d * d;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        double realPart = (a.getReal() * c + a.getImaginary() * d) / denominator;
        double imaginaryPart = (a.getImaginary() * c - a.getReal() * d) / denominator;

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
