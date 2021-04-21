# RX Java 시작하기 



Hello RxJava 2

```java
import java.util.Observable;

public class RxJava {
    public class FirstExample {
        public void emit() {
            Observable.just("Hello", "RxJava 2!!")
                    .subscrible(System.out::println);
        }

        public static void main(String args[]) {
            FirstExample demo = new FirstExample();
            demo.emit();
        }
    }
}

```



실행결과

```java
Hello
RxJava 2!!  
```





+ ## Observable 클래스

  Observable 클래스는 데이터의 변화가 발생하는 데이터 소스 입니다. 여기서는 Observable 에서 시작한다는 사실만 기억하세요 !





+ # just()

  Observable 클래스의  just() 함수는 가장 단순한 Observable 선언 방식 입니다. 위 예시에는 데이터 소스에서 'Hello' 와 'RxJava 2!!' 를 발행하였습니다. Integer 와 같은 래퍼 타입부터 Order 같은 사용자 정의 클래스의 객체도 인자에 넣을 수 있습니다.



+ # Subscribe() 함수

  Subscribe () 함수는 Observer을 구독합니다. Observer은 subscribe() 함수를 호출해야 비로소 변화한 데이터를 구독자에게 발행합니다. Just() 함수만 호출하면 데이터를 발행하지 않습니다. 이 부분은 오서버 패턴과 동일하다고 생각하면 됩니다. 반드시 데이터를 수신할 구독자가 subscribe() 함수를 호출해서 Observable 에서 데이터가 발행됩니다.



+ # System.out::println

  수신한 데이터를 System.out.println을 통해 호출했습니다. System.out::println 부분은 자바 8의 메서드 레퍼런스를 활용했습니다. 만약 메서드 레퍼런스를 사용하지 않으면 data -> System.our.println(data)와 동일합니다. Observable 이 발행하는 데이터는 data 인자로 들어옵니다.

  

+ # emit() 메서드

  마지막은 emit() 은 우리가 만든 메서드 입니다. 