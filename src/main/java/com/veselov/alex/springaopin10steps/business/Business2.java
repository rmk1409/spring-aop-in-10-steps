package com.veselov.alex.springaopin10steps.business;

import com.veselov.alex.springaopin10steps.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private Dao2 dao;

    public String calculateBusinessLogic() {
        return this.dao.retrieveSomething();
    }
}
