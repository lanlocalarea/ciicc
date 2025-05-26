package Activities;

public class Task8 {

    int SumOfAllParams(int... numbers) {
       int sumOfParams = 0;
       int lengthOfParams = numbers.length;
       int cumulativeSum = 0;
       
        for (int number : numbers)
        sumOfParams += number;

        for (int params = 0; params < lengthOfParams; params++){
            cumulativeSum = 0;
            for (int number = numbers[params]; number > 0; number--){
                cumulativeSum += number;
            }

            System.out.println("Cumulative sum of " + numbers[params] + " is " + cumulativeSum);

        }

        return sumOfParams;

    }
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println("Total of all Parameters: " + task8.SumOfAllParams(4,5,10)); // Put here positive int parameters
    }
}
