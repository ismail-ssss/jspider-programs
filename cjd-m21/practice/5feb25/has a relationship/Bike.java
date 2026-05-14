class Bike{
    private Engine e;
    Bike(){
        this.e = new Engine();
    }
    void start(){
        System.out.println("bike started");
        e.work();
    }
    void stop(){
        System.out.println("bike stopped");
    }
}