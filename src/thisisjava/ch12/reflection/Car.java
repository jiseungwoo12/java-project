package thisisjava.ch12.reflection;

public class Car {

    public Car(String model) {
        this.model = model;
    }



    private String model;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String owner;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
