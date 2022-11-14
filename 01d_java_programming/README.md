# Memulai Pemrograman Dengan Java

## Instalasi & Konfigurasi
* Intsalasi Java
    * Downlod [Java Versi 8](https://www.oracle.com/java/technologies/downloads/#java8) sesuai OS yang digunakan
    * Lakukan Instalasi dan atur PATH Environment Variable (`C:\Program Files\Java\jdk1.8.0\bin`)
    * Cek pada CMD dengan perintah `java -version` dan `javac -version `

* Instalasi IDE
    * Download [IntelliJ](https://www.jetbrains.com/idea/download/) bisa pilih yang community (Gratis) 
    * Lakukan Instalasi secara default
    * Selain installed IDE, terjadap pula Online IDE seperti [Glot.io](https://glot.io/) atau [Replit](https://repl.it/)

## Hello World
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```
* Penjelasan
    * `public class Main` adalah deklarasi class saat kita membuat Java Class dengan nama Main
    * `public static void main(String[] args)` merupakan deklarasi function main
        * `public` keyword agar function dapat diakses secara umum
        * `static` keyword untuk 
        * `void` keyword untuk menandakan bahwa function tidak mengembalikan nilai
        * `main` merupakan nama fucntion, function main adalah default function yang harus ada untuk menjalankan aplikasi
        * `String[]` merupakan tipe data dari argumen (args) berupa Array String
        * `args` merupakan variable argumen, namanya bisa sapa saja namun biasanya digunakan `args` atau `argv`
    * `System.out.println("Hello, World!")` merupakan class System dengan property out dan method println() untuk menampilkan string

## Struktur Dasar
* Package
* Import
* Classpath
* Pemaketan

## Tipe Data
* Tipe Data Primitif
    * Byte
        * Merupakan Integer 8 Bit (-128 s.d. 127)
    ```java
    byte value = 10;
    byte anotherValue = -10;
    ```

    * Short
    * Merupakan Integer 16 Bit (-32.768 s.d. 32.767)
    ```java
    short value = 15000;
    short anotherValue = -20000;
    ```

    * Int
        * Merupakan Integer 32 Bit (-2.147.483.648 s.d. 2.147.483.647)
    ```java
    int value = 150000;
    int anotherValue = -200000;
    ```

    * Long
        * Merupakan Integer 64 Bit (-9.223.372.036.854.775.808 s.d. 9.223.372.036.854.775.807)
    ```java
    long value = 150000L;
    long anotherValue = -200000L;
    ```

    * Float
        * Merupakan tipe data untuk menampung angka desimal, nlai defaulnyt `0.0f`
    ```java
    float value = 3.5f;
    ```

    * Double
        * Merupakan tipe data untuk menampung angka desimal, nlai defaulnyt `0.0d`
    ```java
    double value = 5.0;
    ```

    * Boolean
        * Merupakan tipe data yang hanya memiliki 2 macam nilai yaitu true dan false, nlai defaulnyt `false`
    ```java
    boolean value = true;
    boolean anotherValue = false;
    ```

    * Char
        * Merupakan tipe data untuk menampung 1 karakter, dibungkus dengan `' '`
    ```java
    char item = 'A';
    ```

* Tipe Data Reference
    * Merupakan sebuah tipe data yang merujuk ke sebuah objek atau instance dari sebuah class
        * String
            * Tipe data string menunjuk ke instance dari class `java.lang.String`
        ```java
        String nama = "Budi Darmawan";
        ```
        
        * User Defined Data Type (Tipe Data Buatan)
            * Ketika kita memiliki sebuah kelas User, kita bisa membuat variabel baru dengan tipe data class User tersebut
        ```java
        User user = new User();
        ```

##
##

# Heading 1 / Judul Utama (gunakan #)

## Heading 2 / Sub Judul (gunakan ##)

Text biasa (ditulis biasa tanpa format apapun)

[Hyperlink](https://www.google.com) (nama hyperlink dibungkus kurung siku, urlnya dibungkus tanda kurung biasa)

```bash
git add .
git commit -m "baris code menggunakan backtick 3x di awal(sertakan bahasanya) dan akhir code"
git push
```

Untuk `menyoroti` bungkus text dengan backtick 1x

# Template

## Sub Judul 
```<bahasa>
git add .
git commit -m 'Update README.md'
git push

```

```kotlin

```

Update README.md