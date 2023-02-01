public class Car {
    private int miles;
    private String model;
    public Car(String model, int miles){
        this.model=model;
        this.miles=miles;
    }

    public String toString(){
        return model+" "+miles+"mi";
    }
}
