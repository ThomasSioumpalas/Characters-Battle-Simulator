package characters;

import domain.Attack;

import java.util.List;

public class Elf extends Character {

    private String icon = "🧚‍♀️";


    public Elf(String name, double health, double defense, double speed, List<Attack> attacks) {
        super(name, health, defense, speed, attacks);
    }

    @Override
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
