package ru.vsuet.events.data.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vsuet.events.data.model.Data;
import ru.vsuet.events.data.service.DataService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@AllArgsConstructor
public class DataController {

    private final DataService service;

    @GetMapping("data")
    public List<Data> findAllData() {
        return service.findAllData();
    }

    @PostMapping("events")
    public Data saveData(@RequestBody Data data) {
        return service.saveData(data);
    }

    @PutMapping("update_data")
    public Data updateData(@RequestBody Data data) {
        return service.updateData(data);
    }
}
