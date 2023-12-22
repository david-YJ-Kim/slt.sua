package com.tsh.slt.sua.config;

import com.tsh.slt.sua.util.SuaCommonUtil;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SuaPropertyObject {

    Environment env;
    @Value("${ap.info.group}")
    private String groupName;
    @Value("${ap.info.site}")
    private String siteName;
    @Value("${ap.info.env}")
    private String envType;
    @Value("${ap.info.sequence}")
    private String processSeq;
    private String clientName;
    @Value("${ap.interface.destination.receive.queue}")
    private String receiveQueueName;

    @Value("${ap.interface.destination.send.topic}")
    private String sendTopicName;

    private static SuaPropertyObject instance;

    public SuaPropertyObject(Environment env){
        this.env = env;
        instance = this;
    }

    public static SuaPropertyObject getInstance(){
        return instance;
    }

    public static SuaPropertyObject createInstance(Environment env){
        if(instance == null){
            synchronized (SuaPropertyObject.class){
                if(instance == null){
                    instance = new SuaPropertyObject(env);
                }
            }
        }

        if(instance.clientName == null){
            instance.clientName = SuaCommonUtil.generateClientName(instance.groupName, instance.siteName, instance.envType, instance.processSeq);
        }

        return instance;
    }


}
