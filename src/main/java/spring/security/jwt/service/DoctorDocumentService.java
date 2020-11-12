package spring.security.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.security.jwt.bean.DoctorDocument;
import spring.security.jwt.bean.User;
import spring.security.jwt.bean.dto.DoctorSpec;
import spring.security.jwt.repository.DoctorDocumentRepository;

import java.util.List;
import java.util.Set;

@Service
public interface DoctorDocumentService {

    DoctorDocument saveDoctorDocument(DoctorDocument doctorDocument);

    List<DoctorDocument> getAll();

    boolean existsByDoctorId(Long doctorId);

    void deleteById(long id);

    DoctorDocument getByDoctor_Id(Long doctor_id);

    @Transactional
    void setDoctorDocumentById(Long id, String name, String surname, String fathername);

}
