package pl.mkluzniak;

public class Car {
    private String make; //creating private variables
    private String model;
    private int year;

    Car(String make, String model, int year) { //setting up contructor
        this.setMake(make);
        this.setMake(model);
        this.setYear(year);
    }
Car(Car x){
        this.copy(x);

}

    public String getMake() { //creating getter to have access to private class
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) { //creating setters to have access to change values in private class
        this.make = make;

    }

    public void setModel(String model) {
        this.model = model;

    }

    public void setYear(int year) {
        this.year = year;

    }

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
