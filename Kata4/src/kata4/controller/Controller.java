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
public class Controller {
    private String fileRoute;
    private List<Mail> listOfMails;
    private Histogram<String> histogram;
// Implementando CIPO en el controlador
    public static void main(String[] args) throws IOException{
        Controller controlador = new Controller();
        controlador.control();
    }
    
    private void control() throws IOException{
        input();
        process();
        output();
    }

    private void input() throws IOException{
        // Se deja la ruta absoluta del fichero utilizado para la prueba.
        fileRoute = "C:\\Users\\Usuario\\Desktop\\Proyectos IS2 GitHub\\Kata4-clase\\email.txt";
        listOfMails = MailListReader.read(fileRoute);
    }

    private void process(){
        histogram = MailHistogramBuilder.build(listOfMails);
    }

    private void output(){
        new HistogramDisplay(histogram).execute();
    }
}

