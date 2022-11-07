package Day6.Exc1;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Cars extends Cars {

  private final int carNum;

  private final String carModel;

  AutoValue_Cars(
      int carNum,
      String carModel) {
    this.carNum = carNum;
    if (carModel == null) {
      throw new NullPointerException("Null carModel");
    }
    this.carModel = carModel;
  }

  @Override
  int carNum() {
    return carNum;
  }

  @Override
  String carModel() {
    return carModel;
  }

  @Override
  public String toString() {
    return "Cars{"
        + "carNum=" + carNum + ", "
        + "carModel=" + carModel
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Cars) {
      Cars that = (Cars) o;
      return this.carNum == that.carNum()
          && this.carModel.equals(that.carModel());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= carNum;
    h$ *= 1000003;
    h$ ^= carModel.hashCode();
    return h$;
  }

}
