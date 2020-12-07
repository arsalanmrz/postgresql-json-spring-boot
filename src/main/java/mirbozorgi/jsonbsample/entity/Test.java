package mirbozorgi.jsonbsample.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import org.hibernate.annotations.Type;


@Entity
@Table(name = "test")

public class Test extends Base {


  @Type(type = "int-array")
  @Column(columnDefinition = "integer[]")
  @Basic(fetch = FetchType.LAZY)
  private int[] integerList;

  public Test() {
  }

  public Test(int[] integerList) {
    this.integerList = integerList;
  }

  public int[] getIntegerList() {
    return integerList;
  }

  public void setIntegerList(int[] integerList) {
    this.integerList = integerList;
  }
}
