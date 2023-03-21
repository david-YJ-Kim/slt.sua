package com.plexter.sellter.agent.product.service;

import com.plexter.sellter.agent.product.mapper.ProductMapper;
import com.plexter.sellter.agent.product.vo.SltrLcProdDtlImgVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdDtlVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdRegistVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdVO;
import com.plexter.sellter.agent.util.ParsingCommonUtil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Mapper
    ProductMapper mapper;

    // Create
    public String saveSltrLcProdDtlImg(SltrLcProdDtlImgVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRDDTIMG"));
        return mapper.saveSltrLcProdDtlImg(vo);
    }
    public String saveSltrLcProdDtl(SltrLcProdDtlVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRDDTL"));
        return mapper.saveSltrLcProdDtl(vo);
    }
    public String saveSltrLcProdRegist(SltrLcProdRegistVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRDREG"));
        return mapper.saveSltrLcProdRegist(vo);
    }
    public String saveSltrLcProd(SltrLcProdVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRD"));
        return mapper.saveSltrLcProd(vo);
    }


    // Update
    public SltrLcProdDtlImgVO updateSltrLcProdDtlImg(SltrLcProdDtlImgVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcProdDtlImg(vo);
    }
    public SltrLcProdDtlVO updateSltrLcProdDtl(SltrLcProdDtlVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcProdDtl(vo);
    }
    public SltrLcProdRegistVO updateSltrLcProdRegist(SltrLcProdRegistVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcProdRegist(vo);
    }
    public SltrLcProdVO updateSltrLcProd(SltrLcProdVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        return mapper.updateSltrLcProd(vo);
    }


    // Delete By Id
    public SltrLcProdDtlImgVO deleteSltrLcProdDtlImgById(String id){
        return mapper.deleteSltrLcProdDtlImgById(id);
    }
    public SltrLcProdDtlVO deleteSltrLcProdDtlById(String id){
        return mapper.deleteSltrLcProdDtlById(id);
    }
    public SltrLcProdRegistVO deleteSltrLcProdRegistById(String id){
        return mapper.deleteSltrLcProdRegistById(id);
    }
    public SltrLcProdVO deleteSltrLcProdById(String id){
        return mapper.deleteSltrLcProdById(id);
    }

}
