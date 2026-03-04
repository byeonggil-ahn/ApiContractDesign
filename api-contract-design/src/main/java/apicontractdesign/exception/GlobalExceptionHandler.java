package apicontractdesign.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/*
 GlobalExceptionHandler
 - 모든 Controller에서 발생한 예외를 한 곳에서 처리
 - Controller를 try-catch로 더럽히지 않기 위함
*/
@RestControllerAdvice
public class GlobalExceptionHandler {


@ExceptionHandler(BusinessException.class)
public ResponseEntity<String> handleBusinessException(BusinessException e) {
return ResponseEntity
.status(HttpStatus.BAD_REQUEST)
.body(e.getMessage());
}


@ExceptionHandler(Exception.class)
public ResponseEntity<String> handleException(Exception e) {
return ResponseEntity
.status(HttpStatus.INTERNAL_SERVER_ERROR)
.body("서버 오류가 발생했습니다.");
}
}