package com.zekerijah.basicpassengerservice.service;

import com.zekerijah.basicpassengerservice.model.Passenger;
import com.zekerijah.basicpassengerservice.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getAllPassenger(){
        return passengerRepository.findAll();
    }

    public Optional<Passenger> findPassenger(Long id){
        return passengerRepository.findById(id);
    }

    public void savePassenger(Passenger passenger){
        passengerRepository.save(passenger);
    }

    public void deletePassenger(Long id){
        passengerRepository.deleteById(id);
    }
}
