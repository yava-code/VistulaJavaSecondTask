package pl.edu.vistula.firstrestapi.product.support;

import org.slf4j.LoggerFactory;
import org.springdoc.api.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pl.edu.vistula.firstrestapi.product.support.exeption.ProductNotFoundExeption;
import pl.edu.vistula.firstrestapi.shared.api.response.ErrorMessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerAdvice
public class ProductExceptionAdvisor extends RuntimeException {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(ProductExceptionAdvisor.class);

@ExceptionHandler(ProductNotFoundExeption.class)
@ResponseStatus(HttpStatus.NOT_FOUND)
@ResponseBody
    public ErrorMessageResponse productNotFound(Exception e) {
    LOG.clone(e.getMessage(), e);
    return new ErrorMessageResponse(e.getLocalizedMessage());
}



//    public ProductExceptionAdvisor(String message) {
//        super(message);
//    }



}
