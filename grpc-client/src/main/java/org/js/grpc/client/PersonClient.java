package org.js.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.js.grpc.client.entry.Person;
import org.js.grpc.person.FindPersonRequest;
import org.js.grpc.person.FindPersonResponse;
import org.js.grpc.person.PersonGrpc;

import java.util.concurrent.TimeUnit;

/**
 * @author JiaShun
 * @date 2018/7/11 10:43
 */
public class PersonClient{
    private final ManagedChannel channel;
    private final PersonGrpc.PersonBlockingStub blockingStub;
    public PersonClient(String host,int port){
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    private  PersonClient(ManagedChannelBuilder<?> channelBuilder){
        channel = channelBuilder.build();
        blockingStub = PersonGrpc.newBlockingStub(channel);
    }

    public void shutdown()throws InterruptedException{
        channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
    }

    public Person findById(int id){
        FindPersonRequest req = FindPersonRequest.newBuilder().setId(id).build();
        FindPersonResponse res = blockingStub.findById(req);
        System.out.println("服务器返回的信息：姓名-" + res.getName() + "，年龄-" + res.getAge() + "，性别-" + res.getSex());
        Person person = new Person();
        person.setId(id);
        person.setAge(res.getAge());
        person.setName(res.getName());
        person.setSex(res.getSex());
        return person;
    }
}
