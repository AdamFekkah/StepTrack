public class Main {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);

        System.out.println("Active Days: " + tr.activeDays());         // 0
        System.out.println("Average Steps: " + tr.averageSteps());     // 0.0

        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println("Average Steps: " + tr.averageSteps());     // 7000.0
        System.out.println("Active Days: " + tr.activeDays());         // 0

        tr.addDailySteps(13000);
        System.out.println("Average Steps: " + tr.averageSteps());     // 9000.0
        System.out.println("Active Days: " + tr.activeDays());         // 1

        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println("Average Steps: " + tr.averageSteps());     // 10222.2
        System.out.println("Active Days: " + tr.activeDays());         // 2
    }
}
