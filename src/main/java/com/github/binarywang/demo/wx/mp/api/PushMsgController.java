package com.github.binarywang.demo.wx.mp.api;

import com.github.binarywang.demo.wx.mp.utils.HttpClientUtils;
import com.github.binarywang.demo.wx.mp.utils.JsonUtils;
import lombok.AllArgsConstructor;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiaozw
 * @create 2019/9/5  下午 03:33
 */
//@AllArgsConstructor
@Controller
@RequestMapping("/push")
public class PushMsgController {
    @Autowired
    WxMpService wxMpService;
    @GetMapping("/msg")
    @ResponseBody
    public void msg() {
        try {
            WxMpTemplateMessage wxMpTemplateMessage = new WxMpTemplateMessage();
            //设置模板id
            wxMpTemplateMessage.setTemplateId("b85QSL79Z2RhVEMl_Zu2l7xPd21JBrw6gTOX_se5cVA");
            //设置超链接
            wxMpTemplateMessage.setUrl("http://www.baidu.com");
            //设置接收人
            wxMpTemplateMessage.setToUser("ozjSxuFN5Bn7-7Sa945jZbB1ShoM");
            wxMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
