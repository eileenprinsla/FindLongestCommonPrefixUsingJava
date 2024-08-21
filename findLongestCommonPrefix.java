import java.util.*;
public class findLongestCommonPrefix{
    public static void main(String[] args)
	{
		String strs[] = { "flower", "flow" , "flight"};
		char[] arr0 = new char[strs[0].length()];
        char[] arr1 = new char[strs[1].length()];
        char[] arr2 = new char[strs[2].length()];        
        arr0 = strs[0].toCharArray();
        arr1 = strs[1].toCharArray();
        arr2 = strs[2].toCharArray();
        int min=100;
        for(int i=0;i<3;i++)
        {
            if(min > strs[i].length()){
                min = strs[i].length();
            }
        }
        ArrayList<Character> l =new ArrayList<Character>();
        int i=0;
        while(i<min)
        {
           
                if(arr0[i]==arr1[i] & arr0[i]==arr2[i])
                {
                    l.add(arr0[i]);
                    i++;   
                } 
                else
                {
                    break; 
                }            
        }
        System.out.println("Result:");
        for(int m=0;m<l.size();m++){
            System.out.print(l.get(m));
        }
        }
        }