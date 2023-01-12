package FuelEfficiency;
/**
 * ConveyanceIshP
 *
 * Defines Conveyance (All Vehicle Classes) Object 
 * 
 * @author Pierre Ishak
 * 
 * @version Jan 22, 2021
 */
public abstract class ConveyanceIshP 
{
  /**
   * Double to store the amount of Gas (in liters) the user wants
   */
  private double gasAmount;
  /**
   * Constuctor to define Conveyance (All Vehicle Classes)
   * 
   * @param gasAmount The amount of Gas (in liters) the user wants
   */
  public ConveyanceIshP(double gasAmountInput)
  {
    gasAmount = gasAmountInput;
  }
  /**
   * The abstract method that calcualtes distances of the vehicle
   * 
   * @param gasAmount The amount of Gas (in liters) the user wants
   */
  public abstract double calcDistance(double gasAmount);
}