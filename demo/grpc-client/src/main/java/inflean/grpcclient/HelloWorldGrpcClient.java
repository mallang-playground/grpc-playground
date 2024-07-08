package inflean.grpcclient;

import grpc.mallang.Helloworld.HelloReply;
import grpc.mallang.Helloworld.HelloRequest;
import grpc.mallang.MallangGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldGrpcClient implements CommandLineRunner {

  @GrpcClient("mallang-test")
  private MallangGrpc.MallangBlockingStub simpleStub;

  public String sendMessage(final String name) {
    try{
      HelloReply response = simpleStub.sayHello(HelloRequest.newBuilder().setName(name).build());
      return response.getMessage();
    } catch (StatusRuntimeException e) {
      return "FAILED with " + e.getStatus().getCode().name();
    }
  }

  @Override
  public void run(String... args) throws Exception {
    String mallang = sendMessage("mallang");
    System.out.println(mallang);
    String mallang22222222 = sendMessage("mallang22222222");
    System.out.println(mallang22222222);
  }
}
