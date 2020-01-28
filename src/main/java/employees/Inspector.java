package employees;

import interfaces.MailService;
import interfaces.Sendable;
import MailService.MailPackage;
import exceptions.StolenPackageException;
import exceptions.IllegalPackageException;
import MailService.Package;

/**Inspector � ���������, ������� ������ �� ������������ � ����������� ��������� �
 * ���� ������� � ���� ����������, ���� ���� ���������� �������� �������.
 */
public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();
            if (content.indexOf("stones instead of ") == 0) {
                throw new StolenPackageException();
            } else if (content.equals("weapons") || content.equals("banned substance")) {
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
