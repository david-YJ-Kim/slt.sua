package com.tsh.slt.agent.domain.product.controller;

import com.tsh.slt.agent.domain.product.service.SltrLcProdService;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdDtlImgVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdDtlVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdRegistVO;
import com.tsh.slt.agent.domain.product.vo.SltrLcProdVO;
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
    SltrLcProdService service;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcPrdDtlImg", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcPrdDtlImg(@RequestBody SltrLcProdDtlImgVO vo){

        System.out.println(vo.toString());
        return service.saveSltrLcProdDtlImg(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcPrdDtl", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcPrdDtl(@RequestBody SltrLcProdDtlVO vo){

        System.out.println(vo.toString());
        return service.saveSltrLcProdDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcProdRegist", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcProdRegist(@RequestBody SltrLcProdRegistVO vo){

        System.out.println(vo.toString());
        return service.saveSltrLcProdRegist(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/postSltrLcProd", method = RequestMethod.POST)
    @Operation(description = "TBD", summary = "TBD")
    public String postSltrLcProd(@RequestBody SltrLcProdVO vo){

        System.out.println(vo.toString());
        return service.saveSltrLcProd(vo);
    }



    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcPrdDtlImg", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdDtlImgVO putSltrLcPrdDtlImg(@RequestBody SltrLcProdDtlImgVO vo){
        System.out.println(vo.toString());
        return this.service.updateSltrLcProdDtlImg(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcPrdDtl", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdDtlVO putSltrLcPrdDtl(@RequestBody SltrLcProdDtlVO vo){

        System.out.println(vo.toString());
        return service.updateSltrLcProdDtl(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcProdRegist", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdRegistVO putSltrLcProdRegist(@RequestBody SltrLcProdRegistVO vo){
        System.out.println(vo.toString());
        return service.updateSltrLcProdRegist(vo);
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/putSltrLcProd", method = RequestMethod.PUT)
    @Operation(description = "TBD", summary = "TBD")
    public SltrLcProdVO putSltrLcProd(@RequestBody SltrLcProdVO vo){
        System.out.println(vo.toString());
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
