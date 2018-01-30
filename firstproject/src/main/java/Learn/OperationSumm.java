package Learn;

class OperationSum implements IOperation {
    @Override
    public String getSign() {
        return "+";
    }

    @Override
    public double getResult(double a, double b) {
        return a + b;
    }

}
