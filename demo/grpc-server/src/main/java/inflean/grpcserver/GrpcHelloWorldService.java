package inflean.grpcserver;

import grpc.mallang.Helloworld.HelloReply;
import grpc.mallang.Helloworld.HelloRequest;
import grpc.mallang.MallangGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;

@Service
@GRpcService
public class GrpcHelloWorldService extends MallangGrpc.MallangImplBase {

  @Override
  public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
    System.out.println("received request: " + request.getName());
    HelloReply reply = HelloReply.newBuilder()
        .setMessage("Hello ==> " + request.getName())
        .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
