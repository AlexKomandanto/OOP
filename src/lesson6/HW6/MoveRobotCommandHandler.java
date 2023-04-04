package lesson6.HW6;

import java.util.UUID;

public class MoveRobotCommandHandler implements CommandHandler {
    @Override
    public String commandName() {
        return "move-robot";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        UUID robotId = UUID.fromString(args[0]);
        RobotMap.Robot robot = map.findRobotById(robotId).orElseThrow();
        try {
            robot.move();
            System.out.println("Robot moved: " + robot.toString());
        } catch (PositionException e) {
            System.out.println("Error moving robot: " + e.getMessage());
        }
    }
}
