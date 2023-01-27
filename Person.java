import java.text.DecimalFormat;

public class Person 
{
    // Instance variables
    private String firstName;
    private String lastName;
    private double heightInches;
    private double weightPounds;

    // Constructor
    public Person (String firstName, String lastName,
                    double heightInches, double weightPounds) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    // Setters and Getters
    public String getFirstName() { return this.firstName = firstName; }
    public void setFirtsName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return this.lastName = lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public double getHeightInches() { return heightInches = heightInches; }
    public void setHeightInches(double heightInches) { this.heightInches = heightInches; }
    public double getWeightPounds() { return this.weightPounds = weightPounds; }
    public void setWeightPounds(double weightPounds) { this.weightPounds = weightPounds; }

    /**
     * 
     * @return - the BMI of a person by using the height and weight
     */
    public double calculateBMI()
    {
        double BMI = ((weightPounds / ((heightInches) * (heightInches))) * 703);
        return BMI;
    }

}
