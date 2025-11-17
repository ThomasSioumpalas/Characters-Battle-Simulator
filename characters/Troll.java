package characters;

import domain.Attack;

import java.util.List;

public class Troll extends Character {


    private String icon = "🧟";

    @Override
    public String getIcon() {
        return icon;
    }

    public Troll(String name, double health, double defense, double speed, List<Attack> attacks) {
        super(name, health, defense, speed, attacks);
    }
}
