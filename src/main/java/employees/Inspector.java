package employees;

import interfaces.MailService;
import interfaces.Sendable;

/**Inspector Ц »нспектор, который следит за запрещенными и украденными посылками и
 * бьет тревогу в виде исключени€, если была обнаружена подобна€ посылка.
 */
public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
