package Lesson8;

public class Competition {

    public static void main(String[] args) {

        Participant[] participants = {
                new Cat(1000, 1),
                new Human(2000, 2),
                new Robot(3000, 3),
        };

        Obstacle[] obstacles = {
                new RunningTrack(1000),
                new Wall(2),
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcoming(participant)) break;
            }

        }
    }


}
