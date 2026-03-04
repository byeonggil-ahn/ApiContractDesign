package apicontractdesign.dto;

/*
 DTO(Data Transfer Object)
 - 외부 요청 데이터를 전달하기 위한 객체
 - Controller ↔ Service 사이에서 사용
*/
public class UserRequestDto {


private String name;


public String getName() {
return name;
}
}