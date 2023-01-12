package FuelEfficiency;
import java.util.Scanner;
/**
 * FuelEfficiencyIshP
 *
 * Program calculates and display how far (in Km) diffrent types of veichles can travel based on how may liter of fuel the user enters.
 * 
 * @author Pierre Ishak
 * 
 * @version Jan 12, 2021
 */
public class FuelEfficiencyIshP 
{
  public static void main(String[] args) 
  { 
    double gasAmount;
    String distances;
    
    printProgramDescription();
    gasAmount = getGasLiterAmount();
    distances = calculateDistances(gasAmount);
    printOutResults(gasAmount,distances);
  }
  /**
   * Prints out program description to the user
   */
  public static void printProgramDescription()
  {
    //Prints Program Description
    System.out.println("|---------------------------------|\n Various Vehicle Fuel Efficiencies \n|---------------------------------|\n\nHello!\nThis program will calculate and display how far (in Km) diffrent types of veichles can travel based on how may liter of fuel you enter!");
  }
  /**
   * Gets the amount of gas (in liters) the user wants each vehicle to have (to determine how far each one can go)
   * 
   * @return Double of the amount of Gas (in liters) the user wants
   */
  public static double getGasLiterAmount()
  {
    Scanner input = new Scanner(System.in);
    String numStr = "", errMsg;
    double num = 0;
    boolean notValidInput = true; 
    
    do
    {
      System.out.println("\nHow many liters of gas do you have in your vehicle?");
      numStr = input.nextLine();
      
      errMsg = "Sorry, \" " + numStr + " \" is not a number equal above 0\n";
      
      try
      {
        num = Double.parseDouble(numStr); // Convert the number from a String to an double
        
        if (num < 0)
        {
          num = Double.parseDouble("Error");
        }
        
        notValidInput = false;
      }                              
      catch (NumberFormatException error)  
      {
        System.out.println(errMsg);
      }
      
    }while(notValidInput);  // As long as input is a negative, repeat
    
    return num;
  }
  /**
   * Calculates Distances by calling each vehicle object
   * 
   * @param gasAmount The amount of Gas (in liters) the user enters
   * 
   * @return String of all the vehicles and there corresponding distances 
   */
  public static String calculateDistances(double gasAmount)
  {
    String output = "";
    double carDistance,hybridCarDistance,truckDistance,motorcycleDistance;
    
    CarIshP car = new CarIshP(gasAmount) ; 
    TruckIshP truck = new TruckIshP(gasAmount); 
    HybridCarIshP hybridCar = new HybridCarIshP(gasAmount);
    MotorcycleIshP motorcycle= new MotorcycleIshP(gasAmount);
    
    carDistance = car.calcDistance(gasAmount);
    truckDistance = truck.calcDistance(gasAmount);
    hybridCarDistance = hybridCar.calcDistance(gasAmount);
    motorcycleDistance = motorcycle.calcDistance(gasAmount);
    
    output += ("\nCar = " + String.format("%.2f",carDistance) + " KM");
    output += ("\nTruck = " + String.format("%.2f",truckDistance) + " KM");
    output += ("\nHybrid Car = " + String.format("%.2f",hybridCarDistance) + " KM");
    output += ("\nMotorcycle = " + String.format("%.2f",motorcycleDistance) + " KM");
    
    return output;
  }
  /**
   * Prints out the results of the distance calculations of all vehicles
   * 
   * @param gasAmount The amount of Gas (in liters) the user enters
   * @param distances String of all the vehicles and there corresponding distances
   */
  public static void printOutResults(double gasAmount,String distances)
  {
    System.out.println("\nOn " + String.format("%.2f",gasAmount )+ "L of gas the veichles can drive:\n" + distances);
  }
}