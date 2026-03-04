package apicontractdesign.domain;

/**
* Domain 계층
* - 비즈니스의 핵심 개념
* - DB 테이블과 1:1 매핑되는 객체
*/
public class User {


private Long id;
private String name;


public User(Long id, String name) {
this.id = id;
this.name = name;
}


public Long getId() {
return id;
}


public String getName() {
return name;
}
}