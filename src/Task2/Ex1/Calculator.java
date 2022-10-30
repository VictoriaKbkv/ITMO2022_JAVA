package Task2.Ex1;

public class Calculator {

    public double Sum(double a, double b) {
        return (a+b);
    }

    public long Sum(long a, long b) {
        return (a+b);
    }

    public long Sum(int a, int b) {
        return ((long)a+b);
    }

    public double Subtract(double a, double b) {
        return (a-b);
    }

    public long Subtract(long a, long b) {
        return (a-b);
    }

    public long Subtract(int a, int b) {
        return ((a-b));
    }

    public double Multiply(double a, double b) {
        return (a*b);
    }

    public long Multiply(long a, long b) {
        return (a*b);
    }

    public long Multiply(int a, int b) {
        return (long)(a*b);
    }

    public double Divide(double a, double b) {
        return (a/b);
    }

    public double Divide(long a, long b) {
        return (a/(double)b);
    }

    public double Divide(int a, int b) {
        return (a/(double)b);
    }

}
