package Lab1;

/**
 * @author Kosei Takahashi
 */

public class Model1 {

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * @param /firstName name
     *         lastName last name
     *         height inches
     *         weight pounds
     */
    public Model1() {
        this("Stark", "Tony", 69, 250.0, true, false);
    }

    public Model1(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        if (firstName.length() < 3 || firstName.length() > 20) {
            System.out.println("First name must be 3 - 20 characters");
        } else {
            setFirstName(firstName);
        }

        if (lastName.length() < 3 || lastName.length() > 20) {
            System.out.println("Last name must be 3 - 20 characters");
        } else {
            setLastName(lastName);
        }

        if (height < 24 || height > 84) {
            System.out.println("Height must be 24 - 84 inches");
        } else {
            setHeight(height);
        }

        if (weight < 80 || weight > 280) {
            System.out.println("Weight must be 80 - 280 pounds");
        } else {
            setWeight(weight);
        }

        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    public Model1(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        this.smokes = false;
    }

    public String getHeightInFeetAndInches(){
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;

        return feet + " feet " + inches + " inches";
    }

    public long getWeightKg(){
        double kg = (long)weight / POUNDS_PER_KG;
        return Math.round(kg);
    }

    public void setWeight(long kilograms) {
        this.weight = kilograms * POUNDS_PER_KG;
    }

    public void setWeight(double pounds) {
        this.weight = pounds;
    }

    public void setHeight(int feet, int inches){
        this.height = (feet / INCHES_PER_FOOT) + inches;
    }

    public void setHeight(int inches){
        this.height = inches;
    }



    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");

        if(canTravel = true) {
            System.out.println("Does travel ");
        } else{
            System.out.println("Does not travel ");
        }
        if(smokes = true) {
            System.out.println("Does smoke ");
        } else{
            System.out.println("Does not smoke ");
        }
    }

    int houly = BASE_RATE_DOLLARS_PER_HOUR;
    public void displayModelDetails(){
        if(height >= TALL_INCHES && weight < THIN_POUNDS){
            houly = BASE_RATE_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }else if (canTravel = true){
            houly = BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }else if (smokes = true){
            houly = BASE_RATE_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");

        if(canTravel = true) {
            System.out.println("yep");
        } else{
            System.out.println("nope");
        }
        if(smokes = true) {
            System.out.println("yep");
        } else{
            System.out.println("nope");
        }
        System.out.println("Houly rate: $" + houly);
    }

    /**
     *
     * @return first name
     */
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return last name
     */
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return height(inches)
     */
    public int getHeight(){
        return height;
    }

    /**
     *
     * @return weight(pounds)
     */
    public double getWeight(){
        return weight;
    }

    public boolean getCanTravel(){
        return canTravel;
    }
    public void setCanTravel(boolean canTravel){
        this.canTravel = canTravel;
    }

    public boolean getSmokes(){
        return smokes;
    }
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

}