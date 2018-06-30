package com.javagda7.endproject.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {


    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getAllWorkers() {
        List<Worker> workers = new ArrayList<>();
        workerRepository.findAll()
                .forEach(workers::add);
        return workers;
    }

    public Worker getWorker(int id) {
        Optional<Worker> worker= workerRepository.findById(id);
        return worker.get();
    }

    public Worker addWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    public void updateWorker(int id, Worker worker) {
        workerRepository.save(worker);
    }

    public void deleteWorker(int id) {
        workerRepository.deleteById(id);
    }
}


