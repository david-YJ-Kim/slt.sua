package com.plexter.sellter.agent.banWord.service;

import com.plexter.sellter.agent.banWord.mapper.BanWordMapper;
import com.plexter.sellter.agent.banWord.vo.BanWordVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanWordService {


    @Autowired
    BanWordMapper banWordMapper;

    public void addBanWord(BanWordVO vo){

        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCBAN"));
        banWordMapper.save(vo);
    }

    public void updateBanWord(BanWordVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        banWordMapper.update(vo);
    }

    public BanWordVO getBanWordById(String objectId){
        return banWordMapper.selectById(objectId);
    }

    public List<BanWordVO> getAllBanWord(){
        return banWordMapper.selectAll();
    }

    public List<BanWordVO> getBanWordByWord(String word){
        return banWordMapper.selectByWord(word);
    }

    public void deleteBanWordById(String objectId){
        banWordMapper.deleteById(objectId);
    }

    public void deleteBanWordByWord(String word){
        banWordMapper.deleteByWord(word);
    }
}
