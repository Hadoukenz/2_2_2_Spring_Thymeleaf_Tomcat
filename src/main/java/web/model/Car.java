package web.model;

public class Car {

    private String manufacturer;
    private String carModel;
    private int dateOfProduction;

    public Car(String manufacturer, String carModel, int dateOfProduction) {
        this.manufacturer = manufacturer;
        this.carModel = carModel;
        this.dateOfProduction = dateOfProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
                "model: " + carModel +
                "Date of production: " + dateOfProduction;
    }
}
