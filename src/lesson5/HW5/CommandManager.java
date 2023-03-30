package lesson5.HW5;

import java.util.Arrays;
import java.util.List;

public class CommandManager {

    private RobotMap map;
    private List<CommandHandler> handlers;

    public CommandManager(RobotMap map, List<CommandHandler> handlers) {
        this.map = map;
        this.handlers = handlers;
    }

    public void handleCommand(String command) {
        String[] split = command.split(" "); // [command-name, arg]
        String commandName = split[0];
        String[] arguments = Arrays.copyOfRange(split, 1, split.length);

        handlers.stream()
                .filter(handler -> commandName.equals(handler.commandName()))
                .findFirst()
                .ifPresentOrElse(
                handler -> handler.handleCommand(map, arguments),
                () -> System.out.println("Команда не найдена. Попробуйте еще раз")
        );
//        for (CommandHandler handler : handlers) {
//            if (commandName.equals(handler.commandName())) {
//                handler.handleCommand(map, arguments);
//                return;
//            }
//        }
//        System.out.println("Команда не найдена. Попробуйте еще раз");
    }

}
