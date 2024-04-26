public class LoopsAndVersionControl1 {
    public static void main(String[] args) {
        // Task number 1
        int[] numbers = {69, 100, 88, 24, 2024};
        int minValue = numbers[0]; //69
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Smallest Value of this array is: " + minValue);

        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Highest Value of this array is: " + maxValue);

        System.out.println("=============");
            /* int difference = maxValue-minValue;
            System.out.println("The difference between the minimum and maximum values: " +difference);*/

        System.out.println("\nThe difference between the minimum and maximum values: " + (maxValue - minValue));
        System.out.println("=============");


        //Task number 2
        int secondminValue = numbers[0];//69
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                secondminValue = minValue;
                minValue = numbers[i];
                if(numbers[i]<secondminValue && numbers[i] != minValue){
                    secondminValue = numbers[i];
                }
            }
        }
        System.out.println(("\nThe lowest value is "+minValue)+(" and the second lowest value in this array is "+secondminValue));
        System.out.println("\n=============");

        //Task number 3
        // solve x²+(4y/5-x)²
        double x = 6;
        double y = 9;
        double step1 = x*x;
        double step2 = 4*y;
        double step3 = step2/5;
        double step4 = step3-x;
        double step5 = step4*step4;
        double resolution = step1+step5;
        System.out.println("\nThe resolution of the mathematical expression is: "+resolution);


    }


}

