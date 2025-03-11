package com.lakeview_hotel.Lakeview.Hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked = false;
    private String photo;
    private List<BookingDTO> bookings;




    public RoomDTO(Long id, String roomType, BigDecimal roomPrice){
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }
    public RoomDTO(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photoByte, List<BookingDTO> bookings){
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.photo = photoByte != null ? Base64.getEncoder().encodeToString(photoByte):null;
        this.bookings = bookings;
    }


}
