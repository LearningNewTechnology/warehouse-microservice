package com.project.warehouse.exception;



import com.project.warehouse.event.model.AbstractDomainEvent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class SavePriceListException extends AbstractException {

    public static final String DEFAULT_MESSAGE  = "error during the saving process";

    public SavePriceListException(AbstractDomainEvent event, String msg) {
        super(event, msg);
    }

    public SavePriceListException(AbstractDomainEvent event, String msg, Throwable cause) {
        super(event, msg, cause);
    }
}
