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

##

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