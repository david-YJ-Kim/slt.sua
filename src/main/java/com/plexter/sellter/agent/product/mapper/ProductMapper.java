package com.plexter.sellter.agent.product.mapper;

import com.plexter.sellter.agent.product.vo.SltrLcProdDtlImgVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdDtlVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdRegistVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdVO;

public interface ProductMapper {

    // Create
    String saveSltrLcProdDtlImg(SltrLcProdDtlImgVO vo);
    String saveSltrLcProdDtl(SltrLcProdDtlVO vo);
    String saveSltrLcProdRegist(SltrLcProdRegistVO vo);
    String saveSltrLcProd(SltrLcProdVO vo);


    // Update
    SltrLcProdDtlImgVO updateSltrLcProdDtlImg(SltrLcProdDtlImgVO vo);
    SltrLcProdDtlVO updateSltrLcProdDtl(SltrLcProdDtlVO vo);
    SltrLcProdRegistVO updateSltrLcProdRegist(SltrLcProdRegistVO vo);
    SltrLcProdVO updateSltrLcProd(SltrLcProdVO vo);


    // Delete By Id
    SltrLcProdDtlImgVO deleteSltrLcProdDtlImgById(String id);
    SltrLcProdDtlVO deleteSltrLcProdDtlById(String id);
    SltrLcProdRegistVO deleteSltrLcProdRegistById(String id);
    SltrLcProdVO deleteSltrLcProdById(String id);
}
