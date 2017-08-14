package mail;

/**
 * Created by Otimus on 8/13/2017.
 */
public interface MailSender {

    void send(String to,String subject, String body);

    }

