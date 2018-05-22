package academy.learnprogramming.javacode;

public class DummyClass {

    public String isVacationTime(Boolean onVacation) {
        return onVacation? "Im on vacation" : "Im working";
    }

    public void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
