package employees;

import interfaces.MailService;
import interfaces.Sendable;
import MailService.RealMailService;

/**�����, ������������ ����������� ��������� �����, ������� ������ ����, ����� �������� �������� ������
 * ��������������� � ������ �����, ��������������� �������� ���� ������ ������ ������� ���, � �����,
 * � ����� ������, �������� ������������ ������ ��������������� ���������� RealMailService.
 */
public class UntrustworthyMailWorker implements MailService {
    private final MailService realMailService = new RealMailService();
    private MailService[] services;

    public UntrustworthyMailWorker(MailService[] services){
        this.services = services;
    }

    public MailService getRealMailService(){
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (int i = 0; i < services.length; i++) {
            processed = services[i].processMail(processed);
        }
        return realMailService.processMail(mail);
    }
}
