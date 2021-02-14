## 코드 해석



```'''
import java.sql.DriverManager.println

typealias Observer<T> = (event:T) -> Unit
class EventSource<T>{

    private var observers = mutableListOf<Observer<T>>()


    fun addObserver(observer: Observer<T>) {
        observers.add(observer)
    }

    fun notify(event: T) {
        for(observer in observers) {
            observer.invoke(event)
        }
    }

}

fun main(){

    val eventSource = EventSource<String>()
    eventSource.addObserver { println("첫 번째 옵저버 : $it")}
    eventSource.addObserver { println("두 번째 옵저버 : $it")}
    eventSource.notify("Hello")
    eventSource.notify("Observer Pattern")
}
```



#### 실행결과

![실행결과](https://user-images.githubusercontent.com/43161981/81314723-6aeb0b80-90c4-11ea-821c-4613490437ec.png)



---------------



+ RxJava는 ReactiveX(Reactive Extensions)의 JVM 구현 입니다.

+ ###### Rx의 세가지 역할 

  + 생성자 : 데이터를 생산하여 전달
  + 소비자 : 데이터를 받아서 처리
  + 연산자 : 데이터를 중간에서 가공(생산, 변환, 조합, 거름) 처리



RxJava는 소비자가 생산자를 구독하는 형태로 만들어져 있습니다.



-->   *생산자를 데이터를 생산하고 통지하는 클래스이며, 소비자는 통지된 데이터를 전달받아 이 데이터를 처리합니다.*



#### 3가지 역할의 예시



```
Observable // 생산자
.just(0, 1, 2, 3) // 생산 연산자
.map { it * 2 } // 변경 연산자
.subscribe { // 소비자
    println(it)
}
```





이것들은 각각 다른 Scheduler에서 처리 할 수 있습니다.



--------



[ 참고 + 해석 ]



https://velog.io/@p4stel-dev/RxJava-%EC%A0%95%EB%A6%AC-1-Rxjava%EB%9E%80-

