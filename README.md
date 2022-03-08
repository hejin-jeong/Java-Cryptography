# Cryptography Program

Cryptography provides an excellent example of where multiple strategies can be used to accomplish the
same task. Encryption algorithms have existed since ancient times, and there have been many algorithms
developed. There are two tasks to perform:
- Encrypt some text to produce a cipher text.
- Decrypt some cipher text to produce plain text. 


I used the Strategy pattern to provide a simple application that can encrypt and decrypt text, allowing the user to choose which encryption strategy to use from a menu.

## 1. Copy
This is not an encryption strategy, but copies the same text passed in for both encyption and decryption methods.

## 2. Caesar Cipher
The Caesar cipher encrypts the text by shifting each letter by a constant amount of positions later in ASCII, which is selected by the user.

## 3. Scytale Cipher
The Scytale cipher uses transposition rather than substitution, meaning that it changes the order of letters. This algorithm works by first writing the letters in rows with a fixed number of
columns which is selected by the user.

## 4. Reverse Caesar Cipher
The Reverse Caesar cipher uses transposition and substitution. This encryption algorithm works by first reversing the letters of the strings and then applying caesar on the reversed string.
