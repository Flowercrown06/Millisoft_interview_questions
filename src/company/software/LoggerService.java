package company.software;

import company.software.exception.EmailFormatException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerService {
    public static void log(String level, String operation, String user, Object request, Object response, Exception e) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        System.out.println("[TIMESTAMP] " + timestamp);
        System.out.println("[LEVEL]     " + level);
        System.out.println("[OPERATION] " + operation);
        System.out.println("[USER]      " + user);
        System.out.println("[TYPE]      " + (request != null ? request.getClass().getName() : "null"));
        System.out.println("[REQUEST]   " + request);
        System.out.println("[RESPONSE]  " + response);

        System.out.println();
    }
    public static void logInfo(String operation, String user, Object request, Object response) {
        log("INFO", operation, user, request, response, null);
    }

    public static void logError(String operation, String user, Object request, Object response, Exception e) {
        log("ERROR", operation, user, request, response, e);
    }


}
