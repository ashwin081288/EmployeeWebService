///*
//package com.durvisha.exception.handler;
//
//import com.durvisha.exception.AimException;
//import com.durvisha.exception.EmployeeFailureException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//
//import java.util.Date;
//
//@RestControllerAdvice
//
//public class EmployeeFailureExceptionHandler {
//
//    @ExceptionHandler(value = {EmployeeFailureException.class})
//    @ResponseStatus(value = HttpStatus.NOT_FOUND)
//    public ResponseEntity<AimException> employeeNotFoundException(EmployeeFailureException ex, WebRequest request) {
//        AimException aimException = AimException.builder().statusCode(HttpStatus.NOT_FOUND.value()).timestamp(new Date()).message(ex.getMessage()).description(request.getDescription(false)).build();
//        return new ResponseEntity<>(aimException, HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResponseEntity<AimException> globalExceptionHandler(Exception ex, WebRequest request) {
//        AimException aimException = AimException.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).timestamp(new Date()).message(ex.getMessage()).description(request.getDescription(false)).build();
//        return new ResponseEntity<>(aimException, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
//
//*/
