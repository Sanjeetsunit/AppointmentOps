package DoctorController;

import Model.Doctor;
import Service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return doctorService.getDoctorList();
    }

    @PostMapping("/saveDocter")
    public Doctor saveDocter(@RequestBody Doctor doctorList){
        return doctorService.saveDoctorList(doctorList);
    }

}
