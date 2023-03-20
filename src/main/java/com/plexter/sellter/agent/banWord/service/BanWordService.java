package com.plexter.sellter.agent.banWord.service;

import com.plexter.sellter.agent.banWord.mapper.BanWordMapper;
import com.plexter.sellter.agent.banWord.vo.SltrLcBanWordDefVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanWordService {


    @Autowired
    BanWordMapper banWordMapper;

    public void addBanWord(SltrLcBanWordDefVO vo){

        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCBAN"));
        banWordMapper.save(vo);
    }

    public void updateBanWord(SltrLcBanWordDefVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        banWordMapper.update(vo);
    }

    public SltrLcBanWordDefVO getBanWordById(String objectId){
        return banWordMapper.selectById(objectId);
    }

    public List<SltrLcBanWordDefVO> getAllBanWord(){
        return banWordMapper.selectAll();
    }

    public List<SltrLcBanWordDefVO> getBanWordByWord(String word){
        return banWordMapper.selectByWord(word);
    }

    public void deleteBanWordById(String objectId){
        banWordMapper.deleteById(objectId);
    }

    public void deleteBanWordByWord(String word){
        banWordMapper.deleteByWord(word);
    }
}
