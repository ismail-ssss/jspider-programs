 class Person implements Cloneable{
    String name;
    int age;
    Address address;
     Person(String name,int age,Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString(){
        return "person[name = "+name+", age = "+age+", address = "+address+"]";
    }
    @Override
    public Object clone() throws  CloneNotSupportedException{
        // return super.clone();
        Person p = (Person)super.clone();
        p.address = (Address) address.clone();
        return p;
    }
}