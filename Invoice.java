package HolidayTravelVehicles;

import java.util.Date;

class Invoice
{
    public final int invoiceNumber;
    public final Date date;
    public final int tradeInAllowance;
    public final int taxes;
    public final int licenseFees;
    public final String customerSignature;

    public Invoice(int invoiceNumber, Date date, int tradeInAllowance, int taxes, int licenseFees, String customerSig)
    {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customerSignature = customerSig;
    }

    public void RequestDealerInstallOptions()
    {

    }

    public void SumFinalNegotiatedPrice()
    {

    }
}