package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/bocMoke/checkVerificationCode")
@RestController
public class BocValidVerifCode {
    //读取application.properties配置文件，中行兑换验证码开关
    @Value("${boc.ValildVerifCode.switch}")
    String boc_ValildVerifCode_switch;
    //读取application.properties配置文件，中行兑换验证码
    @Value("${boc.ValildVerifCode.success_SmsCode}")
    String boc_ValildVerifCode_success_SmsCode;

    @RequestMapping()
    public @ResponseBody String bocMoke(HttpServletRequest request) throws Exception {

        //获取请求输入的短信验证码：
        String smscode = request.getParameter("smscode");
        System.out.println("请求入参：smscode："+smscode);
        System.out.println("boc_ValildVerifCode_success_SmsCode："+boc_ValildVerifCode_success_SmsCode);
        System.out.println("boc_ValildVerifCode_switch："+boc_ValildVerifCode_switch);
        String bizCode = "" ;
        String bizDesc = "" ;
        if (boc_ValildVerifCode_switch.equals("on")){
            System.out.println("boc_ValildVerifCode_switch,开关打开on");
            if(smscode.equals(boc_ValildVerifCode_success_SmsCode)){
                System.out.println("验证码校验成功");
                bizCode="0000";
                bizDesc="中行短信验证码校验成功Mock" ;
            }else{
                System.out.println("验证码校验失败");
                bizCode="9999";
                bizDesc="中行短信验证码校验失败Mock" ;
            }
        }else{
            System.out.println("开关关闭，不需要校验验证码");
            bizCode="0000" ;
            bizDesc="中行短信验证码校验成功Mock（不需要校验）" ;
        }

        String  resp = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                    "<data>\n" +
                    "    <accessToken>F2hSkr2f8ng0YdjH1/ybkmKoGJ+iSl+27/d4bBbG42LtQyUFXswSW8G7i9vkGc9Xi92n01oXiATdjsEBM4GpRMfsRVQIadNrbTTjICLObRoVa1rMm15Khf2nVX/Xf42fp9AwLwdQkUR2Cu/q2u1hQVZRJkgytyVbQv6WD/M8+bM=</accessToken>\n" +
                    "  <userId>d211HWB7+dF+1CyNPJIZryl5Ybk/8u1ha/UENjGm8ARnZlDsbUvHDlr3j7G0DaRSd31RJRhlRyUzATsoZD4IiVQN3GptzQgY5snRQXNyxB2AvJhxs/PJhOo96I45PVFxCBghYb3B1dQM5ivE1NNQaAydwLtA8L9teo84zV3lKDY=</userId>\n" +
                    "    <bizCode>"+bizCode+"</bizCode>\n" +
                    "    <bizDesc>"+bizDesc+"</bizDesc>\n" +
                    "</data>";
        return resp;
    }


}

