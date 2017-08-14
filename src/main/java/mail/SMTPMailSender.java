package mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Otimus on 8/13/2017.
 */
public class SMTPMailSender implements MailSender {
    public static final Log log= LogFactory.getLog(SMTPMailSender.class);
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail to " +to);
        log.info("Subject "+subject);
        log.info("Body "+body);

    }
}
