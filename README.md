# Project Setting
<ul>
  <li> JDK 11 </li>
  <li> Java 11 </li>
  <li> Spring Boot 2.7.9 </li>
  <li> JPA & MyBatis </li>
  <li> Thymeleaf </li>
  <li> Gradle-kotlin </li>
  <li> MySQL </li>
</ul>

<h2> JPA </h2>
<img src="https://user-images.githubusercontent.com/96382179/221764930-478b6776-7e0b-43a1-beca-34a1fda7f358.png"/>
<ul>
  <li>자바 어플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스</li>
  <li>인터페이스 이기 때문에 Hibernate, OpenJPA 등이 JPA를 구현</li>
  <li>SQL이 아닌 객체 중심으로 개발할 수 있어 생산성이 증가하고 유지보수가 수월</li>
  </ul>

<h2> Mybatis </h2>
<img src="https://user-images.githubusercontent.com/96382179/221769559-6ae21d2b-42ba-48a9-a283-3d9990b6f66a.png"/>
<ul>
  <li>자바 오브젝트와 SQL문 사이의 자동 Mapping 기능을 지원하는 ORM 프레임워크</li>
  <li>SQL을 별도의 파일로 분리해서 관리하며 객체-SQL 사이의 파라미터 Mappng 작업을 자동으로 해줌</li>
  <li>도메인 객체나 VO 객체를 중심으로 개발이 가능</li>
</ul>

<h2> Thymeleaf </h2>
<img src="https://user-images.githubusercontent.com/96382179/221768510-b0c5da66-7f0f-4b0b-a444-ff64e08bb7e1.png">
<ul>
  <li>html태그를 기반으로하여 th:속성을 이용하여 동적인 View를 제공</li>
  <li>
    <table>
      <th>표현</th>
      <th>설명</th>
      <th>예제</th>
      <tr>
        <td>@{ ... }</td>
        <td>@{ URL 링크 표현식 }</td>
        <td>th:href="@{/css/boostrap.min.css}"<br>th:href="@{/{itemId}/edit(itemId=${item.id})}"</td>
      </tr>
      <tr>
        <td>| ... |</td>
        <td>리터럴 대체</td>
        <td>th:text="|Hi ${user.name}!|"<br>(= th:text="'Hi '+${user.name}+'!'"</td>
      </tr>
      <tr>
        <td>${ ... }</td>
        <td>변수</td>
        <td>th:text=${user.name}</td>
      </tr>
      <tr>
        <td>th:each</td>
        <td>반복 출력</td>
        <td>
          <div th:each="item: ${items}">
            <span th:text="${item.price}">100</span>
          </div>
        </td>
      </tr>
      <tr>
        <td>*{ ... }</td>
        <td>선택 변수</td>
        <td>	
            <div th:object="${items}">
              <span th:text="*{price}">100</span>
            </div>
        </td>
      </tr>
      <tr>
        <td>#{ ... }</td>
        <td>메시지. properties 같은 외부 자원에서 코드에 해당하는 문자열 get.</td>
        <td>th:text="#{member.register}"</td>
      </tr>
    </table>
  </li>
</ul>

<h2> Gradle - kotlin </h2>
<img src="https://user-images.githubusercontent.com/96382179/221769624-bdef03ce-59de-4622-84b7-7d5a77360fd3.png"/>
<ul>
  <li>오픈소스 빌드도구</li>
  <li>모든 문자열을 큰따옴표(")로 작성하는 규칙이 있음</li>
  <li>코드 자동완성, 오류코드 강조, 빠른 문서보기 가능과 리팩터링의 장점</li>
<ul>

<h2> mySQL </h2>
<img src="https://user-images.githubusercontent.com/96382179/221769782-9d49cf69-33b9-4a5f-b67e-b634ad113ecb.png">
