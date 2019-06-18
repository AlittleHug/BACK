package com.platform.web.controller;


import com.platform.common.vm.UserVM;
import com.platform.common.vm.ResultMsg;
import com.platform.common.util.StatusCode;
import com.platform.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录控制层
 */
//@RestController=@Controller+@ResponseBody
@RestController
@RequestMapping("/login")
public class LoginContraller {

    private final Logger log = LoggerFactory.getLogger(LoginContraller.class);
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/loginRequest")
    public ResultMsg loginRequest(@RequestBody UserVM userVM){
        log.debug("=====进入登录校验操作=====");
        return loginService.loginRequest(userVM);
    }
}
