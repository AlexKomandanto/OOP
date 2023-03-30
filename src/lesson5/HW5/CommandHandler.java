package lesson5.HW5;

public interface CommandHandler {

    String commandName();

    void handleCommand(RobotMap map, String[] args);

}
