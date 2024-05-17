class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagram=new ArrayList<>();
    // we want to traverse through the string and put it 
    // each key of the table is the sorted version of a string and 
    // each value is a list of anagrams
        HashMap<String,List<String>> map=new HashMap<>();
        for(String curr:strs) // traverse the string and put them into the hashmaps
        {
           char[] character=curr.toCharArray(); // make a char array 
           Arrays.sort(character);// sort it
           String sorted=new String(character); // we convert the character array to string adn check it if it is present
           if(!map.containsKey(sorted))
           {
               map.put(sorted,new ArrayList<>()); // if it doesnot contain what you do is create a new arryList put it
           }
           map.get(sorted).add(curr);// else you get and and put the curent
        }

        groupedAnagram.addAll(map.values());
        return groupedAnagram;

    }
}
