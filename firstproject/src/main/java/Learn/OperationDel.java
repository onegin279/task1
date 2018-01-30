package Learn;

class OperationDel implements IOperation {
    @Override
    public String getSign() {
        return "/";
    }

    @Override
    public double getResult(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}