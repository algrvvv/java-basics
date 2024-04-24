package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Player> team = new ArrayList<>();
        team.add(new Player(59, "John", 20));
        team.add(new Player(67, "Roger", 22));
        team.add(new Player(45, "Steven", 24));

        System.out.println("Before: " + team);
        Collections.sort(team); // по player.compareTo(); используя Collections.sort();
        Collections.sort(team, new PlayerAgeComparator()); // сортировка по возрасту, используя Collections.sort(); и компаратор
        team.sort(new PlayerRankingComparator()); // тоже сортировка по рангу, но используя компаратор и List.sort()
        team.sort((Player p1, Player p2) -> Integer.compare(p1.getAge(), p2.getAge())); // используя лямбда выражения
        team.sort(Comparator.comparingInt(Player::getAge)); // используя статический метод для компаратора
        System.out.println("After: " + team);
    }
}
