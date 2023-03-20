package com.plexter.sellter.agent.bizAccount.mapper;

import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizDefVO;
import com.plexter.sellter.agent.bizAccount.vo.SltrLcBizMktRelVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BizAccountMapper {

    // Create
    String saveSltrLcBizDef(SltrLcBizDefVO vo);
    String saveSltrBizMktRel(SltrLcBizMktRelVO vo);

    // Update
    SltrLcBizDefVO updateSltrLcBizDef(SltrLcBizDefVO vo);
    SltrLcBizMktRelVO updateSltrBizMktRel(SltrLcBizMktRelVO vo);

    // Delete by Id
    SltrLcBizDefVO deleteSltrLcBizDefById(String id);
    SltrLcBizMktRelVO deleteSltrBizMktRelById(String id);

    // Delete by UKs.
}
