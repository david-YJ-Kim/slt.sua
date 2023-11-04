package com.tsh.slt.agent.domain.banWord.service;

import com.tsh.slt.agent.domain.banWord.mapper.SltrLcBanWordDefMapper;
import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.domain.banWord.repository.SltrLcBanWordDefRepository;
import com.tsh.slt.agent.domain.banWord.vo.BanWordDefVO;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordSaveRequestDto;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class SltrLcBanWordDefService {
    private final SltrLcBanWordDefRepository banWordEntityRepository;

    @Autowired
    SltrLcBanWordDefMapper banWordMapper;

    public void deleteAllEntities(){
        this.banWordEntityRepository.deleteAll();
    }

    public SltrLcBanWordDef getBanWordByObjId(String objectId){

        List<SltrLcBanWordDef> sltrLcBanWordDefs = this.banWordEntityRepository.findAllById(Collections.singleton(objectId));
        if(sltrLcBanWordDefs.size() > 1) {
            log.error("Duplication Error.");
            // TODO Throw Invalid 대응 필요
            return null;
        }else{
            return sltrLcBanWordDefs.get(0);
        }

    }

    public String saveBanWord(SltrLcBanWordSaveRequestDto requestDto){

        return banWordEntityRepository.save(requestDto.toEntity()).getObjId();
    }

    public void updateUseYnByObjId(SltrLcBanWordUpdateRequestDto requestDto){

        banWordEntityRepository.updateUseYnByObjId(requestDto.getUseYn(), requestDto.getWordCateCode());
    }

    public void updateBanWord(BanWordDefVO vo){
        // TODO Update SQL 실패...
        // org.apache.ibatis.type.TypeException: Could not set parameters for mapping: ParameterMapping
        // 확인요
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }

        banWordMapper.update(vo);
    }

    public BanWordDefVO getBanWordById(String objectId){
        return banWordMapper.selectById(objectId);
    }

    public List<BanWordDefVO> getAllBanWord(){
        return banWordMapper.selectAll();
    }

    public List<BanWordDefVO> getBanWordByWord(String word){
        return banWordMapper.selectByWord(word);
    }

    public void deleteBanWordById(String objectId){
        banWordMapper.deleteById(objectId);
    }

    public void deleteBanWordByWord(String word){
        banWordMapper.deleteByWord(word);
    }
}
