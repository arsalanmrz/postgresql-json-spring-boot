package mirbozorgi.jsonbsample.repositories;


import mirbozorgi.jsonbsample.entity.Test;

public interface TestRepository {

  Test save(Test test);

  Test findById(long id);

  Test edit(Test test);


}
