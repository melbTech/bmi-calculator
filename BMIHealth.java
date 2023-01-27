/**
 * @author -  Melvin Santos
 * Title:     BMI Calculator
 * @version - 1.0
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BMIHealth 
{
    public static void main(String[] args) 
    {
        Person thePerson;

        // Call and store in a Person variable the method createPersonObject()
        thePerson = createPersonObject();
    }

    /**
     * 
     * @return - the aPerson to get the person's info
     */
    public static Person createPersonObject()
    {
        Scanner input = new Scanner(System.in);

        // Define local varibles
        Person aPerson;
        String firstName, lastName;
        String strHeight, strWeight;
        double height, weight;

        // Ask user for their first & last name, height in inches and weight in pounds
        JOptionPane.showMessageDialog(null, 
        "We;come to the BMI Calculator Program!");

        firstName = JOptionPane.showInputDialog("Enter your first name: ");
        lastName = JOptionPane.showInputDialog("Enter your last name: ");
        strHeight = JOptionPane.showInputDialog("Enter your height (in inches): ");
        height = Double.parseDouble(strHeight);
        strWeight = JOptionPane.showInputDialog("Enter your weight (in pounds): ");
        weight = Double.parseDouble(strWeight);

        // Create a Person object using all the user values and return the person
        aPerson = new Person(firstName, lastName, height, weight);

        return aPerson;
    }
}
