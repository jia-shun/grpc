package org.js.grpc.client.service;

import org.js.grpc.client.entry.Person;

/**
 * @author JiaShun
 * @date 2018/7/11 11:06
 */
public interface PersonService {
    public Person findById(int id)throws Exception;
}
