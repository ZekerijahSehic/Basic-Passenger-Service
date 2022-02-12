package com.zekerijah.basicpassengerservice.controller;

import com.zekerijah.basicpassengerservice.model.Passenger;
import com.zekerijah.basicpassengerservice.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("")
    public String passengers(Model model){
        List<Passenger> passengerList = passengerService.getAllPassenger();
        model.addAttribute("passengers", passengerList);
        return "passenger";
    }

    @PostMapping("/add-new")
    public String addPassenger(Passenger passenger){
        passengerService.savePassenger(passenger);
        return "redirect:/";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.PUT})
    public String updatePasenger(Passenger passenger){
        passengerService.savePassenger(passenger);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String deletePassenger(Long id){
        passengerService.deletePassenger(id);
        return "redirect:/";
    }

    @RequestMapping("/find-by-id")
    @ResponseBody
    public Optional<Passenger> getPassenger(Long id){
        return passengerService.findPassenger(id);
    }
}
