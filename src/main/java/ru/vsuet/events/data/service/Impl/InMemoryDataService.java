package ru.vsuet.events.data.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsuet.events.data.model.Data;
import ru.vsuet.events.data.repository.InMemoryDataDAO;
import ru.vsuet.events.data.service.DataService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryDataService implements DataService {

    private final InMemoryDataDAO repository;
    @Override
    public List<Data> findAllData() {
        return repository.findAllData();
    }

    @Override
    public Data saveData(Data data) {
        return repository.saveData(data);
    }

    @Override
    public Data updateData(Data data) {
        return repository.updateData(data);
    }
}
