package FuelEfficiency;
/**
 * CarIshP
 *
 * Defines Car Object 
 * 
 * @author Pierre Ishak
 * 
 * @version Jan 22, 2021
 */
public class CarIshP extends ConveyanceIshP 
{
  /**
   * Constuctor to define Car
   * 
   * @param gasAmount The amount of Gas (in liters) the user wants
   */
  public CarIshP(double gasAmount) 
  {
    //Call the Conveyance constructor
    super(gasAmount);
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
    
    distance = (gasAmount/9.4)*100;
    
    return distance;
  }
}