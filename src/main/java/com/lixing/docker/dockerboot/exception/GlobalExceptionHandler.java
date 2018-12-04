package com.lixing.docker.dockerboot.exception;

import com.lixing.docker.dockerboot.entity.ErrorInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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

    @ExceptionHandler()
    public ModelAndView defaultExceptionHandler(HttpServletRequest request, Exception exception) {
        ModelAndView view = new ModelAndView();
        view.addObject("exception", exception);
        view.addObject("url", request.getRequestURL());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorString(HttpServletRequest request, MyException e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        logger.info("处理自定义异常信息");
        errorInfo.setMessage(e.getMessage());
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData("Error");
        errorInfo.setUrl(request.getRequestURL().toString());
        return errorInfo;
    }
}