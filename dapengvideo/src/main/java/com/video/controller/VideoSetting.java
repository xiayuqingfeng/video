package com.video.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.video.dto.BaseResult;
import com.video.dto.request.VideoNameReq;
import com.video.dto.response.VideoNameResp;
import com.video.util.videoFramesUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-04-29 13:40
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-04-29 13:40
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
@RequestMapping("/videoSetPage")
public class VideoSetting {

    @Value("${video.path.root}")
    private String videoPath;

    @Value("${video.image.path.root}")
    private String picPath;

    @RequestMapping(value = "/makeImage", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public JSONObject makeFrames () {
        //所有视频文件路径
        List<String> filePathList = new ArrayList<String>();
        videoFramesUtil.getFileDirectoryPaths(videoPath+"video", filePathList);

        //所有视频帧截图存放路径
        for (String filePath : filePathList) {
            int indexValue = filePathList.indexOf(filePath);
            try {
                //视频帧截图保存本地
                videoFramesUtil.getMoreVideoPic(filePath, picPath+"videoOne", 1, false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "1");
        return jsonObject;
    }

    @RequestMapping(value = "/videoList", method = RequestMethod.POST)
    @ResponseBody
    public Object videoList(@RequestBody VideoNameReq video) {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }

    @RequestMapping(path = "/videoImage", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public BaseResult videoImage(@RequestBody VideoNameReq video) {

        VideoNameResp activityConfig = new VideoNameResp();
        activityConfig.setIamgeOne("asdasd");
        activityConfig.setIamgeTow("234");
        activityConfig.setIamgeThree("asd");

        return BaseResult.success(activityConfig);
    }

    @RequestMapping(value = "/unlock", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject unlock(@RequestBody JSONObject params) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("asdasdasd", "asdadsasda123123");
        return jsonObject;
    }

    @RequestMapping(value = "/unlockget", method = RequestMethod.GET)
    @ResponseBody
    public String unlockget(@RequestBody JSONObject params) {
        Map<String, String> aMap = new HashMap<>();
        aMap.put("A", "asdasd");
        return "asdfasdfasdf";
    }

    @RequestMapping(value = "/next_page",method = RequestMethod.POST)
    public void getUsersByPage(@RequestBody JSONObject params, HttpSession session, HttpServletResponse response) throws IOException {
        String page = params.get("page").toString();
        Map<String, String> ulist = new HashMap<>();
        ulist.put("asdasd", "asdasdasd");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(JSON.toJSONString(ulist));
    }

    @RequestMapping(value= {"/checkUser"},method=RequestMethod.POST,produces="text/html;charset=utf-8")
    @ResponseBody
    public void checkUser(HttpServletResponse response,String username) throws IOException
    {
        PrintWriter out=response.getWriter();

        System.out.println("username:"+username);
        System.out.println(username.equals("123"));
        if(username.equals("123"))
        {
            out.println(true);
            System.out.println(true);
        }
        else
        {
            out.println(false);
            System.out.println(false);
        }

        Map<String, String> ulist = new HashMap<>();
        ulist.put("asdasd", "asdasdasd");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(JSON.toJSONString(ulist));

    }


}
