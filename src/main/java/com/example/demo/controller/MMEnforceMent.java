package com.example.demo.controller;


import com.example.demo.Utility;
import com.example.demo.models.MMEnforceMentData;
import com.example.demo.models.MMEnforceMentEntity;
import com.example.demo.models.ResponseWrapper;
import com.example.demo.services.MMEnforcementService;
import com.example.demo.services.MMEnforcementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/demo")
public class MMEnforceMent {

    @Autowired
    MMEnforcementService mmEnforcementService;

    @RequestMapping(value="/submitEnforceMent" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper submitEnforcement(@RequestBody MMEnforceMentEntity mmEnforceMentEntity){

        ResponseWrapper responseWrapper = new ResponseWrapper();
        String complaintID = Utility.getConfirmationID();
        mmEnforceMentEntity.setComplaintId(complaintID);
        mmEnforceMentEntity.setStatuCode("Accepted");

        String returnMsg = mmEnforcementService.saveEnforcementData(mmEnforceMentEntity);

        if(returnMsg == "Success"){
            responseWrapper.setStatusMsg("Success");
            responseWrapper.setComplaintId(complaintID);
            responseWrapper.setStatusCode("Accepted");
        }else{
            responseWrapper.setStatusMsg("Fail");
        }

        return responseWrapper ;
    }

    @RequestMapping(value="/checkEnforceMentStatus" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper checkEnforcementStatus(@RequestBody MMEnforceMentEntity mmEnforceMentEntity){

        ResponseWrapper responseWrapper = new ResponseWrapper();

        MMEnforceMentEntity mmEnforceMentEntity1 = mmEnforcementService.getEnforcementStatus(mmEnforceMentEntity);
        if(mmEnforceMentEntity1 != null){
            responseWrapper.setStatusMsg("Success");
            responseWrapper.setStatusMsg(mmEnforceMentEntity.getComplaintId());
            responseWrapper.setStatusMsg(mmEnforceMentEntity.getStatuCode());
        }else{
            responseWrapper.setStatusMsg("Fail");
        }

        return responseWrapper;
    }


}
