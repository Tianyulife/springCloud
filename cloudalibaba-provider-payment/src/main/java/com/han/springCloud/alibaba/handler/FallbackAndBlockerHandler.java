package com.han.springCloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/4/2023 20:52
 * @Description: com.han.springCloud.alibaba.handler
 */
public class FallbackAndBlockerHandler {
    // 服务流量控制处理，注意细节，一定要跟原函数的返回值和形参一致，并且形参最后要加个BlockException参数，否则会报错，FlowException: null
    public static String selectUserByNameBlockHandler(String username, BlockException ex)
    {
        System.out.println("selectUserByNameBlockHandler异常信息：" + ex.getMessage());
        return "{\"code\":\"500\",\"msg\": \"" + username + "服务流量控制处理\"}";
    }

    // 服务熔断降级处理，函数签名与原函数一致或加一个 Throwable 类型的参数
    public static String selectUserByNameFallback(String username, Throwable throwable)
    {
        System.out.println("selectUserByNameFallback异常信息：" + throwable.getMessage());
        return "{\"code\":\"500\",\"msg\": \"" + username + "服务熔断降级处理\"}";
    }

}
