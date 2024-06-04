package com.bilgeadam.endpoints;

import com.bilgeadam.models.DersModel;
import com.bilgeadam.services.DersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ders")
public class DersResource {

    @Autowired
    private DersService dersService;

    // http://localhost:8080/ders/getAll
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DersModel> getAllRest() { // throws Exception
        return dersService.getAllService(); //***
    }

    // http://localhost:8080/ders/insert
    @CrossOrigin(origins = "http://localhost:1234")
    @PostMapping(path = "insert", produces = MediaType.APPLICATION_JSON_VALUE) //**
    public ResponseEntity<String> insertRest(@RequestBody DersModel dersModel) {
        boolean result = dersService.insertService(dersModel);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(dersModel.getDers_name() + "Student has been successfully added");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dersModel.getDers_name() + "Could not add student!");
        }
    }

    //http://localhost:8080/ders/deleteById/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @DeleteMapping(path = "deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteRest(@PathVariable int id) {
        boolean isDeleted = true;
        DersModel dersModel = new DersService().getByIdService(id);
        if (dersModel == null) {
            isDeleted = new DersService().deleteService(id);
        } else {
            boolean isDeletedDers = new DersService().deleteService(id);
            if (isDeletedDers) {
                System.out.println("Class could not be deleted" + isDeleted);
            }
        }
        System.out.println("is deleted : " + isDeleted);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK).body("deleted");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not Deleted!");
        }
    }

}
