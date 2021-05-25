package jvmtest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting...");
        int iterations = 10000, iteration = 0;

        while (true) {
            iteration++;
            Double[] array = new Double[iterations];
            String[] sarray = new String[iterations];
            for (int i = 0; i < iterations; i++) {
                array[i] = Math.random();
                sarray[i] = array[i].toString();
            }
            System.out.println("Sleeping, iteration: " + iteration);
            Thread.sleep(5000);

        }
    }
}
