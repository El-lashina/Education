package HashTable;

public class HashTableExample {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.insert(new DataItem(10));
        hashTable.insert(new DataItem(50));
        hashTable.insert(new DataItem(10));
        hashTable.insert(new DataItem(0));

        hashTable.displayTable();

        System.out.println();

        System.out.println(hashTable.hashFunc(1247233941));
        System.out.println(hashTable.hashFunc(1160460865));
        System.out.println(hashTable.hashFunc(1));
        System.out.println(hashTable.hashFunc(2));
        System.out.println(hashTable.find(10).hashCode());
        System.out.println(hashTable.find(50));


    }
}
