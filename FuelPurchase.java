
class FuelPurchase {
    
    double fuelEco , fuelCost, fuelConsume;
    
    FuelPurchase()
        {
            fuelCost = 0;
            fuelConsume = 0;
            fuelEco = 0;
                
        }
    void setFuelCost(double fCost)
    {
        fuelCost = fCost;
    }
    double getFuelCost()
    {
        return fuelCost;
    }
    
    void setFuelConsume(double fConsum)
    {
        fuelConsume = fConsum;
    }
    double getFuelConsume()
    {
        return fuelConsume;
    }
    
    void setFuelEco(double fEco)
    {
        fuelEco = fEco;
    }
    double getFuelEco()
    {
        return fuelEco;
    }
}
