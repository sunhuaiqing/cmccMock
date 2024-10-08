package com.example.demo;
import com.example.demo.model.BaseList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/bocMoke/integralQuery")
@RestController
public class BocIntegralQuery {
    @Value("${demo.name}")
    private String name;



    // 设置基本参数
    public BaseList getBaseList() {
        BaseList baseList = new BaseList();
        baseList.setReturnCode("0000");
        baseList.setMessage("业务处理成功Moker");
        return baseList;
    }
    @RequestMapping()
    public @ResponseBody String bocMoked(HttpServletRequest request) throws Exception {
        System.out.println("@@@@@name():"+name);
        System.out.println("request.getQueryString():"+request.getQueryString());
        //System.out.println("request.changeSessionId():"+request.changeSessionId());
        System.out.println("request.getParameter(\"data\")():"+request.getParameter("data"));
        System.out.println("request.getPathInfo():"+request.getPathInfo());
        System.out.println("request.getParameterMap():"+request.getParameterMap());


        String resp = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<data>\n" +
                "    <accessToken>a5g7jxAtoqjOXU7/TvlupKIhAXwzvqqFeOD/oOvReTkzRB5XLOLW1pwRqQBUmW4za6Cz9ah9NHwnrPcTyORC2SZOZrxjkG6D0Ag2TZ4gAfqEPuvvabOwZfLJ5eoW66sOf/n2g9OJz7CIgruSGIQZJ60uZ55hMvUUyQMZo0M01dU=</accessToken>\n" +
                "    <pointValue>530000</pointValue>\n" +
                "    <pointType>1</pointType>\n" +
                "    <bizCode>0000</bizCode>\n" +
                "    <bizDesc>中行积分查询成功Mock1</bizDesc>\n" +
                "</data>\n";
        return  resp;
    }







}

