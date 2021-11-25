# 미션 - 숫자 야구 게임

---

## 🚀 어플리케이션 역할, 책임

- 숫자야구 게임을 진행한다.

---

## 🖇 객체들의 역할과 책임 그리고 협력

![](./image/diagram1.png)

---

## 🗒 구현해야하는 객체, 기능 목록

- 룰에 따라 게임 진행, 중단 하는 console interface 객체
    - 무작위 숫자를 생성해 저장, 게임 시작하기
    - 게이머에게 콘솔로 숫자를 입력 받기
    - checker 객체를 이용해서 검사 결과를 콘솔로 반환하기
    - 게이머에게 받은 숫자가 저장해 놓은 무작위 숫자와 같다면 게임 종료 & 다시 시작 여부 확인하기
- 볼, 스트라이크 개수를 검사 할 수 있는 checker 객체
    - 게이머의 숫자를 받아 볼, 스트라이크 개수를 판별하기
    - 볼, 스트라이크 개수로 게이머에게 반환할 결과 문자열을 만들기
