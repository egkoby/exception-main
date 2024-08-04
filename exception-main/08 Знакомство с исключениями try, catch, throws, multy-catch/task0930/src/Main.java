import java.nio.file.FileSystemException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Логирование состояний и ошибок в работе программы.
 *  Напишите метод, который выбрасывает проверяемое исключение и поймайте его в методе main
 *  Отловите и залогируйте начало вызова метода с ошибкой и саму ошибку уровнем INFO и WARNING соответственно
 */

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            checkedException();
        } catch (NullPointerException e) {
            // Логирование исключения в методе main
            LOGGER.log(java.util.logging.Level.WARNING, "Произошла ошибка:", e);
            LOGGER.log(java.util.logging.Level.INFO, "Произошла ошибка:", e);
        }

    }

    public static void checkedException() throws NullPointerException {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}