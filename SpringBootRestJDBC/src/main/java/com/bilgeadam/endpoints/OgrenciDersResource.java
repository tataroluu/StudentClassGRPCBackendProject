package com.bilgeadam.endpoints;

import com.bilgeadam.models.OgrenciDersModel;
import com.bilgeadam.services.OgrenciDersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ogrenciders")
public class OgrenciDersResource {

    @Autowired
    private OgrenciDersService ogrenciDersService;

    // http://localhost:8080/ogrenciders/getAll
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OgrenciDersModel> getAllRest() {
        return ogrenciDersService.getAllService();
    }

    // http://localhost:8080/ogrenciders/getById/{id}
    @GetMapping(path = "getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public  List<OgrenciDersModel>  getByIdRest(@PathVariable Long id) {
        return OgrenciDersService.getByIdService(id);
    }
}
