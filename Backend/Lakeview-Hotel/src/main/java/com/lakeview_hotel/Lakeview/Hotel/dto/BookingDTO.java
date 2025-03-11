package com.lakeview_hotel.Lakeview.Hotel.dto;

import com.lakeview_hotel.Lakeview.Hotel.model.Room;
import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long bookingid;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuests;
    private String bookingConfirmationCode;
    private Room room;


}
