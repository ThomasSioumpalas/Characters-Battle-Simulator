import characters.*;
import characters.Character;
import domain.Attack;

import java.util.*;
import java.math.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("⭐ -Game starts- ⭐");
        System.out.println("Create your character.");

        System.out.println("Pick a character: \n1)Mage \n2)Troll \n3)Warrior \n4)Elf ");
        int userInput = scanner.nextInt();
        System.out.println("Give a name for your character");
        String name = scanner.next();
        Character user = createCharacter(userInput, name);
        Random random = new Random();
        int npcInput = random.nextInt(4);
        Character npc = createCharacter(npcInput, "NPC");

        System.out.println("Fight starts.!!!!");
       while(true) {
           System.out.println(user.getName() + " pick an attack ");
           System.out.println("1) " + user.getAttacks().get(0).getName());
           System.out.println("2) " + user.getAttacks().get(1).getName());
           int attackId = scanner.nextInt();


           Attack attackUser = user.getAttacks().get(attackId-1);
           System.out.println(user.getName() + " " + user.getIcon() + " attacks with " + attackUser.getName());
           System.out.println("↠↠↠↠↠↠↠↠↠↠↠↠↠↠↠↠↠");
           npc.damageTaken(attackUser.getAttack());
           System.out.println(npc.getName()+ " health is "+ npc.getHealth());
           if (npc.getHealth() <= 0) {
               System.out.println("💯Congratulation You won💯");
               break;
           }

           int npcAttackId = random.nextInt(2);
           Attack attackNpc = npc.getAttacks().get(npcAttackId);
           System.out.println(npc.getName() + " " + npc.getIcon() + " attacks with " + attackUser.getName());
           user.damageTaken(attackNpc.getAttack());
           System.out.println(user.getName()+ " health is "+ user.getHealth());
           if (user.getHealth() <= 0) {
               System.out.println("❌You Lost !❌");
               break;
           }
       }

       System.out.println("Game ended!! ");
    }


    public static Character createCharacter(int userInput, String name) {
        Character characterUser;
        if (userInput == 1) {
            List<Attack> attacks = new ArrayList<>();
            Attack attack1 = new Attack("FireBall", 10);
            Attack attack2 = new Attack("EnergyBall", 8);
            attacks.add(attack1);
            attacks.add(attack2);
            characterUser = new Mage(name, 70, 5, 5, attacks);
        } else if (userInput == 2) {
            List<Attack> attacks = new ArrayList<>();
            Attack attack1 = new Attack("Punch", 6);
            Attack attack2 = new Attack("Kick", 4);
            attacks.add(attack1);
            attacks.add(attack2);
            characterUser = new Troll(name, 100, 8, 5, attacks);
        } else if (userInput == 3) {
            List<Attack> attacks = new ArrayList<>();
            Attack attack1 = new Attack("Slash", 8);
            Attack attack2 = new Attack("Poke", 8);
            attacks.add(attack1);
            attacks.add(attack2);
            characterUser = new Warrior(name, 80, 4, 5, attacks);
        } else {
            List<Attack> attacks = new ArrayList<>();
            Attack attack1 = new Attack("Arrow", 15);
            Attack attack2 = new Attack("DoubleArrow", 18);
            attacks.add(attack1);
            attacks.add(attack2);
            characterUser = new Elf(name, 40, 2, 5, attacks);

        }
        return characterUser;
    }

}
