Build a calculator

== 필수 기능 ==

Lv 1

- 양의 정수를 입력받기 (2개)
- 사칙연산 기호를 입력받기
- 입력값을 사용해서 연산을 수행하고, 결과값을 출력하기
- exit을 누르면 프로그램 종료

Lv 2

- Calculator 클래스 생성
  1. 연산을 수행하는 메서드 구현
  2. 연산 결과를 저장하는 컬렉션 타입 변수 생성 [History라고 하자.]
  3. Main에서 History에 직접 접근해 필드를 수정하지 못하게 변경, 간접적으로 접근할 수 있도록 Getter와 Setter Calculator 내부에 생성하기
  4. History에 저장된 데이터를 삭제하는 메서드 생성


== 도전 기능 ==

Lv 3

- Enum 객체 도입
  > 4가지 연산은 한정되어 있으므로, Enum 타입을 사용해서 연산자 값으로 들어올 입력값을 보다 정교하게 한정지을 수 있음
- 실수 값을 전달 받아도 연산이 가능
- 예외 처리

Full class diagram
https://private-user-images.githubusercontent.com/178546020/365411866-9836dfa2-3684-4f95-b536-caae2963497b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjU3NjU3OTAsIm5iZiI6MTcyNTc2NTQ5MCwicGF0aCI6Ii8xNzg1NDYwMjAvMzY1NDExODY2LTk4MzZkZmEyLTM2ODQtNGY5NS1iNTM2LWNhYWUyOTYzNDk3Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTA4JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwOFQwMzE4MTBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04Nzk5MTg2ZjNlNTEyZTcyOTU1ZTg3N2M1YzQzY2M1NmU2MmU4YThmODE1NGY1NTYyMzM1YzY4NWU1MzU3OTk2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.xEe93DvDy_M0I6F630OvNClJfNcoSyATrlQJZBlhEZY
