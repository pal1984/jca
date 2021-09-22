package Lesson8;

public class RunningTrack implements Obstacle{
    private int length;

    public RunningTrack(int length){
        this.length = length;
    }

    @Override
    public boolean overcoming(Participant participant) {
        if (participant.run(this.length)) {
            System.out.printf("%s overcame %d meters of running track\n", participant.getClass(), length);
            return true;
        }
        System.out.printf("%s don`t overcame %d meters of running track\n", participant.getClass(), length);
        return false;
    }
}
