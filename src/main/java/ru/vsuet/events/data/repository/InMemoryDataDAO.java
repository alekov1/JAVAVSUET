package ru.vsuet.events.data.repository;

import org.springframework.stereotype.Repository;
import ru.vsuet.events.data.model.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InMemoryDataDAO {
    private final List<Data> DATA = new ArrayList<>();

    public List<Data> findAllData() {
        return DATA;
    }

    public Data saveData(Data data) {
        DATA.add(data);
        return data;
    }

    public Data updateData(Data data) {
        var dataIndex = IntStream.range(0, DATA.size())
                .filter(index -> DATA.get(index).getName().equals(data.getName()))
                .findFirst()
                .orElse(-1);
        if (dataIndex > -1){
            DATA.set(dataIndex, data);
            return data;
        }
        return null;
    }
}
