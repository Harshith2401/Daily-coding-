/*Next up.. interesting question.. on a very high level, this is how Google search works.. 
Qsn:
You have 10 documents with text in it. 
Let's say: 
Doc A : " Hello, I'm document one. How are you doing..... My writer is khushi"
Doc B : " ... "
.
.
.. 
10 such documents...
Given a query "Khushi writes well" 
You print the documents in the order of score.
If Khushi word is present in a particular doc x times, increase doc_score by x.. and keep repeating..*/
import java.util.*;
class search
{
    public static void main(String args[])
    {
        String docs[]={"hello iam string one .how are you doing ..my writer is khushi",
        "hey hello",
        "hello iam string one .how are you doing ..khushi is writing",
        "hello iam string one .how are you doing ..my writer is khushi.khushi is great writer",
        "hello iam string one .how are you doing ..my writer is khushi,khushi is good girl,khushi as greate taste"};
        String target="khushi is writing";
        HashMap<String,Integer>map=new HashMap<>();// creation of hashmap.
        for(String doc:docs)
        {
            int result=Searchof(doc,target);
            map.put(doc,result);
        }
       List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println("Document: \"" + entry.getKey() + "\" - Count of '" + target + "': " + entry.getValue());
        }

    }
    // method to find the scoe of each string.
    public static int Searchof(String doc,String target)
    {
        int count=0;
        int index=0;
        while((index=doc.indexOf(target,index))!=-1)// indexOF is function which checks the target at the given index.
        {
            count++;
            index+=target.length();
        }
        return count;
    }
}
//DEEP EXPLANATION OF CODE AS WE USED MANY BUILT IN FUNCTIONS
/*CONDITION----The loop condition is while ((index = doc.indexOf(target, index)) != -1).
Here doc.indexOf(target, index) searches for the target string starting from the current index.
If it finds target it returns the position (index) where it starts in the doc. If it doesnt find it it returns -1. 

If the condition is true (meaning the target was found):
count++: This increases the count by 1 noting that we found another occurrence of target.
index += target.length(); This updates index to be just after the last found occurrence of target This way the next search will start right after the found index

//List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
We start with a HashMap where each key is a document and each value is the count of how many times the target string appears in that document.
We convert this map into a list of entries (key-value pairs) so that we can sort it.

//sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
We sort the list of entries by their values (the counts) in descending order, meaning that entries with higher counts will come first.

map.entrySet():
This method returns a set of all the entries in the map An entry is a key-value pair in the map where the key is a document string, and the value is the 
count of occurrences of the target string in that document.
For example if map contains {doc1-> 3,doc2-> 1 } then map.entrySet() will return a set containing two entries: [doc1 -> 3, doc2 -> 1]
new ArrayList<>(...):

This creates a new ArrayList and initializes it with the entries from map.entrySet().
Essentially, it converts the set of entries into a list of entries
An ArrayList is chosen because lists can be easily sorted, whereas sets cannot.

map.entrySet():
This method returns a set of all the entries in the map An entry is a key-value pair in the map where the key is a document string and the value is the count of occurrences of the target string in that document.
For example, if map contains { doc1 -> 3, doc2 -> 1 } then map.entrySet() will return a set containing two entries: [doc1 -> 3, doc2 -> 1].

new ArrayList<>(...):
This creates a new ArrayList and initializes it with the entries from map.entrySet()
Essentially it converts the set of entries into a list of entries
An ArrayList is chosen because lists can be easily sorted whereas sets cannot.

sortedEntries.sort(...):
This calls the sort method on the sortedEntries list to sort its elements.

Map.Entry.comparingByValue(...):
This is a method that provides a comparator to compare Map.Entry objects by their values.
An Entry object in this context is a key-value pair from the map. The value here is the count of occurrences of the target string in a document.
For example, if we have entries [doc1-> 3,doc2-> 1], this comparator compares 3 and 1.

Comparator.reverseOrder():
This creates a comparator that sorts values in reverse descending order.
Normally, comparingByValue would sort in ascending order smallest to largest Wrapping it in reverseOrder flips this, so it sorts from largest to smallest.*/
