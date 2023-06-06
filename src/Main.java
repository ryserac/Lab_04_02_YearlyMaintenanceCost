public class Main {
    public static void main(String[] args) {
        double winterCost = 400;
        double springCost = 250;
        double summerCost = 300;
        double fallCost = 200;
        double totalCost;
        totalCost = winterCost + springCost + summerCost + fallCost;
        System.out.println("The winter maintenance cost is $" + winterCost +
                "; the spring maintenance cost is $" + springCost +
                "; the summer maintenance cost is $" + summerCost +
                "; the fall maintenance cost is $" + fallCost +
                "; the total yearly cost is $" + totalCost);
    }
}