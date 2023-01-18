package com.cards.api.repository;

import com.cards.api.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModel,Long> {
}
