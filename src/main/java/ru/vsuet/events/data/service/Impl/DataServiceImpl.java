package ru.vsuet.events.data.service.Impl;


import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.vsuet.events.data.model.Data;
import ru.vsuet.events.data.repository.DataRepository;
import ru.vsuet.events.data.service.DataService;

import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class DataServiceImpl implements DataService {
    private final DataRepository repository;
    @Override
    public List<Data> findAllData() {
        return repository.findAll();
    }
    @Cacheable(cacheNames = {"recordCache"}, key = "#data")
    @Override
    public Data saveData(Data data) {
        return repository.save(data);
    }
    @Cacheable(cacheNames = {"recordCache"}, key = "#data")
    @Override
    public Data updateData(Data data) {
        return repository.save(data);
    }

}
