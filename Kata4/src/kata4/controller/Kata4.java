package kata4.controller;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 * 
 * @author Marcos del Cristo Díaz Gil
 * Ingeniería del Software 2, Universidad de las Palmas de Gran Canaria
 */
public class Kata4 {

    public static void main(String[] args) throws IOException {
        // La ruta se dejará como ruta absoluta para este ejercicio.
        // Es necesario poner dos veces la barra '\'.
        // Esto se debe a que una sola se utiliza para insertar un carácter de escape
        String rutaFichero = "C:\\Users\\Usuario\\Desktop\\Proyectos IS2 GitHub\\Kata4-clase\\email.txt";
        List<Mail> listOfMails = MailListReader.read(rutaFichero);
        Histogram<String> histogram = MailHistogramBuilder.build(listOfMails);
        HistogramDisplay displayHist = new HistogramDisplay(histogram);
        displayHist.execute();
    }
}
