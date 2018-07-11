package org.js.grpc.client.controller;

import org.js.grpc.client.entry.Person;
import org.js.grpc.client.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JiaShun
 * @date 2018/7/11 11:04
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/{id}")
    public Person findById(@PathVariable int id)throws Exception{
        return personService.findById(id);
    }
}
