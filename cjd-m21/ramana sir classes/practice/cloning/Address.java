 class Address implements Cloneable{
    String country, city;
     Address(String country,String city){
        this.country = country;
        this.city = city;
    }
    @Override
    public String toString(){
        return "Address[country = "+country+",city = "+city+"]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}