package ReanneEscotaCountingDuplicateCharacters;

public class CountingDuplicateCharacters {

  public static void main(String[] args) {
   String string1 = "reanne";  
     int count;  
          
  char string[] = string1.toCharArray();  
          
  System.out.println("Duplicate characters in a given string: ");  
  System.out.println();
          
   for(int i = 0; i <string.length; i++) 
   {  
  count = 1;  
  for(int j = i+1; j<string.length; j++)               {  
     if(string[i] == string[j]&& string[i] != ' ') {  
                    count++;  
                    
  string[j] ='0';  
                }  
            }  
            
      if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
   
       }  
    }  
  
  
  
  }

