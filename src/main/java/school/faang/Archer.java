package school.faang;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 3, 10, 5);
    }

    @Override
    public void attack(Character enemy) {
        enemy.health -= this.dexterity;
        System.out.println(this.name + " атакует - " + enemy.name + " нанося: " + this.dexterity + " урон");
    }
}
