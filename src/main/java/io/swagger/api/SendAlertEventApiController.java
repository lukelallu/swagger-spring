package io.swagger.api;

import io.swagger.model.ItemStatus;
import io.swagger.model.SendAlertEventPOSTRequest;
import io.swagger.model.SendAlertEventPOSTResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-19T13:22:33.560Z")

@Controller
public class SendAlertEventApiController implements SendAlertEventApi {

    private static final Logger log = LoggerFactory.getLogger(SendAlertEventApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SendAlertEventApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SendAlertEventPOSTResponse> sendAlertEventPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SendAlertEventPOSTRequest body) {
        String accept = request.getHeader("Accept");
        try {
            if (accept != null && accept.contains("")) {
                log.info(body.toString());
                SendAlertEventPOSTResponse sendAlertEventPOSTResponse = new SendAlertEventPOSTResponse();

////to do




                if (body.getAlertType() == null) {
                    sendAlertEventPOSTResponse.getItemStatuses().add(new ItemStatus(body.getAlertItemId(), "FAILURE"));
                    return ResponseEntity.badRequest()
                            .header("Custom-Header", "alerts-process")
                            .body(sendAlertEventPOSTResponse);
                }else {
                    sendAlertEventPOSTResponse.getItemStatuses().add(new ItemStatus(body.getAlertItemId(), "SUCCESS"));
                    return ResponseEntity.ok()
                            .header("Custom-Header", "alerts-process")
                            .body(sendAlertEventPOSTResponse);
                }

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<SendAlertEventPOSTResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
