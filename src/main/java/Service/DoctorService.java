package Service;

import AppoinmentRepo.DoctorRepo;
import Model.Doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface DoctorService {

   List<Doctor> getDoctorList();
   Doctor saveDoctorList(Doctor doctorList);

   Doctor UpdateDoctorList(Doctor doctor,Long id);

   void deleteDoctor(Long id);
}
