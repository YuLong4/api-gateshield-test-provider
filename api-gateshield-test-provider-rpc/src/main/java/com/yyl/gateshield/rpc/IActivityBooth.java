package com.yyl.gateshield.rpc;

import com.yyl.gateshield.rpc.dto.XReq;

public interface IActivityBooth {
    String sayHi(String str);

    String insert(XReq req);

    String test(String str, XReq req);
}
