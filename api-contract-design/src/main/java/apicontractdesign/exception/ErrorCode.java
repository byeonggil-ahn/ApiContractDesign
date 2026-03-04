package apicontractdesign.exception;

/*
 ErrorCode
 - 애플리케이션에서 사용하는 에러를 코드로 관리
 - 에러의 의미를 명확히 표현하기 위함
*/
public enum ErrorCode {


INVALID_USER_NAME("사용자 이름이 올바르지 않습니다."),
USER_NOT_FOUND("사용자를 찾을 수 없습니다.");


private final String message;


ErrorCode(String message) {
this.message = message;
}


public String getMessage() {
return message;
}
}