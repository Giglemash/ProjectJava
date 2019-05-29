package marathon;

import marathon.competitors.Cat;
import marathon.competitors.Dog;
import marathon.competitors.Human;
import marathon.competitors.Team;
import marathon.track.Course;
import marathon.track.Cross;
import marathon.track.Wall;
import marathon.track.Water;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(40), new Wall(5), new Cross(60), new Water(100), new Cross(100)); // Создаем полосу препятствий
        Team team = new Team("Аква", new Human("Антошка"), new Cat("Картошка"), new Dog("Тимошка"), new Human("Рева")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
