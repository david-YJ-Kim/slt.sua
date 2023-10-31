package com.tsh.slt.agent.domain.product.service;

import com.tsh.slt.agent.util.ParsingCommonUtil;
import com.tsh.slt.agent.domain.product.mapper.ProductMapper;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdDtlImgVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdDtlVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdRegistVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductMapper mapper;

    // Create
    public String saveSltrLcProdDtlImg(SltrLcProdDtlImgVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRDDTIMG"));
        mapper.saveSltrLcProdDtlImg(vo);
        return vo.getOBJ_ID();
    }
    public String saveSltrLcProdDtl(SltrLcProdDtlVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRDDTL"));
        mapper.saveSltrLcProdDtl(vo);
        return vo.getOBJ_ID();
    }
    public String saveSltrLcProdRegist(SltrLcProdRegistVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRDREG"));
        mapper.saveSltrLcProdRegist(vo);
        return vo.getOBJ_ID();
    }
    public String saveSltrLcProd(SltrLcProdVO vo){
        vo.setOBJ_ID(ParsingCommonUtil.generateObjId("LCPRD"));
        mapper.saveSltrLcProd(vo);
        return vo.getOBJ_ID();
    }


    // Update
    public SltrLcProdDtlImgVO updateSltrLcProdDtlImg(SltrLcProdDtlImgVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcProdDtlImg(vo);
        return mapper.getSltrLcProdDtlImgById(vo.getOBJ_ID());
    }
    public SltrLcProdDtlVO updateSltrLcProdDtl(SltrLcProdDtlVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcProdDtl(vo);
        return mapper.getSltrLcProdDtlById(vo.getOBJ_ID());
    }
    public SltrLcProdRegistVO updateSltrLcProdRegist(SltrLcProdRegistVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcProdRegist(vo);
        return mapper.getSltrLcProdRegistById(vo.getOBJ_ID());
    }
    public SltrLcProdVO updateSltrLcProd(SltrLcProdVO vo){
        if(vo.getOBJ_ID().isEmpty()){
            throw new NullPointerException("Object id is empty");
        }
        mapper.updateSltrLcProd(vo);
        return mapper.getSltrLcProdById(vo.getOBJ_ID());
    }


    // Delete By Id
    public SltrLcProdDtlImgVO deleteSltrLcProdDtlImgById(String id){
        SltrLcProdDtlImgVO vo = this.getSltrLcProdDtlImgById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        mapper.deleteSltrLcProdDtlImgById(id);
        return vo;
    }
    public SltrLcProdDtlVO deleteSltrLcProdDtlById(String id){
        SltrLcProdDtlVO vo = this.getSltrLcProdDtlById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        mapper.deleteSltrLcProdDtlById(id);
        return vo;
    }
    public SltrLcProdRegistVO deleteSltrLcProdRegistById(String id){
        SltrLcProdRegistVO vo = this.getSltrLcProdRegistById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        mapper.deleteSltrLcProdRegistById(id);
        return vo;
    }
    public SltrLcProdVO deleteSltrLcProdById(String id){
        SltrLcProdVO vo = this.getSltrLcProdById(id);
        if(vo == null){
            throw new NullPointerException("Id is not defined" + id);
        }
        mapper.deleteSltrLcProdById(id);
        return vo;
    }


    // Get By Id
    public SltrLcProdDtlImgVO getSltrLcProdDtlImgById(String id){
        return mapper.getSltrLcProdDtlImgById(id);
    }
    public SltrLcProdDtlVO getSltrLcProdDtlById(String id){
        return mapper.getSltrLcProdDtlById(id);
    }
    public SltrLcProdRegistVO getSltrLcProdRegistById(String id){
        return mapper.getSltrLcProdRegistById(id);
    }
    public SltrLcProdVO getSltrLcProdById(String id){
        return mapper.getSltrLcProdById(id);
    }

}
