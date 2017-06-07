import java.util.*;
/*
        SWITCHES:
        1.QUITE EFFICIENT RANDOM ALGORITHM
        2.NOT EFFICIENT ITERATIVE ALGORITHM
        3.MOST EFFICIENT BINARY SEARCH ALGORITHM
 */
@SuppressWarnings("Duplicates")
public class Game {

    public void run(int algorithm) {
        switch (algorithm) {
            case 1:
                randomAlgorithm();
                break;
            case 2:
                iterationAlgorithm();
                break;
            case 3:
                binarySearchAlgorithm();
                break;
            default:
                throw new RuntimeException("Wrong switch");
        }
    }
    //not totally random, each time "random" number range is modified
    private void randomAlgorithm() {
        Scanner sc = new Scanner(System.in);
        int firstLimit = 0;
        int secondLimit = 100;
        boolean exit = false;
        String answer;
        do {
            int currentGeneratedNumber = generateRandomNumberInRange(firstLimit, secondLimit);
            do {
                System.out.print("C : " + currentGeneratedNumber + "\nH : ");
                answer = sc.next();
                if (answer.toUpperCase().equals("MORE")) {
                    firstLimit = currentGeneratedNumber + 1;
                    break;
                } else if (answer.toUpperCase().equals("LESS")) {
                    secondLimit = currentGeneratedNumber - 1;
                    break;
                } else if (answer.toUpperCase().equals("WIN")) {
                    exit = true;
                    break;
                } else {
                    System.out.println("< wrong input >");
                }
            } while (true);
        } while (!exit);
    }

    private void iterationAlgorithm() {
        System.out.println("Why would you even want to use this...");
    }

    //simplest and fastest one
    private void binarySearchAlgorithm(){
        Scanner sc = new Scanner(System.in);
        int lowerLimit = 0;
        int upperLimit = 100;
        int currentPointer = 50;
        boolean exit = false;
        String answer;
        do {
            do {
                System.out.print("C : " + currentPointer + "\nH : ");
                answer = sc.next();
                if (answer.toUpperCase().equals("MORE")) {
                    lowerLimit = currentPointer + 1;
                    currentPointer = (lowerLimit + upperLimit) / 2;
                    break;
                } else if (answer.toUpperCase().equals("LESS")) {
                    upperLimit = currentPointer - 1;
                    currentPointer = (lowerLimit + upperLimit) / 2;
                    break;
                } else if (answer.toUpperCase().equals("WIN")) {
                    exit = true;
                    break;
                } else {
                    System.out.println("< wrong input >");
                }
            } while (true);
        } while (!exit);
    }

    //cancer algorithm
    private void binarySearchCancerAlgorithm() {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new LinkedList<>();
        int currentPointer = 50;
        boolean exit = false;
        String answer;
        //filler
        for (int i = 0; i <= 100; i++) {
            integerList.add(i);
        }
        do {
            do {
                System.out.print("C : " + currentPointer + "\nH : ");
                answer = sc.next();
                if (answer.toUpperCase().equals("MORE")) {
                    List<Integer> toRemove = new LinkedList<>();
                    for(Integer integer: integerList){
                        if(integer < currentPointer){
                            toRemove.add(integer);
                        }
                    }
                    integerList.removeAll(toRemove);
                    currentPointer = integerList.get(integerList.size() / 2);
                    break;
                } else if (answer.toUpperCase().equals("LESS")) {
                    List<Integer> toRemove = new LinkedList<>();
                    for(Integer integer: integerList){
                        if(integer > currentPointer){
                            toRemove.add(integer);
                        }
                    }
                    integerList.removeAll(toRemove);
                    currentPointer = integerList.get(integerList.size() / 2);
                    break;
                } else if (answer.toUpperCase().equals("WIN")) {
                    exit = true;
                    break;
                } else {
                    System.out.println("< wrong input >");
                }
            } while (true);
        } while (!exit);
    }

    private int generateRandomNumberInRange(int i, int j) {
        return new Random().nextInt((j + 1) - i) + i;
    }
}
