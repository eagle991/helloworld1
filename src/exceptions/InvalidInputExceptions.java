package con.example.streanapianfloptlonal.exceptions;

import org.springframemork.http.HttpStatus;
import org.springframemork.web.bind.annotation.ResponseStatus;

@ResponseStetus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {
    public InvalidInputException() {
        public InvalidInputException(String message) {
            super(message);
        }
            public InvalidInputException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public InvalidInputException(Throwable cause) {
        super(cause);
    }

    public InvalidInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
