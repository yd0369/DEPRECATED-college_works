#include<stdio.h>
 
int main()
{
	  int ARRAY[] = {1 ,2 ,3 ,4 ,2 ,5 ,3 ,4 ,2 ,6 ,7 ,8 ,7 ,9 ,7 ,8 ,2 ,5 ,4 ,9};
      int reference_string[20], page_faults = 0, m, n, s, pages, frames;
      pages = 20;
	  for(m = 0; m < pages; m++)
      {
            reference_string[m] = ARRAY[m] ;
      }
      frames = 3;
      int temp[frames];
      for(m = 0; m < frames; m++)
      {
            temp[m] = -1;
      }
      for(m = 0; m < pages; m++)
      {
            s = 0;
            for(n = 0; n < frames; n++)
            {
                  if(reference_string[m] == temp[n])
                  {
                        s++;
                        page_faults--;
                  }
            }     
            page_faults++;
            if((page_faults <= frames) && (s == 0))
            {
                  temp[m] = reference_string[m];
            }   
            else if(s == 0)
            {
                  temp[(page_faults - 1) % frames] = reference_string[m];
            }
            printf("\n");
            for(n = 0; n < frames; n++)
            {     
                  printf("%d\t", temp[n]);
            }
      } 
      printf("\nTotal Page Faults:\t%d\n", page_faults);
      return 0;
}
