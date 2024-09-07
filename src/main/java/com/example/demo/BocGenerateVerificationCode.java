package com.example.demo;

import com.example.demo.model.BaseList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/bocMoke/generateVerificationCode")
@RestController
public class BocGenerateVerificationCode {

    @RequestMapping()
    public @ResponseBody String bocMoked(HttpServletRequest request) throws Exception {
        String resp = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<data>\n" +
                "    <accessToken>F2hSkr2f8ng0YdjH1/ybkmKoGJ+iSl+27/d4bBbG42LtQyUFXswSW8G7i9vkGc9Xi92n01oXiATdjsEBM4GpRMfsRVQIadNrbTTjICLObRoVa1rMm15Khf2nVX/Xf42fp9AwLwdQkUR2Cu/q2u1hQVZRJkgytyVbQv6WD/M8+bM=</accessToken>\n" +
                "  <userId>d211HWB7+dF+1CyNPJIZryl5Ybk/8u1ha/UENjGm8ARnZlDsbUvHDlr3j7G0DaRSd31RJRhlRyUzATsoZD4IiVQN3GptzQgY5snRQXNyxB2AvJhxs/PJhOo96I45PVFxCBghYb3B1dQM5ivE1NNQaAydwLtA8L9teo84zV3lKDY=</userId>\n" +
                "    <bizCode>0000</bizCode>\n" +
                "    <bizDesc>中行短信验证码请求生成成功Mocker</bizDesc>\n" +
                "</data>";
        return  resp;
    }







}

