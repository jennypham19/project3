package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Room;
import com.example.managementhotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@Controller
@RequestMapping("")
public class RoomController {
    @Autowired
    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping("/room")
    public String index(Model model){
        List<Room> listRoom = roomService.getAll();
        model.addAttribute("listRoom",listRoom);
        return "room/room";
    }
}
