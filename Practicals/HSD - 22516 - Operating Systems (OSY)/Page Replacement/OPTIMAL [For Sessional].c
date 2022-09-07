#include<stdio.h>
 
int main()
{
	int ARRAY[] = {1 ,2 ,3 ,4 ,2 ,5 ,3 ,4 ,2 ,6 ,7 ,8 ,7 ,9 ,7 ,8 ,2 ,5 ,4 ,9};
      int reference_string[25], frames[25], interval[25];
      int pages, total_frames, page_faults = 0;
      int m, n, temp, flag, found;
      int position, maximum_interval, previous_frame = -1;
      pages = 20;
	  for(m = 0; m < pages; m++)
      {
            reference_string[m] = ARRAY[m] ;
      }
      total_frames = 3;
      for(m = 0; m < total_frames; m++) 
      {
            frames[m] = -1;
      }
      for(m = 0; m < pages; m++)
      {
            flag = 0;
            for(n = 0; n < total_frames; n++)
            {
                  if(frames[n] == reference_string[m])
                  {
                        flag = 1;
                        printf("\t");
                        break;
                  }
            }
            if(flag == 0) 
            {
                  if (previous_frame == total_frames - 1)
                  {
                        for(n = 0; n < total_frames; n++)
                        {      
                              for(temp = m + 1; temp < pages; temp++)
                              {      
                                    interval[n] = 0;
                                    if (frames[n] == reference_string[temp])
                                    {      
                                          interval[n] = temp - m;
                                          break;
                                    }
                              }
                        }
                        found = 0;
                        for(n = 0; n < total_frames; n++)
                        {
                              if(interval[n] == 0)
                              {                 
                                    position = n;
                                    found = 1;
                                    break;
                              }            
                        }
                  }
                  else
                  {
                        position = ++previous_frame;
                        found = 1;
                  }
                  if(found == 0)
                  {
                        maximum_interval = interval[0];
                        position = 0;
                        for(n = 1; n < total_frames; n++)
                        {
                              if(maximum_interval < interval[n])
                              {
                                    maximum_interval = interval[n];
                                    position = n;
                              }
                        }
                   }     
                   frames[position] = reference_string[m];
                   printf("FAULT\t");
                   page_faults++;
            }
            for(n = 0; n < total_frames; n++)
            {
                  if(frames[n] != -1) 
                  {
                        printf("%d\t", frames[n]);
                  }
            }
            printf("\n");
      }
      printf("\nTotal Number of Page Faults:\t%d\n", page_faults);
      return 0;
}
