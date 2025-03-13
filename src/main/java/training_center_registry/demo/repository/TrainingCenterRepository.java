package training_center_registry.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import training_center_registry.demo.model.TrainingCenter;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
}