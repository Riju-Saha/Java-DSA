#include<stdio.h>

struct Edge {
    int src, dest, wt;
};

void prims(struct Edge edges[], int ver, int edg) {
  int sum = 0;
  int i =0;
  int fwt = 0;
  while(i<7) {
    if(edges[i].src == edges[i+1].src) {
        if (edges[i].wt < edges[i+1].wt) {
          fwt += edges[i].wt ;
        } else {
          fwt += edges[i+1].wt;
        };
      i+=2;
    } else {
      fwt += edges[i].wt;
      i++;
    }
    
  }
  
  printf("min cost is  %d", fwt);
}

int main() {
  int ver = 5;
  int edg = ver-1;
  struct Edge edges[7];
  
  
  edges[0].src = 1;
  edges[0].dest = 2;
  edges[0].wt = 2;
  
  edges[1].src = 1;
  edges[1].dest = 3;
  edges[1].wt = 3;
  
  edges[2].src = 2;
  edges[2].dest = 3;
  edges[2].wt = 1;
  
  edges[3].src = 2;
  edges[3].dest = 4;
  edges[3].wt = 4;
  
  edges[4].src = 3;
  edges[4].dest = 4;
  edges[4].wt = 5;
  
  edges[5].src = 3;
  edges[5].dest = 5;
  edges[5].wt = 6;
  
  edges[6].src = 4;
  edges[6].dest = 5;
  edges[6].wt = 7;
  
  prims(edges, ver, edg);
  
  return 0;
  
}



/*

for prims it it to choose the minimum weight from the source vertex

the only trick is to implement while loop (i<total number of edges) and if consecutive src is same then we compare their weights 
increase the i +2 to avoid repeat checking. 

and if consecutive src is not same we simply add the weight. 

taking the smallest edges gurantees that cycle will not form

*/