package com.bilgeadam.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: OgrenciDers.proto")
public final class OperationServiceGrpc {

  private OperationServiceGrpc() {}

  public static final String SERVICE_NAME = "OperationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciInsertRequest,
      com.bilgeadam.grpc.OgrenciInsertResponse> getSetOgrenciMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOgrenci",
      requestType = com.bilgeadam.grpc.OgrenciInsertRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciInsertRequest,
      com.bilgeadam.grpc.OgrenciInsertResponse> getSetOgrenciMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciInsertRequest, com.bilgeadam.grpc.OgrenciInsertResponse> getSetOgrenciMethod;
    if ((getSetOgrenciMethod = OperationServiceGrpc.getSetOgrenciMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getSetOgrenciMethod = OperationServiceGrpc.getSetOgrenciMethod) == null) {
          OperationServiceGrpc.getSetOgrenciMethod = getSetOgrenciMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciInsertRequest, com.bilgeadam.grpc.OgrenciInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "SetOgrenci"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciInsertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("SetOgrenci"))
                  .build();
          }
        }
     }
     return getSetOgrenciMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciUpdateRequest,
      com.bilgeadam.grpc.OgrenciUpdateResponse> getUpdateOgrenciMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOgrenci",
      requestType = com.bilgeadam.grpc.OgrenciUpdateRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciUpdateRequest,
      com.bilgeadam.grpc.OgrenciUpdateResponse> getUpdateOgrenciMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciUpdateRequest, com.bilgeadam.grpc.OgrenciUpdateResponse> getUpdateOgrenciMethod;
    if ((getUpdateOgrenciMethod = OperationServiceGrpc.getUpdateOgrenciMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getUpdateOgrenciMethod = OperationServiceGrpc.getUpdateOgrenciMethod) == null) {
          OperationServiceGrpc.getUpdateOgrenciMethod = getUpdateOgrenciMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciUpdateRequest, com.bilgeadam.grpc.OgrenciUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "UpdateOgrenci"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("UpdateOgrenci"))
                  .build();
          }
        }
     }
     return getUpdateOgrenciMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersUpdateAddRequest,
      com.bilgeadam.grpc.OgrenciDersUpdateAddResponse> getUpdateOgrenciDersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOgrenciDers",
      requestType = com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciDersUpdateAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersUpdateAddRequest,
      com.bilgeadam.grpc.OgrenciDersUpdateAddResponse> getUpdateOgrenciDersMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersUpdateAddRequest, com.bilgeadam.grpc.OgrenciDersUpdateAddResponse> getUpdateOgrenciDersMethod;
    if ((getUpdateOgrenciDersMethod = OperationServiceGrpc.getUpdateOgrenciDersMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getUpdateOgrenciDersMethod = OperationServiceGrpc.getUpdateOgrenciDersMethod) == null) {
          OperationServiceGrpc.getUpdateOgrenciDersMethod = getUpdateOgrenciDersMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciDersUpdateAddRequest, com.bilgeadam.grpc.OgrenciDersUpdateAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "UpdateOgrenciDers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDersUpdateAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDersUpdateAddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("UpdateOgrenciDers"))
                  .build();
          }
        }
     }
     return getUpdateOgrenciDersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersUpdateRequest,
      com.bilgeadam.grpc.OgrenciDersUpdateResponse> getEmptyOgrenciDersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmptyOgrenciDers",
      requestType = com.bilgeadam.grpc.OgrenciDersUpdateRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciDersUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersUpdateRequest,
      com.bilgeadam.grpc.OgrenciDersUpdateResponse> getEmptyOgrenciDersMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersUpdateRequest, com.bilgeadam.grpc.OgrenciDersUpdateResponse> getEmptyOgrenciDersMethod;
    if ((getEmptyOgrenciDersMethod = OperationServiceGrpc.getEmptyOgrenciDersMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getEmptyOgrenciDersMethod = OperationServiceGrpc.getEmptyOgrenciDersMethod) == null) {
          OperationServiceGrpc.getEmptyOgrenciDersMethod = getEmptyOgrenciDersMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciDersUpdateRequest, com.bilgeadam.grpc.OgrenciDersUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "EmptyOgrenciDers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDersUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDersUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("EmptyOgrenciDers"))
                  .build();
          }
        }
     }
     return getEmptyOgrenciDersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDeleteRequest,
      com.bilgeadam.grpc.OgrenciDeleteResponse> getDeleteOgrenciMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOgrenci",
      requestType = com.bilgeadam.grpc.OgrenciDeleteRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDeleteRequest,
      com.bilgeadam.grpc.OgrenciDeleteResponse> getDeleteOgrenciMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDeleteRequest, com.bilgeadam.grpc.OgrenciDeleteResponse> getDeleteOgrenciMethod;
    if ((getDeleteOgrenciMethod = OperationServiceGrpc.getDeleteOgrenciMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getDeleteOgrenciMethod = OperationServiceGrpc.getDeleteOgrenciMethod) == null) {
          OperationServiceGrpc.getDeleteOgrenciMethod = getDeleteOgrenciMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciDeleteRequest, com.bilgeadam.grpc.OgrenciDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "DeleteOgrenci"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("DeleteOgrenci"))
                  .build();
          }
        }
     }
     return getDeleteOgrenciMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciListRequest,
      com.bilgeadam.grpc.OgrenciListResponse> getListOgrenciMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOgrenci",
      requestType = com.bilgeadam.grpc.OgrenciListRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciListRequest,
      com.bilgeadam.grpc.OgrenciListResponse> getListOgrenciMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciListRequest, com.bilgeadam.grpc.OgrenciListResponse> getListOgrenciMethod;
    if ((getListOgrenciMethod = OperationServiceGrpc.getListOgrenciMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getListOgrenciMethod = OperationServiceGrpc.getListOgrenciMethod) == null) {
          OperationServiceGrpc.getListOgrenciMethod = getListOgrenciMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciListRequest, com.bilgeadam.grpc.OgrenciListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "ListOgrenci"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("ListOgrenci"))
                  .build();
          }
        }
     }
     return getListOgrenciMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciGetByIdRequest,
      com.bilgeadam.grpc.OgrenciGetByIdResponse> getOgrenciGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OgrenciGetById",
      requestType = com.bilgeadam.grpc.OgrenciGetByIdRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciGetByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciGetByIdRequest,
      com.bilgeadam.grpc.OgrenciGetByIdResponse> getOgrenciGetByIdMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciGetByIdRequest, com.bilgeadam.grpc.OgrenciGetByIdResponse> getOgrenciGetByIdMethod;
    if ((getOgrenciGetByIdMethod = OperationServiceGrpc.getOgrenciGetByIdMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getOgrenciGetByIdMethod = OperationServiceGrpc.getOgrenciGetByIdMethod) == null) {
          OperationServiceGrpc.getOgrenciGetByIdMethod = getOgrenciGetByIdMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciGetByIdRequest, com.bilgeadam.grpc.OgrenciGetByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "OgrenciGetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciGetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciGetByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("OgrenciGetById"))
                  .build();
          }
        }
     }
     return getOgrenciGetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersInsertRequest,
      com.bilgeadam.grpc.DersInsertResponse> getSetDersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDers",
      requestType = com.bilgeadam.grpc.DersInsertRequest.class,
      responseType = com.bilgeadam.grpc.DersInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersInsertRequest,
      com.bilgeadam.grpc.DersInsertResponse> getSetDersMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersInsertRequest, com.bilgeadam.grpc.DersInsertResponse> getSetDersMethod;
    if ((getSetDersMethod = OperationServiceGrpc.getSetDersMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getSetDersMethod = OperationServiceGrpc.getSetDersMethod) == null) {
          OperationServiceGrpc.getSetDersMethod = getSetDersMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.DersInsertRequest, com.bilgeadam.grpc.DersInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "SetDers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.DersInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.DersInsertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("SetDers"))
                  .build();
          }
        }
     }
     return getSetDersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersDeleteRequest,
      com.bilgeadam.grpc.DersDeleteResponse> getDeleteDersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDers",
      requestType = com.bilgeadam.grpc.DersDeleteRequest.class,
      responseType = com.bilgeadam.grpc.DersDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersDeleteRequest,
      com.bilgeadam.grpc.DersDeleteResponse> getDeleteDersMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersDeleteRequest, com.bilgeadam.grpc.DersDeleteResponse> getDeleteDersMethod;
    if ((getDeleteDersMethod = OperationServiceGrpc.getDeleteDersMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getDeleteDersMethod = OperationServiceGrpc.getDeleteDersMethod) == null) {
          OperationServiceGrpc.getDeleteDersMethod = getDeleteDersMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.DersDeleteRequest, com.bilgeadam.grpc.DersDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "DeleteDers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.DersDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.DersDeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("DeleteDers"))
                  .build();
          }
        }
     }
     return getDeleteDersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersListRequest,
      com.bilgeadam.grpc.DersListResponse> getListDersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDers",
      requestType = com.bilgeadam.grpc.DersListRequest.class,
      responseType = com.bilgeadam.grpc.DersListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersListRequest,
      com.bilgeadam.grpc.DersListResponse> getListDersMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.DersListRequest, com.bilgeadam.grpc.DersListResponse> getListDersMethod;
    if ((getListDersMethod = OperationServiceGrpc.getListDersMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getListDersMethod = OperationServiceGrpc.getListDersMethod) == null) {
          OperationServiceGrpc.getListDersMethod = getListDersMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.DersListRequest, com.bilgeadam.grpc.DersListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "ListDers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.DersListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.DersListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("ListDers"))
                  .build();
          }
        }
     }
     return getListDersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersListRequest,
      com.bilgeadam.grpc.OgrenciDersListResponse> getListOgrenciDersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOgrenciDers",
      requestType = com.bilgeadam.grpc.OgrenciDersListRequest.class,
      responseType = com.bilgeadam.grpc.OgrenciDersListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersListRequest,
      com.bilgeadam.grpc.OgrenciDersListResponse> getListOgrenciDersMethod() {
    io.grpc.MethodDescriptor<com.bilgeadam.grpc.OgrenciDersListRequest, com.bilgeadam.grpc.OgrenciDersListResponse> getListOgrenciDersMethod;
    if ((getListOgrenciDersMethod = OperationServiceGrpc.getListOgrenciDersMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getListOgrenciDersMethod = OperationServiceGrpc.getListOgrenciDersMethod) == null) {
          OperationServiceGrpc.getListOgrenciDersMethod = getListOgrenciDersMethod = 
              io.grpc.MethodDescriptor.<com.bilgeadam.grpc.OgrenciDersListRequest, com.bilgeadam.grpc.OgrenciDersListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OperationService", "ListOgrenciDers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDersListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bilgeadam.grpc.OgrenciDersListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("ListOgrenciDers"))
                  .build();
          }
        }
     }
     return getListOgrenciDersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationServiceStub newStub(io.grpc.Channel channel) {
    return new OperationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OperationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OperationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OperationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setOgrenci(com.bilgeadam.grpc.OgrenciInsertRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciInsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOgrenciMethod(), responseObserver);
    }

    /**
     */
    public void updateOgrenci(com.bilgeadam.grpc.OgrenciUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOgrenciMethod(), responseObserver);
    }

    /**
     */
    public void updateOgrenciDers(com.bilgeadam.grpc.OgrenciDersUpdateAddRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersUpdateAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOgrenciDersMethod(), responseObserver);
    }

    /**
     */
    public void emptyOgrenciDers(com.bilgeadam.grpc.OgrenciDersUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyOgrenciDersMethod(), responseObserver);
    }

    /**
     */
    public void deleteOgrenci(com.bilgeadam.grpc.OgrenciDeleteRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOgrenciMethod(), responseObserver);
    }

    /**
     */
    public void listOgrenci(com.bilgeadam.grpc.OgrenciListRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOgrenciMethod(), responseObserver);
    }

    /**
     */
    public void ogrenciGetById(com.bilgeadam.grpc.OgrenciGetByIdRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciGetByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOgrenciGetByIdMethod(), responseObserver);
    }

    /**
     */
    public void setDers(com.bilgeadam.grpc.DersInsertRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersInsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDersMethod(), responseObserver);
    }

    /**
     */
    public void deleteDers(com.bilgeadam.grpc.DersDeleteRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDersMethod(), responseObserver);
    }

    /**
     */
    public void listDers(com.bilgeadam.grpc.DersListRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDersMethod(), responseObserver);
    }

    /**
     */
    public void listOgrenciDers(com.bilgeadam.grpc.OgrenciDersListRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOgrenciDersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetOgrenciMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciInsertRequest,
                com.bilgeadam.grpc.OgrenciInsertResponse>(
                  this, METHODID_SET_OGRENCI)))
          .addMethod(
            getUpdateOgrenciMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciUpdateRequest,
                com.bilgeadam.grpc.OgrenciUpdateResponse>(
                  this, METHODID_UPDATE_OGRENCI)))
          .addMethod(
            getUpdateOgrenciDersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciDersUpdateAddRequest,
                com.bilgeadam.grpc.OgrenciDersUpdateAddResponse>(
                  this, METHODID_UPDATE_OGRENCI_DERS)))
          .addMethod(
            getEmptyOgrenciDersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciDersUpdateRequest,
                com.bilgeadam.grpc.OgrenciDersUpdateResponse>(
                  this, METHODID_EMPTY_OGRENCI_DERS)))
          .addMethod(
            getDeleteOgrenciMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciDeleteRequest,
                com.bilgeadam.grpc.OgrenciDeleteResponse>(
                  this, METHODID_DELETE_OGRENCI)))
          .addMethod(
            getListOgrenciMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciListRequest,
                com.bilgeadam.grpc.OgrenciListResponse>(
                  this, METHODID_LIST_OGRENCI)))
          .addMethod(
            getOgrenciGetByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciGetByIdRequest,
                com.bilgeadam.grpc.OgrenciGetByIdResponse>(
                  this, METHODID_OGRENCI_GET_BY_ID)))
          .addMethod(
            getSetDersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.DersInsertRequest,
                com.bilgeadam.grpc.DersInsertResponse>(
                  this, METHODID_SET_DERS)))
          .addMethod(
            getDeleteDersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.DersDeleteRequest,
                com.bilgeadam.grpc.DersDeleteResponse>(
                  this, METHODID_DELETE_DERS)))
          .addMethod(
            getListDersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.DersListRequest,
                com.bilgeadam.grpc.DersListResponse>(
                  this, METHODID_LIST_DERS)))
          .addMethod(
            getListOgrenciDersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bilgeadam.grpc.OgrenciDersListRequest,
                com.bilgeadam.grpc.OgrenciDersListResponse>(
                  this, METHODID_LIST_OGRENCI_DERS)))
          .build();
    }
  }

  /**
   */
  public static final class OperationServiceStub extends io.grpc.stub.AbstractStub<OperationServiceStub> {
    private OperationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationServiceStub(channel, callOptions);
    }

    /**
     */
    public void setOgrenci(com.bilgeadam.grpc.OgrenciInsertRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciInsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOgrenciMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOgrenci(com.bilgeadam.grpc.OgrenciUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOgrenciMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOgrenciDers(com.bilgeadam.grpc.OgrenciDersUpdateAddRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersUpdateAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOgrenciDersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emptyOgrenciDers(com.bilgeadam.grpc.OgrenciDersUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyOgrenciDersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOgrenci(com.bilgeadam.grpc.OgrenciDeleteRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOgrenciMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOgrenci(com.bilgeadam.grpc.OgrenciListRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOgrenciMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ogrenciGetById(com.bilgeadam.grpc.OgrenciGetByIdRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciGetByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOgrenciGetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDers(com.bilgeadam.grpc.DersInsertRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersInsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDers(com.bilgeadam.grpc.DersDeleteRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDers(com.bilgeadam.grpc.DersListRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOgrenciDers(com.bilgeadam.grpc.OgrenciDersListRequest request,
        io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOgrenciDersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OperationServiceBlockingStub extends io.grpc.stub.AbstractStub<OperationServiceBlockingStub> {
    private OperationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciInsertResponse setOgrenci(com.bilgeadam.grpc.OgrenciInsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetOgrenciMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciUpdateResponse updateOgrenci(com.bilgeadam.grpc.OgrenciUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOgrenciMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciDersUpdateAddResponse updateOgrenciDers(com.bilgeadam.grpc.OgrenciDersUpdateAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOgrenciDersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciDersUpdateResponse emptyOgrenciDers(com.bilgeadam.grpc.OgrenciDersUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmptyOgrenciDersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciDeleteResponse deleteOgrenci(com.bilgeadam.grpc.OgrenciDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOgrenciMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciListResponse listOgrenci(com.bilgeadam.grpc.OgrenciListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOgrenciMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciGetByIdResponse ogrenciGetById(com.bilgeadam.grpc.OgrenciGetByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getOgrenciGetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.DersInsertResponse setDers(com.bilgeadam.grpc.DersInsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetDersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.DersDeleteResponse deleteDers(com.bilgeadam.grpc.DersDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.DersListResponse listDers(com.bilgeadam.grpc.DersListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bilgeadam.grpc.OgrenciDersListResponse listOgrenciDers(com.bilgeadam.grpc.OgrenciDersListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOgrenciDersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OperationServiceFutureStub extends io.grpc.stub.AbstractStub<OperationServiceFutureStub> {
    private OperationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciInsertResponse> setOgrenci(
        com.bilgeadam.grpc.OgrenciInsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOgrenciMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciUpdateResponse> updateOgrenci(
        com.bilgeadam.grpc.OgrenciUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOgrenciMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciDersUpdateAddResponse> updateOgrenciDers(
        com.bilgeadam.grpc.OgrenciDersUpdateAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOgrenciDersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciDersUpdateResponse> emptyOgrenciDers(
        com.bilgeadam.grpc.OgrenciDersUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyOgrenciDersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciDeleteResponse> deleteOgrenci(
        com.bilgeadam.grpc.OgrenciDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOgrenciMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciListResponse> listOgrenci(
        com.bilgeadam.grpc.OgrenciListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOgrenciMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciGetByIdResponse> ogrenciGetById(
        com.bilgeadam.grpc.OgrenciGetByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOgrenciGetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.DersInsertResponse> setDers(
        com.bilgeadam.grpc.DersInsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.DersDeleteResponse> deleteDers(
        com.bilgeadam.grpc.DersDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.DersListResponse> listDers(
        com.bilgeadam.grpc.DersListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bilgeadam.grpc.OgrenciDersListResponse> listOgrenciDers(
        com.bilgeadam.grpc.OgrenciDersListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOgrenciDersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_OGRENCI = 0;
  private static final int METHODID_UPDATE_OGRENCI = 1;
  private static final int METHODID_UPDATE_OGRENCI_DERS = 2;
  private static final int METHODID_EMPTY_OGRENCI_DERS = 3;
  private static final int METHODID_DELETE_OGRENCI = 4;
  private static final int METHODID_LIST_OGRENCI = 5;
  private static final int METHODID_OGRENCI_GET_BY_ID = 6;
  private static final int METHODID_SET_DERS = 7;
  private static final int METHODID_DELETE_DERS = 8;
  private static final int METHODID_LIST_DERS = 9;
  private static final int METHODID_LIST_OGRENCI_DERS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_OGRENCI:
          serviceImpl.setOgrenci((com.bilgeadam.grpc.OgrenciInsertRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciInsertResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OGRENCI:
          serviceImpl.updateOgrenci((com.bilgeadam.grpc.OgrenciUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciUpdateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OGRENCI_DERS:
          serviceImpl.updateOgrenciDers((com.bilgeadam.grpc.OgrenciDersUpdateAddRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersUpdateAddResponse>) responseObserver);
          break;
        case METHODID_EMPTY_OGRENCI_DERS:
          serviceImpl.emptyOgrenciDers((com.bilgeadam.grpc.OgrenciDersUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_OGRENCI:
          serviceImpl.deleteOgrenci((com.bilgeadam.grpc.OgrenciDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_OGRENCI:
          serviceImpl.listOgrenci((com.bilgeadam.grpc.OgrenciListRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciListResponse>) responseObserver);
          break;
        case METHODID_OGRENCI_GET_BY_ID:
          serviceImpl.ogrenciGetById((com.bilgeadam.grpc.OgrenciGetByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciGetByIdResponse>) responseObserver);
          break;
        case METHODID_SET_DERS:
          serviceImpl.setDers((com.bilgeadam.grpc.DersInsertRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersInsertResponse>) responseObserver);
          break;
        case METHODID_DELETE_DERS:
          serviceImpl.deleteDers((com.bilgeadam.grpc.DersDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_DERS:
          serviceImpl.listDers((com.bilgeadam.grpc.DersListRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.DersListResponse>) responseObserver);
          break;
        case METHODID_LIST_OGRENCI_DERS:
          serviceImpl.listOgrenciDers((com.bilgeadam.grpc.OgrenciDersListRequest) request,
              (io.grpc.stub.StreamObserver<com.bilgeadam.grpc.OgrenciDersListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bilgeadam.grpc.OgrenciDersOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperationService");
    }
  }

  private static final class OperationServiceFileDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier {
    OperationServiceFileDescriptorSupplier() {}
  }

  private static final class OperationServiceMethodDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OperationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OperationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationServiceFileDescriptorSupplier())
              .addMethod(getSetOgrenciMethod())
              .addMethod(getUpdateOgrenciMethod())
              .addMethod(getUpdateOgrenciDersMethod())
              .addMethod(getEmptyOgrenciDersMethod())
              .addMethod(getDeleteOgrenciMethod())
              .addMethod(getListOgrenciMethod())
              .addMethod(getOgrenciGetByIdMethod())
              .addMethod(getSetDersMethod())
              .addMethod(getDeleteDersMethod())
              .addMethod(getListDersMethod())
              .addMethod(getListOgrenciDersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
