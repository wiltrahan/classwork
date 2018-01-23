/*
LINKEDLIST
Can contain duplicate elements
Maintains insertion order
Non synchronized
Manipulation is fast because no shifting needs to be occurred
Can be used as list, stack or queue
*/
LinkedList<String> foods = new LinkedList<String>();
foods.add("Burgers");
foods.add("Pizza");
foods.add("Cookies");
foods.get(1); //"Pizza"
foods.set(2, "Pie");// the third element is now "Pie";
