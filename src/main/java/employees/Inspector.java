package employees;

import interfaces.MailService;
import interfaces.Sendable;

/**Inspector � ���������, ������� ������ �� ������������ � ����������� ��������� �
 * ���� ������� � ���� ����������, ���� ���� ���������� �������� �������.
 */
public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
