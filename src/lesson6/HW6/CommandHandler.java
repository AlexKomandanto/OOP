package lesson6.HW6;

public interface CommandHandler {

    String commandName();

    void handleCommand(RobotMap map, String[] args);

}
