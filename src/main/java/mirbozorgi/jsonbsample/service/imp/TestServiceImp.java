package mirbozorgi.jsonbsample.service.imp;

import mirbozorgi.jsonbsample.domain.TestData;
import mirbozorgi.jsonbsample.entity.Test;
import mirbozorgi.jsonbsample.repositories.TestRepository;
import mirbozorgi.jsonbsample.service.TestService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService {

  @Autowired
  private TestRepository testRepository;


  @Transactional
  @Override
  public Test save(TestData testData) {
    return testRepository.save(new Test(testData.getIntegerList()));
  }

  @Override
  public Test findById(long id) {
    return testRepository.findById(id);
  }

  @Transactional
  @Override
  public Test edit(Test test) {
    return testRepository.edit(test);
  }
}
