public class QuickUnionUFWeightedWithPathCompression{
 private int arr[];
 private int siz[];

 public QuickUnionUFWeightedWithPathCompression(int N){
  arr = new int[N];
  siz = new int[N];
  for(int i=0;i<N;i++){
   arr[i]=i;
   siz[i]=0;
  }
 }

 public int root(int p){
  while(arr[p]!=p){
   arr[p]=arr[arr[p]];
   p=arr[p];
  }
  return p;
 }

 public boolean connected(int p,int q){
  return root(p)==root(q);
 }

 public void union(int p,int q){
  int pid = root(p);
  int qid = root(q);
  if(siz[pid]>siz[qid]){
   arr[qid]=pid;
   siz[pid]+=siz[qid];
  }else{
   arr[pid]=qid;
   siz[qid]+=siz[pid];
  }
 }
}