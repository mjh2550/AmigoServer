# 학업 관리 시스템 Amigo(아미고)
2022.06.08 ~

## 개발 목적
- 더 편리한 안심 등/하교(원)과 교육기관 간 원할한 소통이 가능하고 편리한 성적 및 오답 분석이 가능한 시스템 개발

## 개발 팀원
* 문지홍 , 문호환

## 개발 환경
* Spring ,Spring-boot,thymeleaf , MyBatis, MysqlDB

## 개발화면
* 카카오 오븐
https://ovenapp.io/project/8VLloFfY8LWY3XB2WGvSyxI9nuTWraeJ#XJcq9l


## 개발 내용

교사/ 학생(부모) 구분
mobile/web 구분

* 학생(부모)

  * Mobile
    - 편리한 출결 관리(자동 출석)
    - 게시판
    - 교육 시스템( 단어장 ,시험문제 풀이, 오답문제 리마인드 시스템 등)  (추후 추가 예정)
    - Qna Chat Bot, 채팅 상담 (추후 추가 예정)

  * Web
    - 게시판
    - 교육 시스템( 단어장 ,시험문제 풀이, 오답문제 리마인드 시스템 등)  (추후 추가 예정)

* 교사

   * Mobile
      - 출결 모니터링
      - 메시지 송신 (추후 추가 예정)
      - 과제 피드백 (추후 추가 예정)
      - Qna Chat Bot, 채팅(추후 추가 예정)
    
    * Web
      - 출결 관리자 페이지
      - 메시지 송신 (추후 추가 예정)
      - 시험문제 출제/ 성적관리 페이지(추후 추가 예정)
      - 과제 관리 페이지 (추후 추가 예정)
      - 학생 관리 페이지 (추후 추가 예정)
      - Qna Chat Bot, 채팅(추후 추가 예정)
  



### Memo

* .



## PATH

### BACK_END
* CODE_PACKAGE : src/main/java/com/spring/amigo
* DB : oracle
* 화면
  * app
    - main , board, attend
  * web
    - main , board, attend 
  
* 경로
  * CODE_PACKAGE/*config : 설정
  * CODE_PACKAGE/model : db 데이터 모델, 레포지토리 
  * CODE_PACKAGE/web/* : web 비즈니스 로직
  * CODE_PACKAGE/mobile/* : mobile 비즈니스 로직
  

### FRONT_END
VIEW_PACKAGE : src/main/resource
* VIEW_PACKAGE/static/mobile/* : 모바일 view
* VIEW_PACKAGE/static/web/* : 웹 view
* VIEW_PACKAGE/static/layout : 레이아웃
* VIEW_PACKAGE/static/asset : 컴포넌트

### Reference
[Thymeleaf 핵심 기능](https://velog.io/@sungjin0757/Spring-MVC-Thymeleaf1-%EA%B8%B0%EB%B3%B8-%EA%B8%B0%EB%8A%A5)

[Thymeleaf ajax](https://chung-develop.tistory.com/8)

[JPA 쿼리문 작성하는법](https://jforj.tistory.com/90)

[Java 직렬화(Serializable) 란?](https://haranglog.tistory.com/4)
