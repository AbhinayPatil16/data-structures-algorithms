package src.main.com.agp.queue.StackofPlates;

public class StackNode {
  public StackNode above;
  public StackNode below;
  public int value;
  
  public StackNode(int value) {
    this.value = value;
  }
}