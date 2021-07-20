# Observer 클래스



**Observable** 은 데이터 흐름에 맞게 알림을 보내 구독자가 데이터를 처리할 수 있도록 한다. 

RxJava 1x에서는 데이터 소스를 Observable과 Single 클래스로 구성했었다. 하지만 RxJava 2.x 부터 Observable도 상황에 맞게 세분화하여 각각 Observable,Maybe,Flowable 클래스로 구분하여 사용한다.

Observable은 옵서버 패턴을 구현한다.

옵서버 패턴은 객체의 상태 변화를 **관찰** 하는 **관찰자** 목록을 객체에 등록한다.

상태 변화가 있으면 메서드를 호출하여 객체가 직접 목록의 각 옵서버에게 변화를 알려준다.

라이프사이클은 존재하지 않으며 보통 단일 함수를 통해 변화만을 알린다.



Observable 클래스에는 Observable을 생성하는 팩토리 함수, 중간 결과를 처리하는 함수, 디버그 및 예외 처리 함수가 모두 포함되어 있습니다. 따라서 많은 함수가 존재한다.

Observable을 생성할 때는 직접 인스턴스를 만들지 않고 정적 팩토리 함수를 호출합니다. 다양한 함수가 있으며 아래 표 처럼 구분할 수 있다.

| 팩토리함수                                 | 함수                                                         |
| ------------------------------------------ | ------------------------------------------------------------ |
| RxJava 1.x 기본 팩토리 함수                | Create(), just(), from()                                     |
| RxJava 2.x 추가 팩토리 함수(from() 세분화) | fromArray(), fromIterable(), fromCallable(), fromFuture,fromPublisher() |
| 기타 팩토리 함수                           | interval(), range(), timer(), defer() 등                     |

+ ## just() 함수

  > 데이터를 발행

  just() 함수는 인자로 넣은 데이터를 발행하고 Observable을 생성한다.(실제 데이터의 발행은 subscrible() 함수를 호출해야 시작한다.) 한 개의 값을 넣을 수도 있고 인자로 여러 개의 값을 넣을 수도 있다. 하지만 타입은 모두 같아야 한다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile21.uf.tistory.com%2Fimage%2F991E454C5CB7C8A505DFCC)



>  인자가 6개인 just() 함수와 인자

```java
public class FirstExample{
  public void emit(){
    Observable.just(1,2,3,4,5,6)
      .subscribe(System.out::println);
  }
  ....
}
// 출력 결과 
//1
//2
//3
//4
//5
//6
```

