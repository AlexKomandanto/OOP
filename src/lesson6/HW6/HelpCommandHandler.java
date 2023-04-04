package lesson6.HW6;

import java.util.UUID;

public class HelpCommandHandler implements CommandHandler {
//    @Override
//    public void handleCommand(String[] args) {
//        System.out.println("List of commands:");
//        System.out.println("create-map <width> <height>");
//        System.out.println("create-robot <x> <y>");
//        System.out.println("move-robot <id>");
//        System.out.println("change-direction <id> <LEFT|RIGHT|UP|DOWN>");
//        System.out.println("help");
//    }

    @Override
    public String commandName() {return "help";}

    @Override
    public void handleCommand(RobotMap map, String[] args) {
//        UUID robotId = UUID.fromString(args[0]);
//        RobotMap.Direction newDirection = RobotMap.Direction.valueOf(args[1]);
//        RobotMap.Robot robot = map.findRobotById(robotId).orElseThrow();
        System.out.println("List of commands:");
        System.out.println("create-map <width> <height>");
        System.out.println("create-robot <x> <y>");
        System.out.println("move-robot <id>");
        System.out.println("change-direction <id> <LEFT|RIGHT|UP|DOWN>");
        System.out.println("help");
    }

}
