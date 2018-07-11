package org.js.grpc.client.service;

import org.js.grpc.client.PersonClient;
import org.js.grpc.client.entry.Person;
import org.springframework.stereotype.Service;

/**
 * @author JiaShun
 * @date 2018/7/11 11:11
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person findById(int id) throws InterruptedException{
        PersonClient client = new PersonClient("192.168.8.224",50051);
        Person person = client.findById(1);
        client.shutdown();
        return person;
    }
}
