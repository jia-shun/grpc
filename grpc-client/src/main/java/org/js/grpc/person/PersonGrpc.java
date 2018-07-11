package org.js.grpc.person;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: person.proto")
public final class PersonGrpc {

  private PersonGrpc() {}

  public static final String SERVICE_NAME = "Person";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<FindPersonRequest,
      FindPersonResponse> getFindByIdMethod;

  public static io.grpc.MethodDescriptor<FindPersonRequest,
      FindPersonResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<FindPersonRequest, FindPersonResponse> getFindByIdMethod;
    if ((getFindByIdMethod = PersonGrpc.getFindByIdMethod) == null) {
      synchronized (PersonGrpc.class) {
        if ((getFindByIdMethod = PersonGrpc.getFindByIdMethod) == null) {
          PersonGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<FindPersonRequest, FindPersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Person", "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindPersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindPersonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonMethodDescriptorSupplier("FindById"))
                  .build();
          }
        }
     }
     return getFindByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonStub newStub(io.grpc.Channel channel) {
    return new PersonStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(FindPersonRequest request,
        io.grpc.stub.StreamObserver<FindPersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                FindPersonRequest,
                FindPersonResponse>(
                  this, METHODID_FIND_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class PersonStub extends io.grpc.stub.AbstractStub<PersonStub> {
    private PersonStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonStub(channel, callOptions);
    }

    /**
     */
    public void findById(FindPersonRequest request,
        io.grpc.stub.StreamObserver<FindPersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonBlockingStub extends io.grpc.stub.AbstractStub<PersonBlockingStub> {
    private PersonBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonBlockingStub(channel, callOptions);
    }

    /**
     */
    public FindPersonResponse findById(FindPersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonFutureStub extends io.grpc.stub.AbstractStub<PersonFutureStub> {
    private PersonFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FindPersonResponse> findById(
        FindPersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((FindPersonRequest) request,
              (io.grpc.stub.StreamObserver<FindPersonResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PersonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PersonService.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Person");
    }
  }

  private static final class PersonFileDescriptorSupplier
      extends PersonBaseDescriptorSupplier {
    PersonFileDescriptorSupplier() {}
  }

  private static final class PersonMethodDescriptorSupplier
      extends PersonBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PersonGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
