package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public boolean eat(Bowl bowl) {
        if (bowl.decreaseFood(this.appetite)) {
        System.out.printf("Cat %s eat %d food\n", this.name, this.appetite);
        this.fullness = true;
        return true;
        }
        System.out.printf("Not enough food for cat %s, remain - %d, required - %d\n", this.name, bowl.getFoodAmount(), this.appetite);
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + fullness +                // откуда взялось isFull?
                '}';
    }
}
