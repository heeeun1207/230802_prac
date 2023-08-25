## Eclipse 2023-6

#### server에서 apache 가 없는 문제 해결

**Eclipse IDE for Enterprise Java and Web Developers** 의 **macOS x86_64** 를 클릭
<br>
(Eclipse IDE for Java Developers 로 설치하면 Server 또는 Web 이 없다.)
<br>
수동으로 추가하고 싶으면, Help-> install new software -> work with 추가하기

## 순서

1. Dynamic Web Project 생성
   <br>
2. Projcet Facet 확인
   <br>
   (1)Properties > Project Facet에 들어가서 Java 버전 확인
   <br>
   (2)오른쪽 Runtimes에서 Tomcat이 체크되어 있는지 확인
   <br>
   3.run on server
   <br>
   (문제시 : Window > Preferences > Server > Runtime Environment 확인)

# 시도한 것

1.  JSP 파일을 Apache Tomcat 웹 애플리케이션에 배포하고, 브라우저를 통해 접근하여 실행하기
    <br>
2.  이클립스 통합 개발 환경(IDE)으로, Tomcat 서버와 연동해서 실행하기

## 설치버전

https://tomcat.apache.org/download-90.cgi
<br>
apache-tomcat-9.0.78
<br>
<br>
https://www.eclipse.org/downloads/packages/
<br>
eclipse-jee-2023-06-R-macosx-cocoa-x86_64.dmg
<br>
(Eclipse IDE for Enterprise Java and Web Developers)

---

여기서 잠깐! 🤚🏻 바탕화면에 생긴 **Eclipse** 을 없애고 싶다면
<br>
**마우스오른쪽 > 'Eclipse' 추출** 을 클릭하여 추출하기.

---
