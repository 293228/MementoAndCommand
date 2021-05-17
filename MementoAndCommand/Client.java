package MementoAndCommand;

import MementoAndCommand.UserInfoDTO;
import MementoAndCommand.Caretaker;

import java.util.concurrent.Callable;

public class Client {

    public static void main(String[] args) {

        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();               //创建负责人
        RestoreCommand restoreCommand = new RestoreCommand(user);

        Controller control = new Controller(restoreCommand);

        user.setAccount("fy");
        user.setPassword("12345678");
        user.setTelNo("12300004444");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());        //保存备忘录
        System.out.println("-----------------------------------------------------");

        user.setPassword("00000000");
        user.setTelNo("18600000000");
        System.out.println("状态二：");
        user.show();
        System.out.println("---------------------------------------------------------");

        control.restoreCommand(c.getMemento());      //从备忘录中恢复
        System.out.println("回到状态一：");
        user.show();
        System.out.println("-------------------------------------------------------------");

    }

}
