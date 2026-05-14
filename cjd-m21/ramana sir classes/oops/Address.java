
public class Address implements Cloneable {

    String city, country;

    public Address(String country, String city) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString(){
        return country+" "+city;
    }

    
    public Object Clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
