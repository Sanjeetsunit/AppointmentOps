package Service;

import AppoinmentRepo.DoctorRepo;
import Model.Doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DoctorService {

    @Autowired
    private DoctorRepo doctorRepo ;

    public List<Doctor> getAllDoctor(){
        System.out.println("Inside getAllDoctors Services");
        return doctorRepo.findAll();
    }
    public Optional<Doctor> getDoctorByID(Long id){
        return doctorRepo.findById(id) ;
    }
}
