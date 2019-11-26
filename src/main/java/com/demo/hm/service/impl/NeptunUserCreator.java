package com.demo.hm.service.impl;

import com.demo.hm.domain.NeptunUser;
import com.demo.hm.service.INeptunUserCreator;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class NeptunUserCreator implements INeptunUserCreator {

    private static final String URL = "http://vir.inf.u-szeged.hu:8090/getToken";

    @Override
    public NeptunUser createNeptunUser(int nid) {
        final Map<String, Object> requestParam = new HashMap<>();
        requestParam.put("nid", nid);
        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestParam);
        ResponseEntity<NeptunUser> neptunUserResponseEntity = new RestTemplate().postForEntity(
                URL,
                request,
                NeptunUser.class
        );

        return neptunUserResponseEntity.getBody();
    }
}
