package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build (List<Mail> listOfMails){
        Histogram<String> hist = new Histogram();
        for (Mail correo : listOfMails){
            hist.increment(correo.getDomain());
        }
        
        return hist;
    }
}
