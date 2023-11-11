package com.tsh.slt.agent.domain.user.service;

import com.tsh.slt.agent.domain.user.mapper.UserMapper;
import com.tsh.slt.agent.domain.user.model.SltrLcUser;
import com.tsh.slt.agent.domain.user.repository.SltrLcUserRepository;
import com.tsh.slt.agent.domain.user.vo.SltrLcImgDtlVO;
import com.tsh.slt.agent.domain.user.vo.SltrLcUserVO;
import com.tsh.slt.agent.domain.user.vo.dto.SltrLcUserSaveRequestDto;
import com.tsh.slt.agent.util.ParsingCommonUtil;
import com.tsh.slt.agent.util.common.dto.CommonDto;
import com.tsh.slt.agent.util.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SltrLcUserService implements CommonService<SltrLcUser> {
    private final SltrLcUserRepository repository;

    @Autowired
    UserMapper mapper;

    @Override
    public SltrLcUser saveEntity(CommonDto saveRequestDto) {
        SltrLcUserSaveRequestDto dto = (SltrLcUserSaveRequestDto) saveRequestDto;
        return this.repository.save(dto.toEntity());
    }

    @Override
    public Optional<SltrLcUser> getEntityByObjId(String objId) {
        return this.repository.findById(objId);
    }

    @Override
    public void deleteEntities(Iterable<SltrLcUser> deleteIterator) {
        this.repository.deleteAll(deleteIterator);

    }

    @Override
    public void deleteEntitiesInBatch(Iterable<SltrLcUser> deleteIterator) {
        this.repository.deleteAllInBatch(deleteIterator);
    }

    @Override
    public void deleteEntitiesByObjId(String objId) {
        this.repository.deleteById(objId);
    }

    public void deleteAllEntities(){
        this.repository.deleteAll();
    }

    public SltrLcUserVO selectSltrLcUser(String userId) {
        return mapper.selectSltrLcUser(userId);
    }

    // Create
    public String saveSltrLcImgDtl(SltrLcImgDtlVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCIMGDTL"));
        mapper.saveSltrLcImgDtl(vo);
        return vo.getOBJ_ID();
    }
    public String saveSltrLcUser(SltrLcUserVO vo){

        System.out.println("====================");
        System.out.println(vo.toString());
        System.out.println(mapper.selectSltrLcUser(vo.getUSER_ID()).getOBJ_ID());

        if(mapper.selectSltrLcUser(vo.getUSER_ID()).getOBJ_ID().isEmpty()){
            vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCUSR"));
            System.out.println(vo.toString());

            mapper.saveSltrLcUser(vo);
        }else{
            this.updateSltrLcUser(vo);
        }


        return vo.getOBJ_ID();
    }

    // Update
    public SltrLcImgDtlVO updateSltrLcImgDtl(SltrLcImgDtlVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcImgDtl(vo);
    }
    public SltrLcUserVO updateSltrLcUser(SltrLcUserVO vo){
        System.out.println(vo.toString());
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcUser(vo);
        return vo;
    }

    // Delete By Id
    public SltrLcImgDtlVO deleteSltrLcImgDtlById(String id){
        return mapper.deleteSltrLcImgDtlById(id);
    }
    public SltrLcUserVO deleteSltrLcUserById(String id){
        return mapper.deleteSltrLcUserById(id);
    }

}
