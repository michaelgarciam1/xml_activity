import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLSAXHandler extends DefaultHandler {

    private StringBuilder currentValue;
    private Booking currentBooking;
    private ArrayList<Booking>clienteArrayList= new ArrayList<Booking>();

    @Override
    public void startDocument(){
        System.out.println("incio del documento");
    }

    @Override
    public void endDocument(){
        System.out.println("Fin del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("booking".equals(qName)) {
            currentBooking = new Booking();
            currentBooking.setBooking(attributes.getValue("location_number"));
        }
        currentValue = new StringBuilder();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentValue.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("client".equals(qName)) {
            currentBooking.setClient(currentValue.toString());
        } else if ("agency".equals(qName)) {
            currentBooking.setAgency(currentValue.toString());
        } else if ("price".equals(qName)) {
            currentBooking.setPrice(Double.parseDouble(currentValue.toString().replace(",", ".")));
        } else if ("room".equals(qName)) {
            currentBooking.setRoom(currentValue.toString());
        } else if ("hotel".equals(qName)) {
            currentBooking.setHotel(currentValue.toString());
        } else if ("check_in".equals(qName)) {
            currentBooking.setCheck_in(currentValue.toString());
        } else if ("room_nights".equals(qName)) {
            currentBooking.setRoom_nights(Integer.parseInt(currentValue.toString()));
        } else if ("booking".equals(qName)) {
            clienteArrayList.add(currentBooking);
        }
    }
    public ArrayList getClienteArrayList(){
        return clienteArrayList;
    }
}
