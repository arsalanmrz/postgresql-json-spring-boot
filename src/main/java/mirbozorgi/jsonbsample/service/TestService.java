package mirbozorgi.jsonbsample.service;


import mirbozorgi.jsonbsample.domain.TestData;
import mirbozorgi.jsonbsample.entity.Test;

public interface TestService {

  Test save(TestData testData);

  Test findById(long id);

  Test edit(Test test);
}
