package com.plexter.sellter.agent.bizAccount.mapper;

import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizDefVO;
import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizMktRelVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BizAccountMapper {

    // Create
    void saveSltrLcBizDef(SltrLcBizDefVO vo);
    void saveSltrBizMktRel(SltrLcBizMktRelVO vo);

    // Update
    void updateSltrLcBizDef(SltrLcBizDefVO vo);
    void updateSltrBizMktRel(SltrLcBizMktRelVO vo);

    // Delete by Id
    void deleteSltrLcBizDefById(String id);
    void deleteSltrBizMktRelById(String id);

    // Delete by UKs.


    // Get By PK.
    SltrLcBizDefVO getSltrLcBizDefById(String id);
    SltrLcBizMktRelVO getSltrBizMktRelById(String id);
}
