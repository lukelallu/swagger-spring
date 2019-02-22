package io.swagger.api;

import javax.xml.bind.annotation.XmlTransient;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:22:33.560Z")

@javax.xml.bind.annotation.XmlRootElement
class ApiResponseMessage {
    private static final int ERROR = 1;
    private static final int WARNING = 2;
    private static final int INFO = 3;
    private static final int OK = 4;
    private static final int TOO_BUSY = 5;

    private int code;
    private String type;
    String message;

    public ApiResponseMessage(){}

    public ApiResponseMessage(int code, String message){
        this.code = code;
        switch(code){
        case ERROR:
            setType("error");
            break;
        case WARNING:
            setType("warning");
            break;
        case INFO:
            setType("info");
            break;
        case OK:
            setType("ok");
            break;
        case TOO_BUSY:
            setType("too busy");
            break;
        default:
            setType("unknown");
            break;
        }
        this.message = message;
    }

    @XmlTransient
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
