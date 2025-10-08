package HashTable;

public class HashTable {
    private DataItem[] hashArray; // массив ячеек хэш-таблицы
    private int arraySize;         // размер хэш-таблицы
    DataItem nonItem = new DataItem(-1);

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
    }

    public void displayTable() {
        System.out.println("Элементы хэш-таблицы");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.print(hashArray[i].getKey() + " ");
            } else {
                System.out.print("** ");
            }
            System.out.println();
        }
    }

    public int hashFunc(int key) { //Хэш-функция
        return key % arraySize;
    }
    public void insert(DataItem item) { // Вставка элемента
        int key = item.getKey(); // Получение ключа
        int hashVal = hashFunc(key); // Хеширование ключа
// Пока не будет найдена
        while (hashArray[hashVal] != null && // пустая ячейка или -1,
                hashArray[hashVal].getKey() != -1) {
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        hashArray[hashVal] = item; // Вставка элемента
    }

    public DataItem delete(int key) { // Удаление элемента данных
        int hashVal = hashFunc(key); // Хеширование ключа
        while (hashArray[hashVal] != null) { // Пока не будет найдена пустая ячейка
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal]; // Временное сохранение
                hashArray[hashVal] = nonItem; // Удаление элемента
                return temp; // Метод возвращает элемент
            }
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        return null; // Элемент не найден
    }

    public DataItem find(int key) {// Поиск элемента с заданным ключом
        int hashVal = hashFunc(key); // Хеширование ключа
        while (hashArray[hashVal] != null) { // Пока не будет найдена пустая ячейка
            if (hashArray[hashVal].getKey() == key) return hashArray[hashVal]; // Да, вернуть элемент
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        return null; // Элемент не найден
    }
}
