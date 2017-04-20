public interface SymbolTable<TYPE>{
  public TYPE[] values;
  public int[] indexs;
  public void add(TYPE in);
}