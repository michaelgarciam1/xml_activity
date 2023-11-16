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

                System.out.println("elige un id para ver el booking , o pon -1 para salir");
                int num=sc.nextInt();
                sc.nextLine();
                if(num!=-1){
                    try {
                        System.err.println(listaBooking.get(num-1));
                    } catch (Exception e) {
                       System.out.println("error al elegir el ID");
                    }
                }else{
                    salir=true;
                    System.out.println("saliendo del programa");
                }

            }
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}