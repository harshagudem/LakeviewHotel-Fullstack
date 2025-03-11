package com.lakeview_hotel.Lakeview.Hotel.service;

import com.lakeview_hotel.Lakeview.Hotel.dto.RoomDTO;
import org.springframework.stereotype.Service;


public interface RoomService {
    RoomDTO AddNewRoom(RoomDTO roomDTO);
}
