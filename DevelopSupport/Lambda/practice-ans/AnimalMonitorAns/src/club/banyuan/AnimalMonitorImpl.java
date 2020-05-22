package club.banyuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 监视不同种类动物的数量。由观察者记录目击事件。
 */
public class AnimalMonitorImpl implements AnimalMonitor {

  // 记录所有发现的动物。
  private ArrayList<Sighting> sightings;

  /**
   * 创建一个AnimalMonitor。
   */
  public AnimalMonitorImpl() {
    this.sightings = new ArrayList<>();
  }

  /**
   * 打印所有目击动物的详细信息。
   */
  @Override
  public void printList() {
    for (Sighting record : sightings) {
      System.out.println(record.getDetails());
    }
  }

  /**
   * 打印给定动物的所有目击细节。
   *
   * @param animal 动物的类型。
   */
  @Override
  public void printSightingsOf(String animal) {
    for (Sighting record : sightings) {
      if (animal.equals(record.getAnimal())) {
        System.out.println(record.getDetails());
      }
    }
  }

  /**
   * 打印给定观察者的所有目击动物。
   *
   * @param spotter 观察者的ID。
   */
  @Override
  public void printSightingsBy(int spotter) {
    for (Sighting record : sightings) {
      if (record.getSpotter() == spotter) {
        System.out.println(record.getDetails());
      }
    }
  }

  /**
   * 打印一份被视为濒临灭绝的动物的清单。
   *
   * @param animalNames     动物名称列表。
   * @param dangerThreshold 小于或等于此级别的动物总数被认为濒临灭绝的
   */
  @Override
  public void printEndangered(ArrayList<String> animalNames,
      int dangerThreshold) {
    for (String animal : animalNames) {
      if (getCount(animal) <= dangerThreshold) {
        System.out.println(animal + "濒临灭绝");
      }
    }
  }

  /**
   * 返回给定动物目击次数。
   *
   * @param animal 动物的类型。
   * @return 给定动物的目击次数总数。
   */
  @Override
  public int getCount(String animal) {
    int total = 0;
    for (Sighting sighting : sightings) {
      if (animal.equals(sighting.getAnimal())) {
        total = total + sighting.getCount();
      }
    }
    return total;
  }

  /**
   * 从发现清单中删除计数为零的记录。
   */
  @Override
  public void removeZeroCounts() {
    Iterator<Sighting> it = sightings.iterator();
    while (it.hasNext()) {
      Sighting record = it.next();
      if (record.getCount() == 0) {
        it.remove();
      }
    }
  }

  /**
   * 返回特定区域内给定类型的动物的所有动物清单。
   *
   * @param animal 动物的类型。
   * @param area   区域的ID。
   * @return 目击清单。
   */
  @Override
  public List<Sighting> getSightingsInArea(String animal, int area) {
    ArrayList<Sighting> records = new ArrayList<>();
    for (Sighting record : sightings) {
      if (animal.equals(record.getAnimal())) {
        if (record.getArea() == area) {
          records.add(record);
        }
      }
    }
    return records;
  }

  /**
   * 返回给定动物的所有目击清单。
   *
   * @param animal 动物的类型。
   * @return 给定动物的所有目击物清单。
   */
  @Override
  public List<Sighting> getSightingsOf(String animal) {
    ArrayList<Sighting> filtered = new ArrayList<>();
    for (Sighting record : sightings) {
      if (animal.equals(record.getAnimal())) {
        filtered.add(record);
      }
    }
    return filtered;
  }

}
