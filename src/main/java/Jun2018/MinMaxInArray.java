package Jun2018;

public class MinMaxInArray {
  private int min;
  private int max;

  public int getMin() {
    return this.min;
  }

  public MinMaxInArray withMin(int min) {
    this.min = min;
    return this;
  }

  public int getMax() {
    return this.max;
  }

  public MinMaxInArray withMax(int max) {
    this.max = max;
    return this;
  }

  public void findMinMax(int[] array) {
    this.withMax(array[0]);
    this.withMin(array[0]);

    for(int i = 1; i < array.length; i++) {
      if(array[i] < this.getMin()) {
        this.withMin(array[i]);
      }
      if(array[i] > this.getMax()) {
        this.withMax(array[i]);
      }
    }
  }
}
