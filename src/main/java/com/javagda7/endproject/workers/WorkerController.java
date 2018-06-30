package com.javagda7.endproject.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @RequestMapping("/workers")
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @RequestMapping("/workers/{id}")
    public Worker getWorker(@PathVariable int id) {
        return workerService.getWorker(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/workers")
    public Worker addWorker(@RequestBody Worker worker) {
        return workerService.addWorker(worker);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/workers/{id}")
    public void updateWorker(@RequestBody Worker worker, @PathVariable int id)
    {   worker.setId(id);
        workerService.updateWorker(id, worker); }

    @RequestMapping(method= RequestMethod.DELETE, value="/workers/{id}")
    public void deleteWorker(@PathVariable int id) {
        workerService.deleteWorker(id);
    }
}


