/**
 * @author -  Melvin Santos
 * Title:     BMI Calculator
 * @version - 1.0
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BMIHealth 
{
    public static void main(String[] args) 
    {
        Person thePerson;

        // Call and store in a Person variable the method createPersonObject()
        thePerson = createPersonObject();

        // Call the showBMI() method
        showBMI(thePerson);
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
        "Welcome to the BMI Calculator Program!");

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

    /**
     * @param anyPerson - call the domain class
     */
    public static void showBMI(Person anyPerson)
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Print the Person object received as a parameter
        JOptionPane.showMessageDialog(null, anyPerson.toSTring());

        // Calling and storing the return value of the method that calculates the person’s BMI
        JOptionPane.showMessageDialog(null, "Your BMI is " + df.format(anyPerson.calculateBMI()));
        /**
         * Calling and storing the return value of the method that determines the person’s 
         * health, then print that value.
         */
        JOptionPane.showMessageDialog(null, "You are " + anyPerson.determineHealth(anyPerson.calculateBMI()));
        /**
         * If the person's BMI is not considered "healthy" then call and store the
        // return value of the method that calculates the person's recommended
         */
        if (anyPerson.determineHealth(anyPerson.calculateBMI()) != "Healthy")
        {
            JOptionPane.showMessageDialog(null, "Your recommended weight is " +
            "Your recommended weight is " + df.format(anyPerson.recommendedWeight()));
        }

        JOptionPane.showMessageDialog(null, "Thanks for using the BMI calculator!");
    }
}
