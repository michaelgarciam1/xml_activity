import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Activitat9 {
    public static void main(String[] args) {
        new Activitat9().inicio();
    }

    public void inicio() {
        try {
            File inputFile = new File("bookings.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLSAXHandler userHandler = new XMLSAXHandler();
            saxParser.parse(inputFile, userHandler);
            ArrayList<Booking> listaBooking =userHandler.getClienteArrayList();
            
            boolean salir=false;
            Scanner sc = new Scanner(System.in);
            while (!salir) {

                System.out.println("elige un id para ver el booking , o pon 0 para salir");
                int num=sc.nextInt();
                sc.nextLine();
                if(num!=0){
                    try {
                        System.err.println(listaBooking.get(num));
                    } catch (Exception e) {
                       System.out.println("error al elegir el ID");
                    }
                }else{
                    salir=true;
                    System.out.println("saliendo del programa");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}