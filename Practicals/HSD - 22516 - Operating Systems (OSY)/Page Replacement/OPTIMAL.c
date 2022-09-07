#include<stdio.h>
 
int main()
{
      int reference_string[25], frames[25], interval[25];
      int pages, total_frames, page_faults = 0;
      int m, n, temp, flag, found;
      int position, maximum_interval, previous_frame = -1;
      printf("\nEnter Total Number of Pages:\t");
      scanf("%d", &pages);
      printf("\nEnter Values of Reference String\n");
      for(m = 0; m < pages; m++)
      { 
            printf("Value No.[%d]:\t", m + 1);
            scanf("%d", &reference_string[m]);
      }
      printf("\nEnter Total Number of Frames:\t");
      scanf("%d", &total_frames);
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
