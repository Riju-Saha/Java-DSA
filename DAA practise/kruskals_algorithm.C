#include <stdio.h>

struct Edge {
    int src, dest, wt;
};

void kruskal(struct Edge edges[], int v, int e) {
  int target = v-1;   //3
  int cost = 0;
  
  for(int i=0; i<e; i++) {  //sorting in ascending order respect to weight.
    for(int j=i+1; j<e; j++) {
      if(edges[i].wt>edges[j].wt) {
        int temp_src = edges[i].src;
        int temp_dest = edges[i].dest;
        int temp_wt = edges[i].wt;
        
        edges[i].src = edges[j].src;
        edges[i].dest = edges[j].dest;
        edges[i].wt = edges[j].wt;
        
        edges[j].src = temp_src;
        edges[j].dest = temp_dest;
        edges[j].wt = temp_wt;
      }
    }
  }
  
  for (int i=0;i<e; i++) {
    printf("%d   %d   %d \n", edges[i].src, edges[i].dest, edges[i].wt);
  }

  int root_src = edges[0].src;  //2
  int root_dest = edges[0].dest; // 3 
  int root_wt = edges[0].wt; // 4
  cost += root_wt;  //manually add krlm karon acsending a eta lowest.
  target--;
  
  for(int i = 1; i<e; i++) {
    if (target!=0) {
      if(root_dest == edges[i].src || root_src == edges[i].dest) {   //karur start karur end hbena and vice versa
        continue; 
      } else {
        cost += edges[i].wt;
        printf("edge (%d -->  %d  =  %d \n)", edges[i].src, edges[i].dest, edges[i].wt);
        target--;
      }
    } else {
      break;
    }
  }
  
  printf("MST cost is %d ", cost);

}

int main() {
  int ver = 4;
  int edg = ver-1;   // this number of edg should be there in kruskal output
  struct Edge edges[5];   // need to provide every edge
  
  edges[0].src = 0;
  edges[0].dest = 1;
  edges[0].wt = 10;
  
  edges[1].src = 0;
  edges[1].dest = 2;
  edges[1].wt = 6;
  
  edges[2].src = 0;
  edges[2].dest = 3;
  edges[2].wt = 5;
  
  edges[3].src = 1;
  edges[3].dest = 3;
  edges[3].wt = 15;
  
  edges[4].src = 2;
  edges[4].dest = 3;
  edges[4].wt = 4;
  

  kruskal(edges, ver, edg);
  return 0;
}


/*
prims algorith 
edges = vertices -1 r shetai thkte hbe in every mst
jst plot the points. and connect with those vertices whose weights are lowest, ascending order. and how many veritces to join? no.of edges calculated abvoe

*/