/* Create a class named ‘Pack1’. Define a method named ‘protected void display(){….}’
inside this class. Declare this class inside a package “com.juet”. Compile it. Make
another class ‘Pack2’ having main method in itself inside a package “com.jiet”. Try
creating object of ‘Pack1’ inside the main method of Pack2. Notice the errors and rectify
them. Again compile the class */

package com.juet;

public class Pack1 {
    protected void display() {
        System.out.println("Hello");
    }
}

// package com.jiet;

// import com.juet.Pack1;

// public class Pack2 {
//     public static void main(String[] args) {
//         Pack1 pack1 = new Pack1();
//         pack1.display();
//     }
// }
