package lesson_01;

public class Call_Tariff {
	private String country;
    private double price;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tarrriff{" +
                "country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
    public double getSum(int time){
        return price*time;
    }
}
