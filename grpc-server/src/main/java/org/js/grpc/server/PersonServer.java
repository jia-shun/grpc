package org.js.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.js.grpc.person.FindPersonRequest;
import org.js.grpc.person.FindPersonResponse;
import org.js.grpc.person.PersonGrpc;

import java.io.IOException;

/**
 * @author JiaShun
 * @date 2018/7/11 10:19
 */
public class PersonServer{
    private int port ;
    private Server server;
    public PersonServer(int port){
        this.port = port;
    }

    public void start() throws IOException{
        server = ServerBuilder.forPort(port)
                .addService(new PersonServiceImpl())
                .build()
                .start();
        System.out.println("PersonServe start ...");
        Runtime.getRuntime().addShutdownHook(new Thread(){

            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                PersonServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop(){
        if(server != null){
            server.shutdown();
        }
    }

    // block 一直到退出程序
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private class PersonServiceImpl extends PersonGrpc.PersonImplBase{
        public void findById(FindPersonRequest req, StreamObserver<FindPersonResponse> streamObserver){
            System.out.println("收到的信息：" + req.getId());
            FindPersonResponse res = FindPersonResponse.newBuilder().setName("Michael").setAge(18).setSex(true).build();
            streamObserver.onNext(res);
            streamObserver.onCompleted();
        }
    }
}
