package ru.vsuet.events.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsuet.events.data.model.Data;

public interface DataRepository extends JpaRepository<Data, Long> {
}
