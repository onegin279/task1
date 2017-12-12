package presents;

public abstract class presents {
    private String name;
    private double ves;
    private double price;
    private int id;

    public presents(){}

    public presents(String name, double ves, double price, int id) {
        this.name = name;
        this.ves = ves;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return ("name = " + name + ", ves = " + ves + ", price = " + price + ", id = " + id);
    }

}
