
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if ( this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        int priceOfThisApartment = this.pricePerSquareMeter * this.squareMeters;
        int priceOfOtherApartment = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        
        if ( priceOfThisApartment >= priceOfOtherApartment){
            return priceOfThisApartment - priceOfOtherApartment;
        }
        
        else {
            return priceOfOtherApartment - priceOfThisApartment;
        }
    }
    
    public boolean moreExpensiveThan( Apartment otherApartment){
        int priceOfThisApartment = this.pricePerSquareMeter * this.squareMeters;
        int priceOfOtherApartment = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        
        if ( priceOfThisApartment > priceOfOtherApartment){
            return true;
        }
        
        else {
            return false;
        }
    }
}
