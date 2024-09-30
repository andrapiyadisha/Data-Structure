import java.util.Random;

public class P88_HashingArray {

    public static int hashFunction(int x) {
        return (x % 18) + 2; 
    }

    public static void insertIntoHashTable(int[] hashTable, int value) {
        int index = hashFunction(value); 
        int originalIndex = index;
        
        while (hashTable[index] != 0) {
            index = (index + 1) % hashTable.length;
            if (index == originalIndex) {
                System.out.println("Hash table is full!");
                return;
            }
        }
        hashTable[index] = value; 
    }

    public static void main(String[] args) {
        int[] hashTable = new int[20];  
        Random rand = new Random();
        int count = 0;


        while (count < 15) {
            int value = 100000 + rand.nextInt(900000);  
            insertIntoHashTable(hashTable, value);
            count++;
        }

        System.out.println("Final values in the hash table:");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }
}
