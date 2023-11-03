package com.tsh.slt.agent.domain.product.mapper;

import com.tsh.slt.agent.domain.product.vo.SltrLcProdDtlImgVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdDtlVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdRegistVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SltrLcProdMapper {

    // Create
    void saveSltrLcProdDtlImg(SltrLcProdDtlImgVO vo);
    void saveSltrLcProdDtl(SltrLcProdDtlVO vo);
    void saveSltrLcProdRegist(SltrLcProdRegistVO vo);
    void saveSltrLcProd(SltrLcProdVO vo);


    // Update
    void updateSltrLcProdDtlImg(SltrLcProdDtlImgVO vo);
    void updateSltrLcProdDtl(SltrLcProdDtlVO vo);
    void updateSltrLcProdRegist(SltrLcProdRegistVO vo);
    void updateSltrLcProd(SltrLcProdVO vo);


    // Delete By Id
    void deleteSltrLcProdDtlImgById(String id);
    void deleteSltrLcProdDtlById(String id);
    void deleteSltrLcProdRegistById(String id);
    void deleteSltrLcProdById(String id);


    // GET By Id
    SltrLcProdDtlImgVO getSltrLcProdDtlImgById(String id);
    SltrLcProdDtlVO getSltrLcProdDtlById(String id);
    SltrLcProdRegistVO getSltrLcProdRegistById(String id);
    SltrLcProdVO getSltrLcProdById(String id);
}
