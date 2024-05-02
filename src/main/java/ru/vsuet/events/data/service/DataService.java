package ru.vsuet.events.data.service;

import org.springframework.stereotype.Service;
import ru.vsuet.events.data.model.Data;

import java.util.List;

@Service
public interface DataService {
     List<Data> findAllData();

     Data saveData(Data data);

     Data updateData(Data data);
}
