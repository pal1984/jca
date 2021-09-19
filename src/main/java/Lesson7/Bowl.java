package Lesson7;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void addFoodInBowl(int amount) {
        this.foodAmount += amount;
        System.out.printf("Bowl increased by %d food, now remain: %d\n", amount, this.foodAmount);
    }

    public boolean decreaseFood(int amount) {
        if (this.foodAmount < amount) {
            System.out.printf("Not enough food in bowl, required - %d, remain - %d\n", amount, this.foodAmount);
        return false;
        }
        this.foodAmount -= amount;
        System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
        return true;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
