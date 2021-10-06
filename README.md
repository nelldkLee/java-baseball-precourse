# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

- [x] 플레이어는 3자리 숫자를 입력한다.
    - [x] 1~9까지의 숫자의 유효성을 체크한다.
    - [ ] 숫자가 중복되어 있지 않은지 체크한다.
    - [ ] 잘못된 값을 입력 시, [ERROR]로 시작하는 에러메세지를 출력한다.
    - [ ] ERROR 메세지 출력 후 게임을 계속 진행할 수 있게한다.
- [ ] 컴퓨터는 1~9까지의 서로 다른 임의의 수 3개를 선택한다.
- [ ] 플레이어와 컴퓨터 간의 두 수를 비교한다.(게임)
  - [ ] 위치와 숫자가 모두 맞은 개수를 판단한다.(스트라이크)
  - [ ] 숫자만 맞은 개수를 판단한다.(볼)
  - [ ] 같은 수가 전혀 없는지 판단한다.(낫싱)
  - [ ] 비교 결과를 출력한다.
- [ ] 게임을 반복하도록 한다.
  - [ ] 3개의 숫자를 모두 맞추면 게임이 종료된다.
- [ ] 게임을 종료한 후에 다시 시작하거나 완전 종료할 수 있다.
