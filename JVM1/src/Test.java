import java.util.Random;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        String[] strings = new String[10000];

        int amountOfCars = 10000000;
        while ((amountOfCars--)!= 0){
            Thread.sleep(new Random().nextInt(200));
            new Car("A","B","C",200.0,200,500);
        }
    }
}
