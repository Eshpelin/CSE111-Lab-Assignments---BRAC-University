/*The current in an alternating current circuit that contains resistance, capacitance, and inductance in series is given by:
 * 
 * 
 Where I=current (amperes), E=voltage (volts), 
 R= resistance (ohms), L= inductance (henrys), 
 C= capacitance (farads) and 
 f=frequency (hertz). 
 
 Write a Java program that reads values for the voltage, resistance, inductance, capacitance and frequency, and then calculates and displays current.
 */

import java.util.*;

public class Lab3Point0Task05{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println ("Please input Voltage E");
    int voltageE = sc.nextInt();
    
    System.out.println ("Please input Resistance (ohms)");
    int resistanceOhms = sc.nextInt();
    
    System.out.println ("Please input Inductance L");
    int inductanceL = sc.nextInt();
    
    System.out.println ("Please input Capacitance C");
    int capacitanceC = sc.nextInt();
    
    System.out.println ("Please input Frequency F");
    int frequencyF = sc.nextInt();
    
    double CurrentI = (voltageE/(Math.sqrt(Math.pow(resistanceOhms, 2)+ ((2*Math.PI*frequencyF*inductanceL)- (1/(2*Math.PI*frequencyF*capacitanceC))))));
                                System.out.println (CurrentI);
                              }
}
     
                      
  