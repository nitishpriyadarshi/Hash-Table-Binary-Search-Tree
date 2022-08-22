package Bridgelab.findFrequencylargePaqragraph;

public class hasTableMain {
    public static void main(String[] args) {

        hashTable<String, Integer> hashTable = new hashTable<>();

        String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] value = message.toLowerCase().split(" ");

        for (String word : value) {
            //System.out.print(word);
            Integer val = hashTable.get(word);

            if (val == null)
                val = 1;
            else
                val = val + 1;
            hashTable.add(word, val);
        }
        //System.out.println(value);
        System.out.println(hashTable);
    }
}
