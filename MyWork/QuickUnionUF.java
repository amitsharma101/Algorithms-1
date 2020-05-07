public class QuickUnionUF{
 private int arr[];
 
 public QuickUnionUF(int N){
  arr = new int[N];
  for(int i=0;i<N;i++)arr[i]=i;
 }

 public int root(int p){
  while(arr[p]!=p)p=arr[p];
  return p;
 }

 public boolean connected(int p,int q){
  return root(p)==root(q);
 }

 public void union(int p, int q){
  int pid = root(p);
  int qid = root(q);
  arr[pid] = qid;
 } 
}