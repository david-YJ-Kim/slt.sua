package com.tsh.slt.agent.activator;

import com.solacesystems.jcsmp.JCSMPException;
import com.tsh.slt.agent.config.SolaceSessionConfiguration;
import com.tsh.slt.agent.solace.InterfaceSolacePub;
import com.tsh.slt.agent.solace.InterfaceSolaceSub;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FisApStartedActivator implements ApplicationRunner {

    @Autowired
    private Environment env;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        SolaceSessionConfiguration sessionConfiguration = SolaceSessionConfiguration.createSessionConfiguration(env);

        try{
            InterfaceSolacePub interfaceSolacePub = InterfaceSolacePub.getInstance();
            interfaceSolacePub.init();
        }catch (JCSMPException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        try{
            InterfaceSolaceSub interfaceSolaceSub = new InterfaceSolaceSub();
            interfaceSolaceSub.run();
        }catch (JCSMPException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
