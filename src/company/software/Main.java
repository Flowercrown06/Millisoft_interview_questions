package company.software;

import company.software.exception.EmailFormatException;

import static company.software.LoggerService.logError;
import static company.software.LoggerService.logInfo;

public class Main {
    public static void main(String[] args) {
        UserCreateRequest request = new UserCreateRequest("ali123", "ali@example.com");
        UserCreateResponse response = new UserCreateResponse(101, "SUCCESS");
        logInfo("CREATE", "admin", request, response);
        UserUpdateRequest badRequest = new UserUpdateRequest(999, "bad_email_format");
        try {
            throw new EmailFormatException("Invalid email format: 'bad_email_format'");
        } catch (Exception e) {
            logError("UPDATE", "user42", badRequest, null, e);
        }
    }
}
