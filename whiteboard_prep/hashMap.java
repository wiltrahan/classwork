/*
HASHMAP
HashMap is a map based collection class that is used for storing key & value pairs.
It is not an ordered collection so it doesn't return the keys and values in the same order in which they have been inserted into the HashMap.
An advantage of using HashMap is that you can retrieve objects on constant time 0(1) IF you know the key.
*/

//HashMap called nameAndAge declared
HashMap<String, Integer> nameAndAge = new HashMap();

//3 elements added to the hashmap
nameAndAge.put("Wil", 38);
nameAndAge.put("Frankie", 4);
nameAndAge.put("Jessica", 34);

String key = "Wil";
Integer value = nameAndAge.get(key); //value is 38
nameAndAge.size(); // 3
nameAndAge.containsKey("Joe"); //false
nameAndAge.containsKey("Frankie"); //true
nameAndAge.containsValue(34); //true
nameAndAge.empty(); //false

//ITERATING OVER THE HASHMAP -- In order to use Iterator, we first need the set of keys, which can be retrieved using the .keySet() method.
Iterator<Integer> keySetIterator = nameAndAge.keySet().iterator();
while(keySetIterator.hasNext()) {
  String key = keySetIterator.next();
  System.out.println("key: " + key + " value: " + nameAndAge.get(key));
}
//key: Wil value: 38
//key: Frankie value: 4
//key: Jessica value: 34


/*
METHODS AVAILABLE IN HASHMAP CLASS
void clear(): It removes all the key and value pairs from the specified Map.
Object clone(): It returns a copy of all the mappings of a map and used for cloning them into another map.
boolean containsKey(Object key): It is a boolean function which returns true or false based on whether the specified key is found in the map.
boolean containsValue(Object Value): Similar to containsKey() method, however it looks for the specified value instead of key.
Value get(Object key): It returns the value for the specified key.
boolean isEmpty(): It checks whether the map is empty. If there are no key-value mapping present in the map then this function returns true else false.
Set keySet(): It returns the Set of the keys fetched from the map.
value put(Key k, Value v): Inserts key value mapping into the map. Used in the above example.
int size(): Returns the size of the map – Number of key-value mappings.
Collection values(): It returns a collection of values of map.
Value remove(Object key): It removes the key-value pair for the specified key. Used in the above example.
void putAll(Map m): Copies all the elements of a map to the another specified map.
*/
