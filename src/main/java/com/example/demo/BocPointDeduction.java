package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/bocMoke/pointDeduction")
@RestController
public class BocPointDeduction {

    @RequestMapping()
    public @ResponseBody String bocMoked(HttpServletRequest request) throws Exception {
        String resp = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<data>\n" +
                "    <accessToken>nRbfydHUI5Pn15S9hdtckpH74xM7XS+Oghdv/w2Vq2fJADWEmDTdpAC3f67GMCwKh5oKqdVM4Wos2QOS24D9KLU74SUmxcOmb9wn/V+0xx3Ky1Un0tO7fo8CWIHI68CJIAjoKMAeSB/vRm37i8MoW5OpajwF5RjE7TS8sThrxdk=</accessToken>\n" +
                "    <transNo>npm2pBjkvrOw/KudO4RkBmScoElSQ2ba2nQBT/1Gz3ADXGJKvYFKbD5M6/7rKRL2YLWh+TlZ8e2UmM/Lba2F5o1g28rlJjYVaNCePF4BnuWpstYnZrWEQ9b5NqmPOZ3dgXIGe6++uHMYTcA0lTADRIDbiZprv91HLS3dwDmMlF0=</transNo>\n" +
                "    <orderCode>PcepEZi3eDC/IUo5VWNuXTDgduaLlKInZkIDAaYIk6bWbej8RndkdTVhHf/v6HGs5owHd7GF0HWjCFTa+ZMvk29+p5SegJDBj/eFfrzY3FJvNZW0EFnxkXKhiWwTn6gZzZ1hatRN3L4z3sMVgM1qLlv0viXoM2q+lFvyYYQtqJc=</orderCode>\n" +
                "    <productName>1100个联盟积分</productName>\n" +
                "    <pointValue>eZ+Q7YRLdYABTiq81006JgKoMaagvhhzMeaexdDpCvsALI/6E4fPQ0iz7FhFHx9z7W8CaIt2ILhc7WkU9O/nrXqQiRHmoypyRH2vHShkEgtvGzubfF9L/vkn7dA/CU0g5HMNQZpFHsPvqgAN83HT1dJLKGBFkSspTM/cnJR/Nz0=</pointValue>\n" +
                "    <pointType>1</pointType>\n" +
                "    <adjustTime>2019-06-24 16:16:16</adjustTime>\n" +
                "    <bizCode>0000</bizCode>\n" +
                "    <bizDesc>中行积分扣减成功mocker</bizDesc>\n" +
                "</data>";
        return  resp;
    }







}

