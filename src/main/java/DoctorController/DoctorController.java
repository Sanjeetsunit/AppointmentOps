package DoctorController;

import Model.Doctor;
import Service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctor")
@Slf4j
public class DoctorController {
    @Autowired
    private DoctorService doctorService ;

    @GetMapping("/all")
    public List<Doctor> getAllDoctors(){
        System.out.println("Inside getAllDoctors -Controller");
        return doctorService.getAllDoctor();
    }

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorByID(@PathVariable Long id){
        return Optional.ofNullable(doctorService.getDoctorByID(id).orElseThrow(()
                -> new RuntimeException("Doctor not found with id " + id)));
    }
}
