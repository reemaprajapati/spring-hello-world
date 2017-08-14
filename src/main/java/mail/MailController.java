package mail;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Otimus on 8/14/2017.
 */
public class MailController {

    private MailSender mailSender=new MockMailSender();

    @RequestMapping("/mail")
    public String send(){
        mailSender.send("reem.prajapati@gmail.com","Hello","Good morning");
        return "Mail sent";
    }
}
