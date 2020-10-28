package ejercicio;


public class OlderedPair<K, V> implements Pair<K, V> {
   
  private K key;
  private V value;

  public OlderedPair(K key, V value) {
    this.key = key;
    this.value = value;
  }
@Override
  public K getKey() { return key; }
@Override
  public V getValue() { return value; } 
}
