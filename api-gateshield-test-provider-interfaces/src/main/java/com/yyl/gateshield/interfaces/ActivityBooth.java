package com.yyl.gateshield.interfaces;

import com.alibaba.fastjson.JSON;
import com.yyl.gateshield.rpc.IActivityBooth;
import com.yyl.gateshield.rpc.dto.XReq;

import com.yyl.gateshield.sdk.annotation.ApiProducerClazz;
import com.yyl.gateshield.sdk.annotation.ApiProducerMethod;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
@ApiProducerClazz(interfaceName = "测试接口", interfaceVersion = "1.0.0")
public class ActivityBooth implements IActivityBooth {

    @Override
    @ApiProducerMethod(methodName = "探活方法", uri = "/wg/activity/sayHi", httpCommandType = "GET", auth = 0)
    public String sayHi(String str) {
        return "hi " + str + " by api-gateshield-test-provider";
    }

    @Override
    @ApiProducerMethod(methodName = "插入方法", uri = "/wg/activity/insert", httpCommandType = "POST", auth = 1)
    public String insert(XReq req) {
        return "hi " + JSON.toJSONString(req) + " by api-gateshield-test-provider";
    }

    @Override
    @ApiProducerMethod(methodName = "测试方法", uri = "/wg/activity/test", httpCommandType = "POST", auth = 0)
    public String test(String str, XReq req) {
        return "hi " + str + JSON.toJSONString(req) + " by api-gateshield-test-provider";
    }

}
