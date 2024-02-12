package com.yyl.gateshield.interfaces;

import com.alibaba.fastjson.JSON;
import com.yyl.gateshield.rpc.IActivityBooth;
import com.yyl.gateshield.rpc.dto.XReq;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ActivityBooth implements IActivityBooth {

    @Override
    public String sayHi(String str) {
        return "hi " + str + " by api-gateshield-test-provider";
    }

    @Override
    public String insert(XReq req) {
        return "hi " + JSON.toJSONString(req) + " by api-gateshield-test-provider";
    }

    @Override
    public String test(String str, XReq req) {
        return "hi " + str + JSON.toJSONString(req) + " by api-gateshield-test-provider";
    }

}
