package mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Otimus on 8/13/2017.
 */
public class MockMailSender implements MailSender{

    public final static Log log=  LogFactory.getLog(MockMailSender.class);
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending mail to " + to);
        log.info("Subject " + subject);
        log.info("Body " + body);

    }
}
