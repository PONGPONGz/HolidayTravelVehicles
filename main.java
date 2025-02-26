package HolidayTravelVehicles;

class main
{
    public static void main(String args[])
    {
        Vehicle myVehicle = Vehicle.createNewVehicleRecord(
            "sss-111", 
            "susuki", 
            "mirage", 
            2005, 
            "susuki", 
            100000
        );

        System.out.println(
            String.format(
                "Vehicle: %s | Manufacturer: %s", 
                (myVehicle.name + " " + myVehicle.model), 
                myVehicle.manufacturer
            )
        );
        System.out.println(String.format("Year: %s - $%s", myVehicle.year, myVehicle.baseCost));
    }
}