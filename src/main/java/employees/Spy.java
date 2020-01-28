package employees;

import interfaces.MailService;
import interfaces.Sendable;
import MailService.MailMessage;

import java.util.logging.Logger;

/**Spy Ц шпион, который логгирует о всей почтовой переписке, котора€ проходит через его руки.
 *
 */
public class Spy implements MailService {
        private Logger LOGGER;

        public Spy(Logger logger) {
            LOGGER = logger;
        }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail.getClass() == MailMessage.class) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            if (from.equals("Austin Powers") || to.equals("Austin Powers")) {
                LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");
            }
        }
        return mail;
    }
}
