package buoi8;

public class FlightTicket {
    public FlightTicket(){}
     Date departureDate;
     Time departureTime;
     byte noOfTickets;
     double price = 1000;
     double totalPrice;
     byte typeOfCabin;

     void getDepartureDate(Date departureDate) {this.departureDate = departureDate;}

     void setDepartureDate(Date departureDate) {this.departureDate = departureDate;}

     void getDepartureTime(Time departureTime) {this.departureTime = departureTime;}

     void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

     double getTotalPrice() {
        return totalPrice;
    }

}
