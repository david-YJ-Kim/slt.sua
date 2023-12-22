package com.tsh.slt.sua.domain.bizAccount.mapper;

import com.tsh.slt.sua.domain.bizAccount.vo.SltrLcBizDefVO;
import com.tsh.slt.sua.domain.bizAccount.vo.SltrLcBizMktRelVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SltrLcBizDefMapper {

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
