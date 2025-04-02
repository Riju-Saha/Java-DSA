#include <stdio.h>

void knapsack(int p[], int w[], int n, int m){
  double pw[n-1];
  for(int i = 0; i<n; i++) {
     pw[i] = (double)p[i]/w[i];
  }
  printf("before sorting \n");
  for(int i = 0; i<n; i++) {
    printf("%d    %d     %.2f \n", p[i], w[i], pw[i]);
  }
  
  for(int i=0; i<n-1; i++) {
    for (int j=i+1; j<n; j++) {
      if (pw[i] < pw[j]) {
        int temp_p = p[i];
        int temp_w = w[i];
        double temp_pw = pw[i];
        p[i] = p[j];
        w[i] = w[j];
        pw[i] = pw[j];
        p[j] = temp_p;
        w[j] = temp_w;
        pw[j] = temp_pw;
      }
    }
  }

  
  printf("after sorting \n");
  printf("p     w     p/w \n");
  for(int i = 0; i<n; i++) {
    printf("%d    %d     %.2f \n", p[i], w[i], pw[i]);
  }
  
  
  double max_profit = 0.00;
  for (int i = 0; i<n; i++) {
    if(m>=w[i]) {
      max_profit += (pw[i]*w[i]);
      m -= w[i];
    } else if (m>0) {
      max_profit += (pw[i]*m);
      m -=w[i];
    } else {
      break;
    }
  }
  printf("max profit is: %.2f ", max_profit);
}

int main() {
  int profit[] = {10, 5, 15, 7, 6, 18, 3};
  int weights[] = {2, 3, 5, 7, 1, 4, 1};
  int size = sizeof(profit)/sizeof(profit[0]);
  int m = 15;
  knapsack(profit, weights, size, m);
  return 0;
}



/*
pass profit array, weight array, length of array, bag weight to function

in the function create another array p/w to store corresponding p/w ratio 
then sort profit array, weight array, p/w array in descending order with respect to p/w array

now keep adding profit and substract corresponding object weight from bag weight untill and unless the bag weight is greater less than the next object weight but greater than zero
in that case we will multiply corresponding p/w ratio with the remaining weight and add the profit. 

the p/w ratio array will be in double type and for that %.2f and for integer it is %d
*/