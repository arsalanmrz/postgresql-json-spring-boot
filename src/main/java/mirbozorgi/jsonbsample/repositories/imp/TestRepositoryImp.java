package mirbozorgi.jsonbsample.repositories.imp;

import mirbozorgi.jsonbsample.entity.Test;
import mirbozorgi.jsonbsample.repositories.TestRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImp extends CustomRepository implements TestRepository {

  @Override
  public Test save(Test test) {

    return save(Test.class, test);
  }

  @Override
  public Test findById(long id) {
    return findById(Test.class, id);
  }

  @Override
  public Test edit(Test test) {
    updateQueryWrapper(entityManager
        .createQuery("UPDATE Test t SET t.integerList = :integerList WHERE t.id = :id ")
        .setParameter("integerList", test.getIntegerList())
        .setParameter("id", test.getId()));

    return findById(test.getId());
  }
}
