package MementoMethod.Examples;

public class Client {
    /*模拟一个游戏角色的存储功能，使用备忘录模式。
    * 角色在打boss之前会进行存档，若失败可以读取存档重新来过*/
    public static void main(String[] args) {
        //创建角色并存档
        Gamer gamer  = new Gamer();
        gamer.InitGamer();
        gamer.DisplayGamerState();
        Memento memento = gamer.CreateMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        //大战boss
        gamer.AfterFightWithBoss();
        gamer.DisplayGamerState();
        //恢复存档
        gamer.SetMemento(caretaker.getMemento());
        gamer.DisplayGamerState();
    }
}
