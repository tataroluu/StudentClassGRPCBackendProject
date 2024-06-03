package com.bilgeadam.endpoints;

import com.bilgeadam.models.OgrenciModel;
import com.bilgeadam.services.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ogrenci")
public class OgrenciResource {

    @Autowired
    private OgrenciService ogrenciService;

    // http://localhost:8080/ogrenci/getAll
     @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OgrenciModel> getAllRest() {
        return ogrenciService.getAllService();
    }



     // http://localhost:8080/ogrenci/getById/{id}
    @GetMapping(path = "getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OgrenciModel> getByIdRest(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(ogrenciService.getByIdService(id));
    }

    //@PutMapping, @PatchMapping update için kullanılabilir
    // http://localhost:8080/ogrenci/insert
    @CrossOrigin(origins = "http://localhost:1234")
    @PostMapping(path = "insert", produces = MediaType.APPLICATION_JSON_VALUE) //**
    public ResponseEntity<String> insertRest(@RequestBody OgrenciModel ogrenciModel) {
        boolean result = ogrenciService.insertService(ogrenciModel);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(ogrenciModel.getName() + "Student has been successfully added");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ogrenciModel.getName() + "Could not add student!");
        }
    }

    //http://localhost:8080/ogrenci/deleteById/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @DeleteMapping(path = "deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteRest(@PathVariable int id) {
        boolean isDeleted = true;
        OgrenciModel ogrenciModelList = new OgrenciService().getByIdService(id);
        if (ogrenciModelList == null) {
            isDeleted = new OgrenciService().deleteService(id);
        } else {
            boolean isDeletedOgrenci = new OgrenciService().deleteService(id);
            if (isDeletedOgrenci) {
                System.out.println("Student could not be deleted" + isDeleted);
            }
        }
        System.out.println("is deleted : " + isDeleted);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK).body("deleted");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not Deleted!");
        }
    }

    // http://localhost:8080/ogrenci/addDers/{id}
     @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "addDers/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addDersRest(@PathVariable int id, @RequestBody OgrenciModel ogrenciModel) {
        boolean result = ogrenciService.addDersService(ogrenciModel, id);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(OgrenciService.message);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(id + " failed to update ders!");
        }
    }

    // http://localhost:8080/ogrenci/update/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateOgrenci(@RequestBody OgrenciModel ogrenciModel, @PathVariable int id) {
        boolean result = ogrenciService.updateService(ogrenciModel, id);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(OgrenciService.message);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(" failed to update ders!");
        }
    }

    // http://localhost:8080/ogrenci/updateOgrenciDers/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "updateOgrenciDers/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateDersRest(@PathVariable int id) {
        boolean result = ogrenciService.updateOgrenciDersService(id);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(OgrenciService.message);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(" failed to update ders!");
        }
    }

    // http://localhost:8080/ogrenci/updateOgrenciDersAdd/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "updateOgrenciDersAdd/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateDersAddRest(@RequestBody OgrenciModel ogrenciModel,@PathVariable int id) {
        boolean result = ogrenciService.updateOgrenciDersByAddService(ogrenciModel,id);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(OgrenciService.message);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(" failed to update ders!");
        }
    }

}
