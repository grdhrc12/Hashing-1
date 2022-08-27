
//Time complexity: O(NKLOGK) where N is the lengthof strs and k is thelength of each string in strs 
//space complexity: O(NK) IS THE TOTAL INFORMATION STORED IN map


import java.util.*;
class Solution
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        if(strs==null || strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<String,List> map=new HashMap<>();
        for(String s:strs)
        
        {
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            String key=String.valueOf(ca);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);



        }

        return new ArrayList<>(map.values());

   } 
}