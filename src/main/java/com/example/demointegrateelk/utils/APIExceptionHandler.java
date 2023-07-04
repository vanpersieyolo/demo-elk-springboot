package com.example.demointegrateelk.utils;

import com.example.demointegrateelk.dto.ExceptionResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class APIExceptionHandler {
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ExceptionResponse> exceptionHandler(HttpServletRequest request, CustomException e) {
        ExceptionResponse error = new ExceptionResponse(
                MessageError.SERVER_ERROR.getCode(), MessageError.SERVER_ERROR.getMsg(), e.getMsg());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }
}
