package com.veselov.alex.springaopin10steps.business;

import com.veselov.alex.springaopin10steps.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao;

    public String calculateBusinessLogic() {
        return this.dao.retrieveSomething();
    }
}
