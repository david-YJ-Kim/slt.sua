package com.tsh.slt.sua.message.sample.impl;

import com.tsh.slt.sua.message.sample.SampleBizExecute;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Service
public class SampleBizExecuteImpl implements SampleBizExecute {
    @Override
    public void init() {

    }

    @Override
    public String execute(String parma1, String param2) {
        return null;
    }
}
