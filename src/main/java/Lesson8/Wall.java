package Lesson8;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public boolean overcoming(Participant participant) {
        if (participant.jump(this.height)) {
            System.out.printf("%s overcame %d meters of wall\n", participant.getClass(), height);
            return true;
        }
        System.out.printf("%s don`t overcame %d meters of wall\n", participant.getClass(), height);
        return false;
    }
}
