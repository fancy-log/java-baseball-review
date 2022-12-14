# 🚀미션 - 숫자 야구

### 💙구현 목표

- 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

### 📜구현 동작

1. 게임 시작 문구 출력한다.
2. 0이 아닌 서로 다른 3자리 수를 입력한다.
3. 상대방(컴퓨터)와 비교하여 결과를 출력한다.
4. 3개의 숫자가 모두 맞힐 때까지 반복한다.
5. 3개의 숫자를 모두 맞힐 경우, 결과를 출력하고 재시작 여부를 출력한다.
6. 재시작을 선택하면 2번으로 가고, 종료를 선택하면 종료된다.

---

## 🔍구현 로직

- ### Main diagram

- [x] BaseballGame : Controller 역할

- ### Model diagram

- [x] Baseball : 사용자 및 컴퓨터 데이터 갱신 및 값을 비교하는 역할
- [x] BaseballGameResult : 숫자 야구 게임 결과를 알려주는 역할
- [x] BaseballMaker : 서로 다른 3개의 숫자를 ArrayList 에 담아주는 역할
- [x] BaseballNumberGenerator : BaseballRandomNumberGenerator 의 인터페이스 역할
- [x] BaseballRandomNumberGenerator : Random 값을 추출하는 역할

- ### Util diagram

- [x] Validate : 유효 검사
- [x] ErrorMessage : 에러 메세지

- ### View diagram

- [x] InputView : 입력 부분
- [x] OutputView : 출력 부분

---

## ✅ 기능 목록 checkList

- [x] 1.게임 시작 문구 출력한다.
- [x] 2.0이 아닌 서로 다른 3자리 수를 입력한다.
- [x] 3.상대방(컴퓨터)와 비교하여 결과를 출력한다.
    - [x] 같은 자리에 있으면 스트라이크
    - [x] 다른 자리에 있으면 볼
    - [x] 아예 없으면 낫싱
- [x] 4.3개의 숫자가 모두 맞힐 때까지 반복한다.
- [x] 5.3개의 숫자를 모두 맞힐 경우, 결과를 출력하고 재시작 여부를 출력한다.
    - [x] 재시작(1)을 입력하면 2번으로 이동한다.
    - [x] 종료(2)를 입력하면 게임이 종료된다.

## ✅ 예외 처리

- [x] 0이 아닌 서로 다른 3자리 수가 아닌 경우
- [x] 재시작 또는 종료 이외의 다른 숫자를 입력한 경우

## ✅ 테스트 기능 목록
