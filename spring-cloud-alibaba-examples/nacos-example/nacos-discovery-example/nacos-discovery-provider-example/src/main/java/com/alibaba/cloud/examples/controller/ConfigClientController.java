package com.alibaba.cloud.examples.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
/**
 * @author dlhjw
 * @version 1.0
 * @date 2022/1/18 15:30
 */
@RestController
@RefreshScope //使当前类下的配置支持 Nacos 的动态刷新功能
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
