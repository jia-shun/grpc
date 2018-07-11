package org.js.grpc.client.service;

import org.js.grpc.client.PersonClient;
import org.js.grpc.client.entry.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author JiaShun
 * @date 2018/7/11 11:11
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Value("${grpc.host}")
    private String host;
    @Value("${grpc.port}")
    private int port;
    @Override
    public Person findById(int id) throws InterruptedException{
        PersonClient client = new PersonClient(host,port);
        Person person = client.findById(id);
        client.shutdown();
        return person;
    }
}
