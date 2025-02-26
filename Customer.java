package HolidayTravelVehicles;

class Customer extends Person
{
    public final int customerId;
    public final int membershipLevel;

    public Customer(String name, String address, String phoneNumber, int customerId, int membershipLevel) {
        super(name, address, phoneNumber);

        this.customerId = customerId;
        this.membershipLevel = membershipLevel;
    }

    public Invoice GetInvoice()
    {
        return new Invoice(1, null, 100, 10, 100, "AA");
    }

    public void NegotiateVehicle()
    {
        
    }

    public void RequestTradeIn()
    {
        
    }
}