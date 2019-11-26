package com.demo.hm.service.impl;

import com.demo.hm.domain.NeptunUser;
import com.demo.hm.service.IDataSaver;
import com.demo.hm.util.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSaver implements IDataSaver {

    private final NeptunUserCreator neptunUserCreator;

    @Autowired
    public DataSaver(NeptunUserCreator neptunUserCreator) {
        this.neptunUserCreator = neptunUserCreator;
    }

    @Override
    public void saveNeptunUser(int nid) {
        final NeptunUser neptunUser = neptunUserCreator.createNeptunUser(nid);
        ConnectionFactory.getInstance().save(neptunUser);
    }
}
