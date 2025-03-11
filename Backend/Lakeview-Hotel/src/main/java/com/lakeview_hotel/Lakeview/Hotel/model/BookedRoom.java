package com.lakeview_hotel.Lakeview.Hotel.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BookedRoom")
public class BookedRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingid;

    @Column(name = "Check_In")
    private LocalDate checkInDate;

    @Column(name = "Check_Out")
    private LocalDate checkOutDate;

    @Column(name = "FullName")
    private String guestFullName;

    @Column(name = "Email")
    private String guestEmail;

    @Column(name = "Adults")
    private int numOfAdults;

    @Column(name = "Children")
    private int numOfChildren;

    @Column(name = "TotalGuests")
    private int totalNumOfGuests;

    @Column(name = "Confirmation_Code")
    private String bookingConfirmationCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Room_Id")
    private Room room;



    public void calculateNoOfGuests(){
        this.totalNumOfGuests = this.numOfAdults + this.numOfChildren;
    }

    public void setNumOfAdults(int numOfAdults){
        this.numOfAdults = numOfAdults;
        calculateNoOfGuests();

    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
        calculateNoOfGuests();
    }
}
