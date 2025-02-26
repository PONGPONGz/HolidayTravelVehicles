package HolidayTravelVehicles;

class Vehicle 
{
    public final String vehicleSerialNumber;
    public final String name;
    public final String model;
    public final int year;
    public final String manufacturer;
    public final double baseCost;

    public Vehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost)
    {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public static Vehicle createNewVehicleRecord(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost)
    {
        return new Vehicle(vehicleSerialNumber, name, model, year, manufacturer, baseCost);
    }
}