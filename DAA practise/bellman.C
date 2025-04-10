# include <stdio.h>
#define INT_MAX 99999
struct Edge {
    int src, dest, weight;
};

void bell(struct Edge edges[], int src) {
  int dist[3];
    for (int i = 0; i < 3; i++) {
        dist[i] = INT_MAX;
    }
    dist[0] = 0;
    for(int i =1; i<3; i++) {
      for(int j=0; j<3;j++) {
        if(edges[j].weight+dist[edges[j].src] < dist[edges[j].dest]) {
          dist[edges[j].dest] = edges[j].weight+dist[edges[j].src];
        }
      }
    }
    
    for(int i=0; i<3; i++) {
      printf("%d \n", dist[i]);
    }
}

int main () {
  struct Edge edges[] = {
      {0, 1, 4},
      {0, 2, 5},
      {1, 2, -2}
  };
  int source = 0;
  bell(edges, source);
  
}


/*
first edges structure banabo with src, dest, weight
int main a struct array create kre r desired source node ta function a send krbo
in function create another array dist of size vertex number (3) for storing the distance 
initialize all the index with 99999 except dist[source] = 0
run first loop for v-1 times then nested loop from 1 to V-1 and check the following
if (distance of current node + cost of source to destination node < dist of current node's destination node) then
    assign criss cross means "<" left part ta right a hbe r vice versa means
    dist of current node's destination node   =   distance of current node + cost of source to destination node

*/