package Learn;

class OperationUmn implements IOperation {
    @Override
    public String getSign() {
        return "*";
    }

    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}