#include <stdio.h>
#include <string.h>



main()

{
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ DECLARATION/INTIALIZATION STARTING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    
	// int variables >>>>>>>>>>>>>>>>>>>>>
	
	int options_selection,num,num_2,input_num_1,the_end_with_default=0;
    
	// <<<<<<<<<<<<<<<<<<<<< int variables
    
    // char array >>>>>>>>>>>>>>>>>>>>>>>>
	
	char STR_IN_1[1000],STR_IN_2[1000],STR_OUT_1[1000],STR_OUT_2[1000],temprorary_string[1000];
    
    // <<<<<<<<<<<<<<<<<<<<<<<< char array 
    
	// option title strings >>>>>>>>>>>>>>
	
	char option[80]={"\n\nYou Have Choosen :-  "};
    char option_1[80]={"Calculate the length of string"};
    char option_2[80]={"Calculate the length of string [with max length function]"};
	char option_3[80]={"Copy a string to another string"};
	char option_4[80]={"Copy a number (custom number limit or range) string to another string"};
	char option_5[80]={"Concatenate (joins) two strings"};
	char option_6[80]={"Concatenate number(custom number limit or range) two strings"};
	char option_7[80]={"Compare two string [CASE SENSITIVE]"};
	char option_8[80]={"Compare two string [WITHOUT CASE SENSITIVE]"};
	char option_9[80]={"Convert string to lowercase"};
	char option_10[80]={"Convert string to uppercase"};
	char option_11[80]={"Reverse a string"};	
	char option_12[80]={"Find if the string is Palindrome or not"};
	char option_13[80]={"Print string number of times on console"};
	char option_14[80]={"String Swapping"};
	char option_15[80]={"Print each string characters one by one"};
	char option_16[80]={"Find vowel(s) from string one by one"};
	char option_17[80]={"Find consonant(s) from string one by one"};
	char option_18[80]={"Print each string character(s) one by one with vowel(s) and consonant(s) status"};
	char option_19[80]={"Find number of vowel(s) from string only"};
	char option_20[80]={"Find number of consonant(s) from string only"};
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ DECLARATION/INTIALIZATION ENDING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
	// <<<<<<<<<<<<<< option title strings 
	
	// seperators strings >>>>>>>>>>>>>>>>
	
	char seperator_1[500]={"......................................................................................"};
    char seperator_2[500]={"**************************************************************************************"};
    char seperator_3[500]={"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"};
    char seperator_4[500]={"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"};
    char seperator_5[500]={"//////////////////////////////////////////////////////////////////////////////////////"};
    char seperator_6[500]={"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"};
    char seperator_7[500]={"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"};
    char seperator_8[500]={"______________________________________________________________________________________"};
    
    // <<<<<<<<<<<<<<<< seperators strings
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ WELCOME SCREEN ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~STARTING~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
	printf("                                Programming in 'C'\n\n");
    printf("                                  Microproject\n");
    printf("                                String Functions\n");
    printf("             <<<<<<<<<<<-----------  20 in 1  ----------->>>>>>>>>>>\n");
    printf("%s\n\n",seperator_7);
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ENDING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  OPTIONS MENU  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~STARTING~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    
	printf("1.  %s\n2.  %s\n3.  %s\n4.  %s\n5.  %s\n",option_1,option_2,option_3,option_4,option_5);
    printf("6.  %s\n7.  %s\n8.  %s\n9.  %s\n10. %s\n",option_6,option_7,option_8,option_9,option_10);
	printf("11. %s\n12. %s\n13. %s\n14. %s\n15. %s\n",option_11,option_12,option_13,option_14,option_15);
	printf("16. %s\n17. %s\n18. %s\n19. %s\n20. %s\n",option_16,option_17,option_18,option_19,option_20);
	printf("%s\n%s\n",seperator_1,seperator_2);
	printf("CHOOSE FROM THE FOLLOWING OPTIONS [1-20]:- ");
    scanf("%d",&options_selection);
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ENDING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
    
	//CLEAR SCREEN COMMAND
	system("cls");
    
    //UNDER NEW BLANK SCREEN
    
    printf("%s %d",option,options_selection);
    

    switch(options_selection)
    {
    
	
	
		case 1:
    	{
    		printf("\n\n>>> %s <<< \n \n",option_1);
    		printf("Enter the String :- ");
    		scanf("%s",&STR_IN_1);
    		printf(" \n \nLength of given string [  %s  ]: %d \n \n" , STR_IN_1 , strlen (STR_IN_1) );
		}
		break;
		
		
		case 2:
    	{
		    printf("\n\n>>> %s <<< \n \n",option_2);
			printf("Enter the String :- ");
    		scanf("%s",&STR_IN_1);
    		printf("Enter the MAX Length :- ");
			scanf("%d",&input_num_1);
    		printf(" \n \nLength of given string [  %s  ]: %d \n \n" , STR_IN_1 , strnlen(STR_IN_1, input_num_1) );
		}
		break;
		
		
		case 3:
		{
			printf("\n\n>>> %s <<< \n \n",option_3);
			printf("Enter the String [A] :- ");
			scanf("%s",&STR_IN_1);
			strcpy(STR_OUT_1,STR_IN_1);
            printf("Value of String [A] :- %s \nValue of String [B] :- %s ",STR_IN_1,STR_OUT_1);
			
		}
		break;
		
		
		case 4:
		{
			 printf("\n\n>>> %s <<< \n \n",option_4);
			printf("Enter the String [A] :- ");
			scanf("%s",&STR_IN_1);
			printf("Enter number of character you want from String [A] :- ");
			scanf("%d",&input_num_1);
			strncpy(STR_OUT_1,STR_IN_1,input_num_1);
            printf("Value of String [A] :- %s \nValue of String [B] :- %s ",STR_IN_1,STR_OUT_1);
			
		}
		break;
		
		
		case 5:
		{
			printf("\n\n>>> %s <<< \n \n",option_5);
			 printf("Enter the String [A] :- ");
			 canf("%s",&STR_IN_1);
			printf("Enter the String [B] :- ");
			 nf("%s",&STR_IN_2);
			strcat(STR_IN_1,STR_IN_2);
			strcpy(STR_OUT_1,STR_IN_1);
			printf("String [C] :- %s",STR_OUT_1);
		
		}
		break;
		
		
		case 6:
		{
			printf("\n\n>>> %s <<< \n \n",option_6);
			printf("Enter the String [A] :- ");
			scanf("%s",&STR_IN_1);
			printf("Enter the String [B] :- ");
			scanf("%s",&STR_IN_2);
			printf("Enter number of character you want from String [B] :- ");
			scanf("%d",&input_num_1);
			strncat(STR_IN_1,STR_IN_2,input_num_1);
			strcpy(STR_OUT_1,STR_IN_1);
			printf("String [C] :- %s",STR_OUT_1);
		}
		break;
		
		
		case 7:
		{
			printf("\n\n>>> %s <<< \n \n",option_7);
			printf("Enter the String [A] :- ");
			scanf("%s",&STR_IN_1);
			printf("Enter the String [B] :- ");
			scanf("%s",&STR_IN_2);
			if (strcmp(STR_IN_1,STR_IN_2) ==0)
			{
				printf("String [A] and String [B] are equal");
            }
			
			else
		    {
		    	printf("String [A] and String [B] are different");
            }
			
		}
		break;
		
		
		case 8:
		{
			printf("\n\n>>> %s <<< \n \n",option_8);
			printf("Enter the String [A] :- ");
			scanf("%s",&STR_IN_1);
			printf("Enter the String [B] :- ");
			scanf("%s",&STR_IN_2);
			if (strcmpi(STR_IN_1,STR_IN_2) ==0)
			{
				printf("String [A] and String [B] are equal");
            }
			
			else
		    {
		    	printf("String [A] and String [B] are different");
            }
			
		}
		break;
		
		
		case 9:
		{
			printf("\n\n>>> %s <<< \n \n",option_9);
			printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			strlwr(STR_IN_1);
			strcpy(STR_OUT_1,STR_IN_1);
			printf("Lower Cased String :- %s",STR_OUT_1);
		}
		break;
		
		case 10:
		{
			printf("\n\n>>> %s <<< \n \n",option_10);
			printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			strupr(STR_IN_1);
			strcpy(STR_OUT_1,STR_IN_1);
			printf("Upper Cased String :- %s",STR_OUT_1);
		}
		break;
		
		case 11:
		{
			printf("\n\n>>> %s <<< \n \n",option_11);
			printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			strrev(STR_IN_1);
			strcpy(STR_OUT_1,STR_IN_1);
			printf("Reversed String :- %s",STR_OUT_1);
		}
		break;
		
		case 12:
		{
			printf("\n\n>>> %s <<< \n \n",option_12);
			printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			strcpy(STR_IN_2,STR_IN_1);
            strrev(STR_IN_2);
            if(strcmp(STR_IN_1,STR_IN_2) == 0)
            {
            	printf("Entered string [ %s ] is a palindrome.\n",STR_IN_1);
            }
            else
			{
				printf("Entered string [ %s ] is not a palindrome.\n",STR_IN_1);
			}
		}
		break;
		
		case 13:
		{
			printf("\n\n>>> %s <<< \n \n",option_13);
			printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			printf("Enter number of times you want to print it :- ");
			scanf("%d",&input_num_1);
			num_2=0;
			strcpy(STR_OUT_1,STR_IN_1);
			for(num=0;num<input_num_1;num=++num ) 
			{
				num_2=++num_2;
				printf("%d.)  %s\n",num_2,STR_OUT_1);
            }
		}
		break;
		
		
		case 14:
		{
			printf("\n\n>>> %s <<< \n \n",option_14);
		    printf("Enter the String [A] :- ");
			scanf("%s",&STR_IN_1);
			printf("Enter the String [B] :- ");
			scanf("%s",&STR_IN_2);
			strcpy(temprorary_string,STR_IN_1);
			strcpy(STR_IN_1,STR_IN_2);
			strcpy(STR_IN_2,temprorary_string);
			printf("\n\n                 After swapping the values of :- \n");
			printf("\n                     String [A] :-  %s",STR_IN_1);
			printf("\n                     String [B] :-  %s",STR_IN_2); 
		}
		break;
		
			
		
		case 15:
		{
			printf("\n\n>>> %s <<< \n \n",option_15);
		    printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			num_2=1;
			printf("\n");
			for (num = 0; STR_IN_1[num] != '\0'; num++)
			{
            printf("%d  ---  %c\n",num_2,STR_IN_1[num]);
      		num_2++;
			}
	    }
		break;
		
		
		
		case 16:
		{
			printf("\n\n>>> %s <<< \n \n",option_16);
		    printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			num_2=1;
			printf("\n\n\nVowel(s) :- \n\n");
			for (num = 0; STR_IN_1[num] != '\0'; num++)
			{
				if(STR_IN_1[num]=='a'||STR_IN_1[num]=='A'||STR_IN_1[num]=='e'||STR_IN_1[num]=='E'||STR_IN_1[num]=='i'||STR_IN_1[num]=='I'||STR_IN_1[num]=='o'||STR_IN_1[num]=='O'||STR_IN_1[num]=='u'||STR_IN_1[num]=='U')
                {
                	printf("%d  ---  %c\n",num_2,STR_IN_1[num]);
      	            num_2++;
		    	}
		    }
	    }
		break;
		
		
		
		case 17:
		{
			printf("\n\n>>> %s <<< \n \n",option_17);
		    printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			num_2=1;
			printf("\n\n\nConsonant(s) :- \n\n");
			for (num = 0; STR_IN_1[num] != '\0'; num++)
			{
				if(STR_IN_1[num]!='a'&& STR_IN_1[num]!='A'&& STR_IN_1[num]!='e' && STR_IN_1[num]!='E' && STR_IN_1[num]!='i' && STR_IN_1[num]!='I' && STR_IN_1[num]!='o' && STR_IN_1[num]!='O' && STR_IN_1[num]!='u' && STR_IN_1[num]!='U')
                {
                	printf("%d  ---  %c\n",num_2,STR_IN_1[num]);
      	            num_2++;
		    	}
		    }
		}
		break;
		
		
		case 18:
		{
			printf("\n\n>>> %s <<< \n \n",option_18);
		    printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			num_2=1;
			printf("\n");
			for (num = 0; STR_IN_1[num] != '\0'; num++)
			{
				printf("%d  ---  %c  :------  ",num_2,STR_IN_1[num]);
				if(STR_IN_1[num]!='a'&& STR_IN_1[num]!='A'&& STR_IN_1[num]!='e' && STR_IN_1[num]!='E' && STR_IN_1[num]!='i' && STR_IN_1[num]!='I' && STR_IN_1[num]!='o' && STR_IN_1[num]!='O' && STR_IN_1[num]!='u' && STR_IN_1[num]!='U')
                {
                	printf("CONSONANT\n");
				}
				
				else
				{
					printf("VOWEL\n");
				}
				num_2++;
			}
	    } 
		break;
		
		
		case 19:
		{
			printf("\n\n>>> %s <<< \n \n",option_19);
		    printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			num_2=0;
			printf("\n\n\n Number of Vowel(s) in the string [ %s ] is / are  ",STR_IN_1);
			for (num = 0; STR_IN_1[num] != '\0'; num++)
			{
				if(STR_IN_1[num]=='a'||STR_IN_1[num]=='A'||STR_IN_1[num]=='e'||STR_IN_1[num]=='E'||STR_IN_1[num]=='i'||STR_IN_1[num]=='I'||STR_IN_1[num]=='o'||STR_IN_1[num]=='O'||STR_IN_1[num]=='u'||STR_IN_1[num]=='U')
                {
      	            ++num_2;
		    	}
		    }
		    printf("%d",num_2);
	    }
		break;
		
		
		
		case 20:
		{
			printf("\n\n>>> %s <<< \n \n",option_20);
		    printf("Enter the String :- ");
			scanf("%s",&STR_IN_1);
			num_2=0;
			printf("\n\n\n Number of Consonant(s) in the string [ %s ] is / are  ",STR_IN_1);
			for (num = 0; STR_IN_1[num] != '\0'; num++)
			{
				if(STR_IN_1[num]!='a'&& STR_IN_1[num]!='A'&& STR_IN_1[num]!='e' && STR_IN_1[num]!='E' && STR_IN_1[num]!='i' && STR_IN_1[num]!='I' && STR_IN_1[num]!='o' && STR_IN_1[num]!='O' && STR_IN_1[num]!='u' && STR_IN_1[num]!='U')
                {
      	            ++num_2;
		    	}
		    }
		    printf("%d",num_2);
		}
		break;
		
		
				
		
		default:
		{
			system("cls");
			the_end_with_default=1;
			printf("%s \n%s \n%s \n%s \n%s \n%s \n%s \n",seperator_1,seperator_2,seperator_3,seperator_4,seperator_5,seperator_6,seperator_7);
			printf("\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			printf("\n\n\n                      !! Invalid Input !!");
			printf("\n\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n\n");
			printf("%s \n%s \n%s \n%s \n%s \n%s \n%s \n",seperator_7,seperator_6,seperator_5,seperator_4,seperator_3,seperator_2,seperator_1);
		}
		
		
		
	}



    if(the_end_with_default==0)
    {
    	printf("\n\n\n\n<^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><y><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><a><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><s><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
		printf("\n<^><h><^><^><^><^><^><^><^><^>     THANK YOU    <^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><^><^><^><^><^><^><^>                              <^><^><^><^><^><^><^><^>");
	    printf("\n<^><d><^><^><^><^><^><^>     FOR USING THIS PROGRAM   <^><^><^><^><^><^><^><^>");
	    printf("\n<^><e><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><s><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><a><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><i><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>");
	    printf("\n<^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^><^>\n");
    }

}


