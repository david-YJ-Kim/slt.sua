package com.tsh.slt.agent.domain.banWord.service;

import com.tsh.slt.agent.domain.banWord.mapper.SltrLcBanWordDefMapper;
import com.tsh.slt.agent.domain.banWord.model.SltrLcBanWordDef;
import com.tsh.slt.agent.domain.banWord.repository.SltrLcBanWordDefRepository;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordSaveRequestDto;
import com.tsh.slt.agent.domain.banWord.vo.dto.SltrLcBanWordUpdateUseYnRequestDto;
import com.tsh.slt.agent.util.common.dto.CommonDto;
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
    private final SltrLcBanWordDefRepository repository;

    @Autowired
    SltrLcBanWordDefMapper banWordMapper;

    /**
     * ########################################################################
     * SAVE
     * ########################################################################
     */

    @Override
    public SltrLcBanWordDef saveEntity(CommonDto saveRequestDto) {
        SltrLcBanWordSaveRequestDto dto =  (SltrLcBanWordSaveRequestDto) saveRequestDto;

        return repository.save(dto.toEntity());

    }


    /**
     * ########################################################################
     * GET
     * ########################################################################
     */

    @Override
    public Optional<SltrLcBanWordDef> getEntityByObjId(String objId) {
        return Optional.empty();
    }

    public Optional<SltrLcBanWordDef> getBanWordByObjId(String objectId){

        return this.repository.findById(objectId);
    }

    /**
     * ########################################################################
     * UPDATE
     * ########################################################################
     */
    @Transactional
    public String updateUseYnByObjId(SltrLcBanWordUpdateUseYnRequestDto requestDto){

        SltrLcBanWordDef entity = requestDto.toEntity();
        repository.updateUseYnByObjId(entity.getUseYn(), entity.getObjId());
        return requestDto.getObjId();
    }


    /**
     * ########################################################################
     * DELETE
     * ########################################################################
     */


    @Override
    public void deleteEntities(Iterable<SltrLcBanWordDef> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcBanWordDef> deleteIterator) {
        this.repository.deleteAllInBatch(deleteIterator);
    }

    @Override
    public void deleteEntitiesByObjId(String objId) {
        this.repository.deleteById(objId);
    }

    public void deleteAllEntities(){
        this.repository.deleteAll();
    }






}
