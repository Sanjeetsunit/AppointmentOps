package Service;

import AppoinmentRepo.DoctorRepo;
import Model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;
    @Override
    public List<Doctor> getDoctorList() {
        return (List<Doctor>) doctorRepo.findAll();
    }

    @Override
    public Doctor saveDoctorList(Doctor doctorList) {
        return doctorRepo.save(doctorList);
    }

    @Override
    public Doctor UpdateDoctorList(Doctor doctor, Long id) {
        return null;
    }

    @Override
    public void deleteDoctor(Long id) {

    }
}
