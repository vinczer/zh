package com.demo.hm.api;

import com.demo.hm.domain.NeptunUser;
import com.demo.hm.service.impl.DataSaver;
import com.demo.hm.service.impl.NeptunUserCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private final NeptunUserCreator neptunUserCreator;
    private final DataSaver dataSaver;

    @Autowired
    public HomeController(NeptunUserCreator neptunUserCreator, DataSaver dataSaver) {
        this.neptunUserCreator = neptunUserCreator;
        this.dataSaver = dataSaver;
    }

    @RequestMapping(value = "/{nid}")
    public String entryPoint(@PathVariable("nid") int nid) {
        NeptunUser justToSee = neptunUserCreator.createNeptunUser(nid);
        dataSaver.saveNeptunUser(nid);
        return justToSee.toString();
    }
}
