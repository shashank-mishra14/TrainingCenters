package training_center_registry.demo.service;

import training_center_registry.demo.dto.AddressDTO;
import training_center_registry.demo.dto.TrainingCenterDTO;
import training_center_registry.demo.model.Address;
import training_center_registry.demo.model.TrainingCenter;
import training_center_registry.demo.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrainingCenterService {
    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenter createTrainingCenter(TrainingCenterDTO dto) {
        TrainingCenter trainingCenter = convertToEntity(dto);
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }

    private TrainingCenter convertToEntity(TrainingCenterDTO dto) {
        TrainingCenter entity = new TrainingCenter();
        entity.setCenterName(dto.getCenterName());
        entity.setCenterCode(dto.getCenterCode());
        entity.setAddress(convertToAddressEntity(dto.getAddress()));
        entity.setStudentCapacity(dto.getStudentCapacity());
        entity.setCoursesOffered(dto.getCoursesOffered());
        entity.setContactEmail(dto.getContactEmail());
        entity.setContactPhone(dto.getContactPhone());
        return entity;
    }

    private Address convertToAddressEntity(AddressDTO dto) {
        Address address = new Address();
        address.setDetailedAddress(dto.getDetailedAddress());
        address.setCity(dto.getCity());
        address.setState(dto.getState());
        address.setPincode(dto.getPincode());
        return address;
    }
}