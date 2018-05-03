package com.example.demo.controller;


import com.example.demo.repository.MMEnforcementEntityRepository;
import com.example.demo.utilities.Utility;
import com.example.demo.models.MMEnforceMentEntity;
import com.example.demo.models.ResponseWrapper;
import com.example.demo.services.MMEnforcementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/demo")
public class MMEnforceMent {

//    @Autowired
//    MMEnforcementService mmEnforcementService;
    @Autowired
    MMEnforcementEntityRepository mmEnforcementEntityRepository;

    @RequestMapping(value="/submitEnforceMent" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper submitEnforcement(@RequestBody MMEnforceMentEntity mmEnforceMentEntity){

        ResponseWrapper responseWrapper = new ResponseWrapper();
        String complaintID = Utility.getConfirmationID();
        mmEnforceMentEntity.setComplaintId(complaintID);
        mmEnforceMentEntity.setStatuCode("Accepted");

        try{
            mmEnforcementEntityRepository.save(mmEnforceMentEntity);
            responseWrapper.setStatusMsg("Success");
            responseWrapper.setComplaintId(complaintID);
            responseWrapper.setStatusCode("Accepted");
        }catch(Exception e){
            responseWrapper.setStatusMsg("Fail");
        }



        return responseWrapper ;
    }

    @RequestMapping(value="/checkEnforceMentStatus" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseWrapper checkEnforcementStatus(@RequestBody MMEnforceMentEntity mmEnforceMentEntity){

        ResponseWrapper responseWrapper = new ResponseWrapper();

        MMEnforceMentEntity mmEnforceMentEntity1 = mmEnforcementEntityRepository.findByComplaintId(mmEnforceMentEntity.getComplaintId());
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
