package com.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-05-11 10:59
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-05-11 10:59
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@RequestMapping("/videoPage")
public class VideoPage {

    @RequestMapping("/videoHomePage")
    public String videoHomePage () {
        return "videoHomePage.jsp";
    }

    @RequestMapping("/setPage")
    public String setPage () {
        return "videoSetPage.jsp";
    }
}