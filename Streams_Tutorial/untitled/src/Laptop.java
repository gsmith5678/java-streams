import java.util.Comparator;

public class Laptop implements Comparable<Laptop> {

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop lap2) {
        int comp = this.brand.compareTo(lap2.brand);
        int ram = this.ram > lap2.ram ? 1
                : this.ram == lap2.ram ? 0 : -1;

        int output = comp != 0 ? comp
                : ram !=0 ? ram
                : this.price > lap2.price ? 1 : -1;
        return output;
    }
}
