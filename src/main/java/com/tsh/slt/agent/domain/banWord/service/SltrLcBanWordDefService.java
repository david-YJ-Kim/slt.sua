package com.tsh.slt.agent.domain.banWord.service;

import com.tsh.slt.agent.domain.banWord.mapper.SltrLcBanWordDefMapper;
import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.domain.banWord.repository.SltrLcBanWordDefRepository;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordSaveRequestDto;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordUpdateUseYnRequestDto;
import com.tsh.slt.agent.util.CommonDto;
import com.tsh.slt.agent.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class SltrLcBanWordDefService implements CommonService<SltrLcBanWordDef> {
    private final SltrLcBanWordDefRepository banWordEntityRepository;

    @Autowired
    SltrLcBanWordDefMapper banWordMapper;

    // Delete

//
//    public void deleteEntitiesInBatch(Iterable<SltrLcBanWordDef> deleteIterator){
//        this.banWordEntityRepository.deleteAllInBatch(deleteIterator);
//    }
//    public void deleteEntityByObjId(String objectId){
//        this.banWordEntityRepository.deleteById(objectId);
//    }

    @Override
    public void deleteEntities(Iterable<SltrLcBanWordDef> deleteIterator) {
        this.banWordEntityRepository.deleteAll(deleteIterator);

    }

    //    public void deleteEntities(Iterable<SltrLcBanWordDef> deleteIterator){
//        this.banWordEntityRepository.deleteAll(deleteIterator);
//    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcBanWordDef> deleteIterator) {

    }

    @Override
    public void deleteEntitiesByObjId(String objId) {

    }

    public void deleteAllEntities(){
        this.banWordEntityRepository.deleteAll();
    }

    @Override
    public Optional<SltrLcBanWordDef> getEntityByObjId(String objId) {
        return Optional.empty();
    }

    @Override
    public SltrLcBanWordDef saveEntity(CommonDto saveRequestDto) {
        SltrLcBanWordSaveRequestDto dto =  (SltrLcBanWordSaveRequestDto) saveRequestDto;

        return null;
    }

    @Override
    public SltrLcBanWordDef updateEntity(CommonDto updateRequestDto) {
        SltrLcBanWordSaveRequestDto dto =  (SltrLcBanWordSaveRequestDto) updateRequestDto;

        return null;
    }


    // Default Get
    public Optional<SltrLcBanWordDef> getBanWordByObjId(String objectId){

        return this.banWordEntityRepository.findById(objectId);
    }


    // Save
    public String saveBanWord(SltrLcBanWordSaveRequestDto requestDto){

        return banWordEntityRepository.save(requestDto.toEntity()).getObjId();
    }


    // Update
    @Transactional
    public String updateUseYnByObjId(SltrLcBanWordUpdateUseYnRequestDto requestDto){

        SltrLcBanWordDef entity = requestDto.toEntity();
        banWordEntityRepository.updateUseYnByObjId(entity.getUseYn(), entity.getObjId());
        return requestDto.getObjId();
    }

}
