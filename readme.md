## 이클립스 버전

2023-6 으로 2308파일 작업

---

### Spring Legacy Project Spring MVC Project 없음 현상

해결법1. Configure Template 선택해서 pring-defaults를 제외한 2개를 지워보기 X <br>
해결법2. STS 설치할 때 Spring Tools4를 설치한 뒤에 Tools 3 Add-On을 설치해보기 X <br>
해결법3. 2020-6버전으로 변경하고, Spring Tools 3(Standalone Edition) 설치하기 O

---

### H2 데이터베이스 구축

---

### 예외

| 예외 종류                 | 상황                                        |
| ------------------------- | ------------------------------------------- |
| IllegalArgumentException  | 매개변수가 의도하지 않은 상황을 유발시킬 때 |
| IllegalStateException     | 메소드를 호출하기 위한 상태가 아닐 때       |
| NullPointerException      | 매개 변수 값이 null 일 때                   |
| IndexOutOfBoundsException | 인덱스 매개 변수 값이 범위를 벗어날 때      |
| ArithmeticException       | 산술적인 연산에 오류가 있을 때              |

### 예외 목록

![예외 목록](ExceptionList.png)
<br>
![unchecked](unchecked.png)

- checked 예외<br>
  - RuntimeException을 제외한 Exception의 하위 클래스<br>
- unchekced 예외<br>
  - RuntimeException의 하위 클래스 => 예외 처리 필수 ((ex)IOException)

---

### error: JavaFX 응용 프로그램 클래스는 javafx.application.Application을(를) 확장해야 합니다.

이유는 단순히 저장을 안해서 그런거였다.
<br>
저장(Ctrl+S)을 하고 다시 누르니 실행이 된다. 기록!
