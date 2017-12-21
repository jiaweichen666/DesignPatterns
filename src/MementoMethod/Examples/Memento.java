package MementoMethod.Examples;

public class Memento {
    private int life;
    private  int attack;
    private int defense;

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    Memento(int life, int attack, int defense){
        this.life  = life;
        this.attack = attack;
        this.defense = defense;
    }
}
