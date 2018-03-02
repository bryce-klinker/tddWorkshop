import java.util.List;

public interface EmailService {

    void emailMessage(String message, List<String> emails);
}
