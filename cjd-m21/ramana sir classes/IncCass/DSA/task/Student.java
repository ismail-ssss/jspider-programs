class Student implements  Comparable<Student>{
    String name;
    int age;
    int marks;
    public Student(String name,int age,int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "[ name "+name+", age "+age+", marks "+marks+"]";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name); // string
        // return this.age - (o.age); // int
        // return this.age - ((Emp)o.age); 
        // without generic and the argument type should be Emp        
    }
}