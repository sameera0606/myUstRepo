package com.ust.farmer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.farmer.model.Field;
import com.ust.farmer.service.fieldService;

@RestController
@RequestMapping("api/field")
public class FieldController {

	@Autowired
    private fieldService fieldService;
	
	@PostMapping("/register")
    public Field addField(@RequestBody Field field) {
        return fieldService.createField(field);

    }
}
