package lk.ijse.pos.thogakadeapispring.advisor;

import lk.ijse.pos.thogakadeapispring.utill.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    public ResponseEntity handleException(RuntimeException exception){
        StandardResponse standardResponse = new StandardResponse(
                500,"Error",exception.getMessage()
        );
        return new ResponseEntity(standardResponse, HttpStatus.OK);
    }
}
