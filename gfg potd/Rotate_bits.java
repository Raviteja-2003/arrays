class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
          ArrayList<Integer> result = new ArrayList<>();
          D=D%16;
          int left=(N<<D|N>>(16-D))&65535;
          int right=(N>>D|N<<(16-D))&65535;
          result.add(left);
          result.add(right);
          return result;
    }
}