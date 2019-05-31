package marathon.track;

import marathon.competitors.Competitor;
import marathon.competitors.Team;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Competitor[] competitors = team.getCompetitors();
        if (competitors.length == 0) {
            System.out.println("В команде нет никого");
            return;
        }
        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}




