package FuelEfficiency;
/**
 * TruckIshP
 *
 * Defines Truck Object 
 * 
 * @author Pierre Ishak
 * 
 * @version Jan 22, 2021
 */
public class TruckIshP extends ConveyanceIshP 
{
  /**
   * Constuctor to define Truck
   * 
   * @param gasAmount The amount of Gas (in liters) the user wants
   */
  public TruckIshP(double gasAmount) 
  {
    //Call the Conveyance constructor
    super(gasAmount);
    calcDistance(gasAmount);
  }
  /**
   * Calculate Distance vehicle will travel using user's gas amount
   * 
   * @param gasAmount The amount of Gas (in liters) the user wants 
   * 
   * @return Distance the vehicle can travel with the user's amount of gas
   */
  public double calcDistance(double gasAmount)
  {
    double distance;
    
    distance = (gasAmount/14.1)*100;
    
    return distance;
  }
}