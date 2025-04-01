#include <stdio.h>

void matrix_chain(int p[], int n) {
  int m[n][n];
  int kv[n][n];
  
    for (int i = 0; i < n; i++) {  
        for (int j = 0; j < n; j++) {
            m[i][j] = 0;
            kv[i][j] = 0;
        }
    }
  
  for (int i = n-2; i>=1; i--) {
    for (int j = i+1; j<n; j++) {
      m[i][j] = 999;
      kv[i][j] = 0;
      for (int k = i; k<=j-1; k++) {
        int res = m[i][k] + m[k+1][j] + (p[i]*p[k]*p[j]);
        if(m[i][j]>res) {
          m[i][j] = res;
          kv[i][j] = k;
        }
      }
    }
  }
  
  printf("the matrix is \n");
  for (int i = 1; i<n; i++) {
    for (int j = 1; j<n; j++) {
      printf("%d   ", kv[i][j]);
    }
    printf("\n");
  }
  
}

int main () {
  int p[] = {5,6,4,2,3};
  int size = sizeof(p)/sizeof(p[0]);
  matrix_chain(p,size);
  return 0;
}


/*
firstly pass the array of matrix sizes along with the length of it to the function
in the function firstly initialize all the cells with 0
suppose length of array = n so n-1 rows and coloumns each
then following bottom to top approach, starting with 2nd last row (n-2)th row we firstly initialise that cell with 9999
and then we compute with the formula 
m[i,k] + m[k+1,j] + (p[i-1] * p[k] * p[j]), we take the minimum result inside the k interation. and we put the correspong value of k. whereas k will run from [i, j-1]

*/