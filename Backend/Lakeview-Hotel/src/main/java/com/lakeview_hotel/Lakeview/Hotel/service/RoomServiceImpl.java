package com.lakeview_hotel.Lakeview.Hotel.service;

import com.lakeview_hotel.Lakeview.Hotel.dto.RoomDTO;
import com.lakeview_hotel.Lakeview.Hotel.model.Room;
import com.lakeview_hotel.Lakeview.Hotel.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService{

    private RoomRepository roomRepository;

    @Override
    public RoomDTO AddNewRoom(RoomDTO roomDTO) {
        Room room = new Room();
        room.setRoomType(roomType);
        return null;
    }
}
