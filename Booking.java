public class Booking {
    private String booking;
    private String client;
    private String agency;
    private String price;
    private String room;
    private String hotel;
    private String check_in;
    private String room_nights;

    public Booking(String booking, String client, String agency, String price, String room, String hotel, String check_in, String room_nights) {
        this.booking = booking;
        this.client = client;
        this.agency = agency;
        this.price = price;
        this.room = room;
        this.hotel = hotel;
        this.check_in = check_in;
        this.room_nights = room_nights;
    }

    public String getBooking() {
        return this.booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAgency() {
        return this.agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRoom() {
        return this.room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHotel() {
        return this.hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getCheck_in() {
        return this.check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getRoom_nights() {
        return this.room_nights;
    }

    public void setRoom_nights(String room_nights) {
        this.room_nights = room_nights;
    }

}
