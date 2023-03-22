package com.plexter.sellter.agent.product.controller;

import com.plexter.sellter.agent.product.service.ProductService;
import com.plexter.sellter.agent.product.vo.SltrLcProdDtlImgVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdDtlVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdRegistVO;
import com.plexter.sellter.agent.product.vo.SltrLcProdVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sellter Agent Product Controller.")
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcPrdDtlImg", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcPrdDtlImg(SltrLcProdDtlImgVO vo){
        return service.saveSltrLcProdDtlImg(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcPrdDtl", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcPrdDtl(SltrLcProdDtlVO vo){
        return service.saveSltrLcProdDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcProdRegist", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcProdRegist(SltrLcProdRegistVO vo){
        return service.saveSltrLcProdRegist(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcProd", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdVO postSltrLcProd(SltrLcProdVO vo){
        return service.updateSltrLcProd(vo);
    }



    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcPrdDtlImg", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdDtlImgVO putSltrLcPrdDtlImg(SltrLcProdDtlImgVO vo){
        return this.service.updateSltrLcProdDtlImg(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcPrdDtl", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdDtlVO putSltrLcPrdDtl(SltrLcProdDtlVO vo){
        return service.updateSltrLcProdDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcProdRegist", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdRegistVO putSltrLcProdRegist(SltrLcProdRegistVO vo){
        return service.updateSltrLcProdRegist(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcProd", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdVO putSltrLcProd(SltrLcProdVO vo){
        return service.updateSltrLcProd(vo);
    }


    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcPrdDtlImg", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdDtlImgVO deleteSltrLcPrdDtlImg(@RequestParam("id") String id){
        return service.deleteSltrLcProdDtlImgById(id);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcPrdDtl", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdDtlVO deleteSltrLcPrdDtl(@RequestParam("id") String id){
        return service.deleteSltrLcProdDtlById(id);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcProdRegist", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdRegistVO deleteSltrLcProdRegist(@RequestParam("id") String id){
        return service.deleteSltrLcProdRegistById(id);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/deleteSltrLcProd", method = RequestMethod.DELETE)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdVO deleteSltrLcProd(@RequestParam("id") String id){
        return service.deleteSltrLcProdById(id);
    }

}
