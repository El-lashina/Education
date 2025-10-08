package Example3009253;

public class Purchase {
    private String name;
    private int sale;
    private double numb;

    public Purchase(String name, int sale, double numb) {
        this.name = name;
        this.sale = sale;
        this.numb = numb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public double total () {
        return sale*numb;
    }

    @Override
    public String toString() {
        return getName()+ "#" + getSale()+ "#" + getNumb();
    }
}
