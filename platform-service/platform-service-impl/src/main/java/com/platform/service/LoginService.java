package com.platform.service;

import com.platform.common.util.StatusCode;
import com.platform.common.vm.ResultMsg;
import com.platform.common.vm.UserVM;
import com.platform.dao.entity.FreeUser;
import com.platform.dao.mapper.FreeUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录服务层
 */
@Service
public class LoginService {

    @Autowired
    private FreeUserMapper freeUserMapper;

    public ResultMsg loginRequest(UserVM userVM){
        ResultMsg resultMsg = new ResultMsg();
        try{
            FreeUser freeUser = freeUserMapper.selectByUserNameAndPsw(userVM);
            if(freeUser != null){
                resultMsg.setStatus(StatusCode.LoginSuccess.getValue());
                resultMsg.setMsg(StatusCode.LoginSuccess.getReasonPhrase());
            } else {
                FreeUser freeUserInfo = freeUserMapper.selectByUserName(userVM);
                if(freeUserInfo != null){
                    resultMsg.setStatus(StatusCode.LoginFailed.getValue());
                    resultMsg.setMsg(StatusCode.LoginFailed.getReasonPhrase());
                } else {
                    resultMsg.setStatus(StatusCode.LoginError.getValue());
                    resultMsg.setMsg(StatusCode.LoginError.getReasonPhrase());
                }
            }
        } catch (Exception e){
            resultMsg.setStatus(StatusCode.LoginException.getValue());
            resultMsg.setMsg(StatusCode.LoginException.getReasonPhrase());
        }
        return resultMsg;
    }
}
