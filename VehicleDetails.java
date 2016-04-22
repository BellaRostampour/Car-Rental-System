



public class VehicleDetails {
    String manufacturer , model ;
    int makeYear , totalServices ;
    int  counter = 0;
    Journey[] journeyList = new Journey[5];
    FuelPurchase[] fuelDetails = new FuelPurchase[5];
    
    
    
    VehicleDetails()
    {
        manufacturer = "Unnkown name";
        model = "Unknown model";
        makeYear = 0;
        totalServices = 0;
      
        
       
    }
    void setManufacturer (String brand){
        manufacturer = brand;
    }
    
    String getManufacturer (){
        return manufacturer;
    }
    
    void setModel(String mod){
        model = mod;
    }
    
    String getModel(){
        return model;
    }
    
    void setYear(int year){
        makeYear = year;
    }
    int getYear(){
        return makeYear;
    }
    
    void setServices(int service){
        totalServices = service;
    }
    int getServices(){
        return totalServices;
    }
    
    
    
    void addJourney(Journey journey)
    {
       journeyList[counter] = journey;
       counter++;
    }
    Journey getJourney(int index)
    {
        return journeyList[index];
    }
    
    
}
