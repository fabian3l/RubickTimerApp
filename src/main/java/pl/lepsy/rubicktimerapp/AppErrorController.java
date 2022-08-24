//package pl.lepsy.rubicktimerapp;
//
//import org.springframework.boot.web.servlet.error.ErrorAttributes;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.context.request.ServletWebRequest;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Map;
//
//@Controller
//public class AppErrorController implements ErrorController {
//
//    private ErrorAttributes errorAttributes;
//
//    private final static String ERROR_PATH = "/error";
//
//
//    @RequestMapping(value = ERROR_PATH, produces = "text/html")
//    public String handleError(HttpServletRequest request) {
//        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
//        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
//        return String.format("<html><body><h2>Error Page</h2><div>Status code: <b>%s</b></div>"
//                        + "<div>Exception Message: <b>%s</b></div><body></html>",
//                statusCode, exception==null? "N/A": exception.getMessage());
//    }
//}
