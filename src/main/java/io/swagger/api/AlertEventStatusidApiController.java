package io.swagger.api;

import io.swagger.model.AlertEventStatusByIdGETResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:22:33.560Z")

@Controller
public class AlertEventStatusidApiController implements AlertEventStatusidApi {

    private static final Logger log = LoggerFactory.getLogger(AlertEventStatusidApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AlertEventStatusidApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AlertEventStatusByIdGETResponse> alertEventStatusByIdGet(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AlertEventStatusByIdGETResponse>(objectMapper.readValue("{  \"result\" : \"result\"}", AlertEventStatusByIdGETResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AlertEventStatusByIdGETResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AlertEventStatusByIdGETResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
