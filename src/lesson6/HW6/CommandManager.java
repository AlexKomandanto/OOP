package lesson6.HW6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CommandManager {

    private RobotMap map;
    private List<CommandHandler> handlers;

    public CommandManager(RobotMap map, List<CommandHandler> handlers) {
        this.map = map;
        this.handlers = handlers;
    }

//    public CommandManager(Map map, RobotMap.Robot robot, List<CommandHandler> handlers) {
//        this.map = new RobotMap(map, robot);
//        this.handlers = handlers;
//    }

    public void handleCommand(String command) {
        String[] split = command.split(" "); // [command-name, arg]
        String commandName = split[0];
        String[] arguments = Arrays.copyOfRange(split, 1, split.length);

        handlers.stream()
                .filter(handler -> commandName.equals(handler.commandName()))
                .findFirst()
                .ifPresentOrElse(
                        handler -> handler.handleCommand(map, arguments),
                        () -> System.out.println("Command not found. Please try again.")
                );
    }
}


//public class CommandManager {
//
//    private RobotMap map;
//    private List<CommandHandler> handlers;
//
//    public CommandManager(RobotMap map, List<CommandHandler> handlers) {
//        this.map = map;
//        this.handlers = handlers;
//    }
//
//    public CommandManager(Map map, RobotMap.Robot robot, List<CommandHandler> handlers) {
//
//    }
//
//    public void handleCommand(String command) {
//        String[] split = command.split(" "); // [command-name, arg]
//        String commandName = split[0];
//        String[] arguments = Arrays.copyOfRange(split, 1, split.length);
//
//        handlers.stream()
//                .filter(handler -> commandName.equals(handler.commandName()))
//                .findFirst()
//                .ifPresentOrElse(
//                handler -> handler.handleCommand(map, arguments),
//                () -> System.out.println("Команда не найдена. Попробуйте еще раз")
//        );
//    }
//}
