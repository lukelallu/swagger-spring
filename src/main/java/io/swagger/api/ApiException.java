package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:22:33.560Z")
class ApiException extends Exception{
    private int code;
    ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
