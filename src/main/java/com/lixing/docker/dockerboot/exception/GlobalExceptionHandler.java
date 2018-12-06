package com.lixing.docker.dockerboot.exception;
import com.lixing.docker.dockerboot.entity.ErrorInfo;
import com.lixing.docker.dockerboot.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
/**
 * author: lixing
 * date: 2018-12-04
 * time: 11:35
 * description:统一定义异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultExceptionHandler(HttpServletRequest request, HttpServletResponse response, NullPointerException exception) {
        ModelAndView view = new ModelAndView();
        view.addObject("timestamp", DateUtil.dateUtil(new Date()));
        view.addObject("status",response.getStatus());
        view.addObject("exception", exception);
        view.addObject("url", request.getRequestURL());
        view.addObject("trace",exception.getStackTrace());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorString(HttpServletRequest request, MyException e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        logger.info("处理自定义异常信息");
        errorInfo.setMsg("false");
        errorInfo.setMessage(e.getMessage());
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData("Error");
        errorInfo.setUrl(request.getRequestURL().toString());
        return errorInfo;
    }
}
