package FuelEfficiency;
/**
 * MotorcycleIshP
 *
 * Defines Motorcycle Object 
 * 
 * @author Pierre Ishak
 * 
 * @version Jan 22, 2021
 */
public class MotorcycleIshP extends ConveyanceIshP 
{
  /**
   * Constuctor to define Motorcycle
   * 
   * @param gasAmount The amount of Gas (in liters) the user wants
   */
  public MotorcycleIshP(double gasAmount) 
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
    
    distance = (gasAmount/6.3)*100;
    
    return distance;
  }
}