package com.plexter.sellter.agent.banWord.service;

import com.plexter.sellter.agent.banWord.mapper.BanWordMapper;
import com.plexter.sellter.agent.banWord.vo.BanWordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanWordService {

    @Autowired
    BanWordMapper banWordMapper;

    public void addBanWord(BanWordVO vo){
        banWordMapper.save(vo);
    }

    public BanWordVO getBanWordById(String objectId){
        return banWordMapper.selectById(objectId);
    }

    public List<BanWordVO> getAllBanWord(){
        return banWordMapper.selectAll();
    }

    public void deleteBanWordById(String objectId){
        banWordMapper.deleteById(objectId);
    }
}
