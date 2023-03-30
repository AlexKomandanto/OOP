package lesson5.HW5;

public class CreateRobotCommandHandler implements CommandHandler {
    @Override
    public String commandName() {
        return "create-robot";
    }

    @Override
    public void handleCommand(RobotMap map, String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Point position = new Point(x, y);
        try {
            RobotMap.Robot robot = map.createRobot(position);
            System.out.println("Robot created: " + robot.toString());
        } catch (PositionException e) {
            System.out.println("Error creating robot: " + e.getMessage());
        }
    }
}
