package apicontractdesign.exception;



/*
 BusinessException
 - 비즈니스 로직에서 발생하는 예외
 - RuntimeException을 상속하여 트랜잭션 롤백 대상
*/
public class BusinessException extends RuntimeException {


private final ErrorCode errorCode;


public BusinessException(ErrorCode errorCode) {
super(errorCode.getMessage());
this.errorCode = errorCode;
}


public ErrorCode getErrorCode() {
return errorCode;
}
}
