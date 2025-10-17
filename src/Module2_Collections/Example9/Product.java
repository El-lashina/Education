package Module2_Collections.Example9;

import java.util.Collections;
import java.util.Objects;

public class Product
        implements Comparable <Product>
{
    private String name;
    private String country;
    private int sale;

    public Product(String name, String country, int sale) {
        this.name = name;
        this.country = country;
        this.sale = sale;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getSale() {
        return sale;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getName(), product.getName()) && getSale() == product.getSale() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSale());
    }

    @Override
    public String toString() {
        return name + ';' + sale;
    }

    @Override
    public int compareTo(Product o) {
        int result = getName().compareTo(o.getName());
        if (getName().equals(o.getName())) {
            if (getSale() > o.getSale()) result = 1;
            if (getSale() < o.getSale()) result = -1;
        }
        return result;
    }
}
