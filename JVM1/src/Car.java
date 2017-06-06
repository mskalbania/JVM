public class Car {

    private String brand;
    private String model;
    private String productionYear;
    private double course;
    private int maxSpeed;
    private int power;
    private int[][] position;

    public Car(String brand, String model, String productionYear, double course, int maxSpeed, int power){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.course = course;
        this.maxSpeed = maxSpeed;
        this.power = power;
        this.position = new int[30000][30000];
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
}
