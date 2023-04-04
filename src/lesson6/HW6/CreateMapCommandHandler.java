package lesson6.HW6;

import java.util.Map;

public class CreateMapCommandHandler implements CommandHandler {

    @Override
    public String commandName() {
        return "create-map";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        //map.createMap(width, height);
        RobotMap.createMap(width, height);
        System.out.println("Map created: " + map);
    }

}

