package com.lakeview_hotel.Lakeview.Hotel.repository;

import com.lakeview_hotel.Lakeview.Hotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedRoomRepository extends JpaRepository<BookedRoom,Long> {
}
