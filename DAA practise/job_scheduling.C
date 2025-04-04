#include<stdio.h>

void scheduling(int profits[], int deadlines[], int size, int max_deadline) {
  int ar[max_deadline];
  int max_profit = 0;
  
  for(int i=0; i<max_deadline; i++) {
    ar[i] = 0;
  }
  
  for(int i=0; i<size; i++) {
    for(int j=deadlines[i]-1; j>=0; j--) {
      if(ar[j] == 0) {
        ar[j] = profits[i];
        break;
      }
    }
  }
  
  for(int i=0; i<max_deadline; i++) {
    printf("%d  ", ar[i]);
    max_profit += ar[i];
  }
  
  printf("\nmax profit is  %d", max_profit);
}

int main() {
  // String job_name[] = {"j1", "j2", "j3", "j4", "j5"};
  int profits[] = {20, 15, 10, 5, 1};
  int deadlines[] = {2, 2, 1, 3, 3};
  int size = sizeof(profits)/sizeof(profits[0]);
  int max_deadline = deadlines[0];
  for (int i=1; i<size; i++) {
    if(deadlines[i]>max_deadline) {
      max_deadline = deadlines[i];
    }
  }
  
  scheduling(profits, deadlines, size, max_deadline);
  return 0;
}


/*
each job takes 1 unit of time. if a job deadline is 2 then it can be placed in 0-1 slot or 1-2 slot. 2 basically tells that within 2 the job must have been done taking 1 hr


here first sort profits and deadlines array in descending order based on profits and the pass the sorted profits and deadline arrays to function
find the max deadline in deadline array
create another array of size max deadline and initilaze all of them to 0
iterate through each sorted deadline array and inner iterate from corresponding deadline -1 to 0 and check whether that cell in ar is zero or not. if zero store corresponding profit and then break
calcualte max profit
*/