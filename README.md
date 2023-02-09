# 3조 캠핑카 프로젝트 깃허브
- Push전엔 뭐다? Upstream Pull, Cach Clear를 한다!
- 스프링 프로젝트 같은 경우 각종 잡다한 파일이 딸려 올라올 수 있으므로 Push전에 터미널로 캐시 삭제 할 것.
- 이와 관련해 이그노어를 중간에 하게되면 캐시가 꼬일 수 있기때문에 수정 후엔 따로 알리겠음.
- 언제 터질지 모르기때문에 백업을 생활화하자!


맡은 역활

1. 로그인 / 로그아웃
2. 회원가입 / 회원탈퇴
3. 회원정보 리스트 / 회원정보 상세 보기
4. 관리자 기능 - 회원 강제 탈퇴 / 회원 정보 수정 / 회원목록조회

2023 - 01 - 16 ~ 2023 - 01 - 20
1. 환경 설정과 팀 프로젝트 회의
2. 자바스크립트와 jquery 공부

↳ 느낀점 : 기획이 개발 시 많은 비중을 차지하는 것을 새삼 느꼈다. 개발 시 스크립트 처리할 게 많아서 자바스크립트와 jquery를 공부 

2023 - 01 - 25
1.유저 회원가입에 필요한 데이터베이스 설계(My Sql)
↳ 느낀점 : 데이터베이스 설계가 너무나도 중요한 걸 알았다. 한번 설계가 잘못되면 개발 시 매우 복잡해진다.

2023 - 01 - 26
1. 기능 구현시 오류 발생으로 인한 오류 수정
2. 컨트롤러 매퍼 작업
↳ 1. 느낀점 : 오류가 나면 콘솔 창을 보자 오타와 url 매핑의 문제가 매우 많았다. 오류와의 싸움

2023 - 01 - 27
1. 로그인 / 로그아웃 (세션처리)
2. 회원가입 / 회원탈퇴 기능구현
3. 회원정보 리스트 / 회원정보 상세보기 밑 수정
4. 회원 정보 리스트 페이징 처리 / 회원 정보 검색 처리
5. 카카오 주소 api 사용
6. Github 공부
↳ 1. 느낀점 : 맡은 부분에 대한 기능 개발을 끝냈다. 로그인 세션 처리에서 시간을 많이 잡아먹었지만 구글링과 스택오버플로를 활용해 세션 처리 구현을 하였다.
  2. 느낀점 : 페이징 처리와 검색에서 많은 시간이 걸렸다. 책과 구글링을 해도 감이 오는 경우가 없어서 겨우겨우 작업을 끝냈다. 다시 한번 공부가 더 필요한 걸 깨달은 날.
  3. 느낀점 : 깃허브 진짜 너무 어렵다. 

2023 - 01 - 30
1. 회원정보 수정 / 회원정보 강제 수정 기능 추가
2. 아이디 중복체크 비동기 처리(ajax)
3. 비밀번호 중복 체크 스크립트 기능구현
↳ 1. 느낀점 : 관리자 페이지에서 회원의 정보를 수정하거나 탈퇴 시킬 수 있는 기능을 구현하였다.
  2. 느낀점 : 회원가입 시 ajax를 활용하여 아이디 중복체크를 처리 기능을 추가. ajax를 자연스레 공부하게 되었지만 아직까지 더 써봐야 할 거 같다.
  3. 느낀점 : 비밀번호 중복 체크 스크립트 기능 구현. 간단한 if 문을 사용해서 비밀번호 체크 스크립트 추가

2023 - 01 - 31
1. 핸드폰 번호 입력시 '-'(하이픈)이 자동으로 입력되는 스크립트 추가.
2. 이메일 인증 구현예정( 2월 초 ~ 중) 까지 마무리 예정
3. 자바스크립트 공부(팀프로젝트 하는도중 틈틈히)
↳ 1. 느낀점 : 원래 핸드폰 번호를 00012345678식으로 입력했지만 정규식을 활용한 자동 하이픈(-) 추가 스크립트 처리를 했다.
  2. 느낀점 : 이메일 인증 구현은 아직 하지못했다. 
  3. 느낀점 : 자바스크립트 공부는 꾸준히 하고있는중.

2023 - 02 - 01 ~ 03
1. git 소스트리 셋팅설정 ( 터지고 터지고 터지는 생활 )
↳ 1. 느낀점 : 진짜 엄청나게 터졌다 연결하고 터지고 연결하고 터지고 연결하고 터지고 다시 처음으로 돌아가서 터지고 다시 연결하고 터지고
제대로 연결했지만 역시 초기설정이 가장 힘들고 어려운 거 같다. 막상 사용하고 익숙해지면 편한데..

2023 - 02 - 06 ~ 09
1. 조원들 작업물 병합 컨트롤러 url 작업.
2. css DB DTO 변경
3. 자바스크립트와 jquery공부(진행중)
↳ 1. 느낀점 : 조원들의 작업물이 슬슬 깃허브에 올라와서 병합하고 url이나 자잘한 경로설정 컨트롤러 설정을 다시 했다. 그 과정 중에 서로 뭔가 이상하거나 잘못된 부분은 빠르게 피드백
              해서 프로젝트 작업물의 퀄리티와 협업 능력이 무엇인가에 무엇인지 잘 알게 되었다.
  2. 느낀점 : 부트스트랩과 jsp의 css 우선순위 자잘한 DB와 DTO의 변경( 비밀번호를 int로 했지만 다시 생각해 보니 문자도 들어가야 해서 String으로 바꿈)
              다시 DB 설계가 왜 중요한지 알게 되었다.
  3. 느낀점 : 자바스크립트와 jquery는 꾸준하게 공부 중 react를 활용하여 자신만의 홈페이지 or 쇼핑몰 or 개인적으로 관심 있던 것 중 하나를 만들 예정. (2월 중 ~ 3월 중)
              react를 공부하면 스프링과 연동도 가능하고 node.js도 활용이 가능하기에 리액트를 공부할 예정.

