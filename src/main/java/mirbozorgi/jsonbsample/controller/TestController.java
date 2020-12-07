package mirbozorgi.jsonbsample.controller;



import mirbozorgi.jsonbsample.domain.TestData;
import mirbozorgi.jsonbsample.entity.Test;

import mirbozorgi.jsonbsample.service.TestService;
import mirbozorgi.jsonbsample.util.helper.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


  @Autowired
  private TestService service;

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseEntity add(
      @RequestBody TestData test
  ) {
    return ResponseHelper.response(
        service.save(test));

  }


  @RequestMapping(value = "/edit", method = RequestMethod.POST)
  public ResponseEntity edit(
      @RequestBody Test test
  ) {
    return ResponseHelper.response(
        service.edit(test));
  }


  @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
  public ResponseEntity get(
      @PathVariable("id") long id) {
    return ResponseHelper.response(
        service.findById(id));

  }


}
