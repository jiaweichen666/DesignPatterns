package MementoMethod.Examples;
public class Gamer {
    private int life;
    private int attack;
    private int defense;
    public  Memento CreateMemento(){
        return new Memento(life,attack,defense);
    }
    public void SetMemento(Memento memento){
        this.life = memento.getLife();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }
    public void InitGamer(){
        this.life = 100;
        this.attack = 100;
        this.defense = 100;
    }
    public void AfterFightWithBoss(){
        this.life = 0;
        this.attack = 0;
        this.defense = 0;
    }
    public void DisplayGamerState(){
        System.out.println("Gamer Life:"+life);
        System.out.println("Gamer Attack:"+attack);
        System.out.println("Gamer Defense:"+defense);
        System.out.println("________________________");
    }
}
